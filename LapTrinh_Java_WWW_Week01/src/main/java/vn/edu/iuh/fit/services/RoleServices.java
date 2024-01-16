package vn.edu.iuh.fit.services;

import vn.edu.iuh.fit.models.Role;
import vn.edu.iuh.fit.repositories.RoleRepository;

import java.util.List;

public class RoleServices {
    private static RoleRepository RoleDao = new RoleRepository();

    public static void insertRole(Role role) {
        RoleDao.insertRole(role);
    }

    public static List<Role> getRoles() {
        return RoleDao.getRoles();
    }
}