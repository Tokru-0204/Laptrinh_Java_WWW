package vn.com.iuh.fit.BackEnd.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "company")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "com_id")
    private long id;

    @Column(name = "comp_name", nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "address", nullable = false)
    private Address address;

    @Column(name = "web_url")
    private String webURL;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "about", length = 2000)
    private String about;

    //==================RELATIONSHIPS=====================
    @OneToMany(mappedBy = "company")
//    @JoinColumn(name = "jobs")
    private List<Job> jobs;
}
