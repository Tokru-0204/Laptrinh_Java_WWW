package vn.edu.iuh.fit.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.services.AccountServices;

import java.io.IOException;

@WebServlet("/DelAccount")
public class DelAccount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, IOException {
        AccountServices.dellAccount(req.getParameter("id"));
        resp.sendRedirect("/LapTrinh_Java_WWW_Week01/ViewAccount");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, ServletException {
        super.doPost(req, resp);
    }
}