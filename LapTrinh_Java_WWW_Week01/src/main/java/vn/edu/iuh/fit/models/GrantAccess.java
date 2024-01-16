package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

@Entity
@Table(name = "`grant_access`")
public class GrantAccess {
    @Id
    @ManyToOne
    @JoinColumn(name = "`account_id`")
    private Account account;

    @Id
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
    @Column(columnDefinition = "bit")
    private boolean is_grant;
    @Column(columnDefinition = "varchar(50)")
    private String note;
    public GrantAccess() {
    }

    public GrantAccess(boolean is_grant, String note, Account account, Role role) {
        this.is_grant = is_grant;
        this.note = note;
        this.account = account;
        this.role = role;
    }

    public boolean isIs_grant() {
        return is_grant;
    }

    public void setIs_grant(boolean is_grant) {
        this.is_grant = is_grant;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "GrantAccess{" +
                "is_grant=" + is_grant +
                ", note='" + note + '\'' +
                ", account=" + account +
                ", role=" + role +
                '}';
    }
}
