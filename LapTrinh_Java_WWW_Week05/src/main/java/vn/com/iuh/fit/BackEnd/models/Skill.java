package vn.com.iuh.fit.BackEnd.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.com.iuh.fit.BackEnd.enums.SkillType;

import java.util.List;

//Read skill list at: https://www.yourdictionary.com/articles/examples-skills-list
//API: https://github.com/workforce-data-initiative/skills-api/wiki/API-Overview#swagger-ui-test-client
@Entity
@Table(name = "skill")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private long id;
    @Column(name = "skill_name", nullable = false, length = 150)
    private String skillName;
    @Column(name = "skill_type", nullable = false)
    private SkillType type;
    @Column(name = "skill_desc", nullable = false, length = 300)
    private String skillDescription;

    //====================
    @OneToMany(mappedBy = "skill")
    private List<JobSkill>jobSkills;

}
