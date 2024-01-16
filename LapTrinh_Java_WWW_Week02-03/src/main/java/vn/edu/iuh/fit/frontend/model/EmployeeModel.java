package vn.edu.iuh.fit.frontend.model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.edu.iuh.fit.backend.enums.EmployeeStatus;
import vn.edu.iuh.fit.backend.enums.ProductStatus;
import vn.edu.iuh.fit.backend.models.Customer;
import vn.edu.iuh.fit.backend.models.Employee;
import vn.edu.iuh.fit.backend.services.EmployeeServices;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

public class EmployeeModel {
    private final EmployeeServices services =new EmployeeServices();
    public void insertEmp(HttpServletRequest req, HttpServletResponse resp) throws IOException, InterruptedException {
        String name = req.getParameter("name");
        String s_dob = req.getParameter("dob");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        String address = req.getParameter("address");

        //consert date_string to local)da
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dob = LocalDate.parse(s_dob, formatter);

        Employee employee = new Employee(name, dob, email, phone, address, EmployeeStatus.ACTIVE);

        services.insertEmp(employee);
        resp.sendRedirect("employeeListing.jsp");
    }
    public List<Employee> getAllEmployees() {
        return services.getAll();
    }
    public void deleteEmployee(HttpServletRequest req, HttpServletResponse resp) throws Exception{
        long id =Long.parseLong(req.getParameter("id"));
        services.delete(id);
        resp.sendRedirect("employeeListing.jsp");
    }
    public void updateEmployee(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        long id = Long.parseLong(req.getParameter("id"));
        String name = req.getParameter("name");
        String s_dob = req.getParameter("dob");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        String s_status = req.getParameter("status");

        EmployeeStatus status = EmployeeStatus.valueOf(s_status);
        // convert date_string to LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dob = LocalDate.parse(s_dob, formatter);

        // Retrieve the existing employee by ID
        Optional<Employee> existingEmployee = services.findById(id);

        // Check if the employee exists
        if (existingEmployee.isPresent()) {
            Employee employeeToUpdate = existingEmployee.get();
            // Update the employee properties
            employeeToUpdate.setFullname(name);
            employeeToUpdate.setDob(dob);
            employeeToUpdate.setPhone(phone);
            employeeToUpdate.setEmail(email);
            employeeToUpdate.setAddress(address);
            employeeToUpdate.setStatus(status);
            // Perform the update
            services.updateEmp(employeeToUpdate);

            resp.sendRedirect("employeeListing.jsp");
        }
    }
//    public void listing(HttpServletRequest req, HttpServletResponse resp) throws  Exception{
//        List<Employee> lst = services.getAll();
//
//        HttpSession session = req.getSession(true);
//        session.setAttribute("emp_list",lst);
//        resp.sendRedirect("employeeListing.jsp");
//
////        req.setAttribute("emp_lst",lst);
////        req.getRequestDispatcher("employeeListing.jsp").forward(req,resp);
//    }
}
