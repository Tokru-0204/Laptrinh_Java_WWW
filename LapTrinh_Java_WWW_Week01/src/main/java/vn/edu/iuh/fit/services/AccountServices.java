package vn.edu.iuh.fit.services;

import vn.edu.iuh.fit.models.Account;
import vn.edu.iuh.fit.models.GrantAccess;
import vn.edu.iuh.fit.models.Role;
import vn.edu.iuh.fit.repositories.AccountRepository;
import vn.edu.iuh.fit.repositories.GrantAccessRepository;
import vn.edu.iuh.fit.repositories.RoleRepository;

import java.util.List;

public class AccountServices {
    private static AccountRepository accountDao = new AccountRepository();

    public static void insertAccount(Account account) {
        accountDao.insertAccount(account);
        RoleRepository roleDao = new RoleRepository();
        Role role = new Role("user", "user role", "", (byte) 1);
        roleDao.insertRole(role);

        GrantAccessRepository grantAccessDao = new GrantAccessRepository();
        GrantAccess grantAccess = new GrantAccess(true, "", account, role);
        grantAccessDao.insertGrantAccess(grantAccess);
    }

    public static Account searchAccount(String id) {
        return accountDao.searchAccount(id);
    }

    public static void dellAccount(String id) {
        accountDao.dellAccount(id);
        GrantAccessRepository grantAccessDao = new GrantAccessRepository();
        grantAccessDao.delete(id);
    }

    public static List<Account> getAccounts() {
        return accountDao.getAccounts();
    }
}