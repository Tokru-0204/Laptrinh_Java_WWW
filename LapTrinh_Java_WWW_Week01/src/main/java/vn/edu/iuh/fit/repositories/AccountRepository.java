package vn.edu.iuh.fit.repositories;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import vn.edu.iuh.fit.db.ConnectDB;
import vn.edu.iuh.fit.models.Account;

public class AccountRepository {
    private EntityManager em;

    public AccountRepository() {
        em = ConnectDB.getInstance().getEmf().createEntityManager();
    }

    public void insertAccount(Account account) {
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        try {
            em.merge(account);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            System.out.println(e.getMessage());
        }
    }

    public Account searchAccount(String id) {
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        try {
            Account account = em.find(Account.class, id);
            tr.commit();
            return account;
        } catch (Exception e) {
            tr.rollback();
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void dellAccount(String id) {
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        try {
            Account account = em.find(Account.class, id);
            em.remove(account);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            System.out.println(e.getMessage());
        }
    }

    public List<Account> getAccounts() {
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        try {
            String sql = "select * from Account";
            List<Account> rl = em.createNativeQuery(sql, Account.class).getResultList();

            tr.commit();
            return rl;
        } catch (Exception e) {
            tr.rollback();
            System.out.println(e.getMessage());
        }
        return null;
    }
}