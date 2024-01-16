package vn.edu.iuh.fit.repositories;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import vn.edu.iuh.fit.db.ConnectDB;
import vn.edu.iuh.fit.models.GrantAccess;

public class GrantAccessRepository {
    private EntityManager em;

    public GrantAccessRepository() {
        em = ConnectDB.getInstance().getEmf().createEntityManager();
    }

    public void insertGrantAccess(GrantAccess grantAccess) {
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        try {
            System.out.println(grantAccess);
            em.persist(grantAccess);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            System.out.println(e.getMessage());
        }
    }

    public void delete(String id){
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        try {
            String sql = "delete from grant_access where account_id =\""+id+"\"";
            tr.commit();
        } catch (Exception e){
            tr.rollback();
            System.out.println(e.getMessage());
        }
    }

    public GrantAccess searchGrantAccessByAccountId(String id) {
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        try {
            String sql = "select  * from grant_access where account_id=\"" + id + "\"";
            List<GrantAccess> grantAccesses = em.createNativeQuery(sql, GrantAccess.class).getResultList();
            tr.commit();
            return grantAccesses.get(0);
        } catch (Exception e) {
            tr.rollback();
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<GrantAccess> getListGrantAccess() {
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        try {
            String sql = "select * from grant_access";
            List<GrantAccess> rl = em.createNativeQuery(sql, GrantAccess.class).getResultList();

            tr.commit();
            return rl;
        } catch (Exception e) {
            tr.rollback();
            System.out.println(e.getMessage());
        }
        return null;
    }
}