package vn.edu.iuh.fit.frontend.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.edu.iuh.fit.backend.models.Product;
import vn.edu.iuh.fit.backend.repositories.ProductRepository;
import vn.edu.iuh.fit.backend.services.ProductService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class HomeController {
    @Autowired
    private ProductService productServices;
    @Autowired
    private ProductRepository productRepository;

//    @GetMapping("/login")
//    public String showViewLogin(Model model){
//        model.addAttribute("name", "user");
//        model.addAttribute("password", "password");
//        return "login";
//    }

    @GetMapping("/check-login")
    public String checkLogin(Model model,
                             @RequestParam("name") String name,
                             @RequestParam("password") String password
    ){

        if(name.isEmpty() || password.isEmpty()) return "redirect:/login";

        if(name.equals("admin")) return "login";
        else if(name.equals("user")) return "redirect:/product/by";
        else return "redirect:/login";
    }

    @GetMapping("/login")
    public String login(){
        return "client/login";
    }

    @GetMapping("/product/1")
    public String productDetail(){
        return "client/product-detail";
    }
    @GetMapping({"", "/", "/client/products"})
    public String home(HttpSession session, Model model,
                       @RequestParam("page") Optional<Integer> page,
                       @RequestParam("size") Optional<Integer> size) {
        int currentPage = page.orElse(0);
        int pageSize = size.orElse(8);
        Page<Product> productPage = productServices.findPaginated(currentPage, pageSize, "productId", "asc");
        for (Product product : productPage.getContent()
        ) {
            System.out.println(product);
        }
        model.addAttribute("productPage", productPage);

        int totalPages = productPage.getTotalPages();
        if(totalPages>0){
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }

        return "client/index";
    }

}
