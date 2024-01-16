package vn.edu.iuh.fit.mapping;

import vn.edu.iuh.fit.models.Role;
import vn.edu.iuh.fit.services.RoleServices;


public class RoleServices_Test {
    public static void main(String[] args) {
        Role role1 = new Role("admin", "administrator", "admin role", (byte) 1);
        Role role2 = new Role("user", "user", "user role", (byte) 1);

        RoleServices.insertRole(role1);
        RoleServices.insertRole(role2);
        RoleServices.getRoles().forEach(i -> System.out.println(i));
    }
}
