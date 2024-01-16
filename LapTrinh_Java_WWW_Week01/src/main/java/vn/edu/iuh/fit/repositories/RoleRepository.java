package vn.edu.iuh.fit.repositories;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import vn.edu.iuh.fit.db.ConnectDB;
import vn.edu.iuh.fit.models.Role;

public class RoleRepository {
    private EntityManager em;

    public RoleRepository() {
        em = ConnectDB.getInstance().getEmf().createEntityManager();
    }

    public void insertRole(Role role) {
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        try {
            em.merge(role);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            System.out.println(e.getMessage());
        }
    }

    public List<Role> getRoles() {
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        try {
            String sql = "select * from role";
            List<Role> rl = em.createNativeQuery(sql, Role.class).getResultList();

            tr.commit();
            return rl;
        } catch (Exception e) {
            tr.rollback();
            System.out.println(e.getMessage());
        }
        return null;
    }
}