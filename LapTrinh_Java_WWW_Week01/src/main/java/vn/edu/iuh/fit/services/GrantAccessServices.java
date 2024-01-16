package vn.edu.iuh.fit.services;

import vn.edu.iuh.fit.models.GrantAccess;
import vn.edu.iuh.fit.repositories.GrantAccessRepository;

import java.util.List;

public class GrantAccessServices {
    private static GrantAccessRepository grantAccessDao = new GrantAccessRepository();

    public static void insertGrantAccess(GrantAccess grantAccess) {
        grantAccessDao.insertGrantAccess(grantAccess);
    }

    public static GrantAccess searchGrantAccessByAccountId(String id) {
        return grantAccessDao.searchGrantAccessByAccountId(id);
    }

    public static List<GrantAccess> getListGrantAccess() {
        return grantAccessDao.getListGrantAccess();
    }
}