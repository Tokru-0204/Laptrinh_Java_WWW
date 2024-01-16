package vn.edu.iuh.fit.mapping;

import vn.edu.iuh.fit.models.Account;
import vn.edu.iuh.fit.models.GrantAccess;
import vn.edu.iuh.fit.models.Role;
import vn.edu.iuh.fit.services.AccountServices;
import vn.edu.iuh.fit.services.GrantAccessServices;
import vn.edu.iuh.fit.services.RoleServices;

public class GrantAccessServices_Test {
    public static void main(String[] args) {
        Account account1 = AccountServices.getAccounts().get(0);
        Account account2 = AccountServices.getAccounts().get(1);
        Role role1 = RoleServices.getRoles().get(0);
        Role role2 = RoleServices.getRoles().get(1);

        GrantAccess grantAccess1 = new GrantAccess(true, "", account2, role1);
        GrantAccess grantAccess2 = new GrantAccess(true, "", account1, role2);

        GrantAccessServices.insertGrantAccess(grantAccess1);
        GrantAccessServices.insertGrantAccess(grantAccess2);

        GrantAccessServices.getListGrantAccess().forEach(i -> System.out.println(i));
    }
}
