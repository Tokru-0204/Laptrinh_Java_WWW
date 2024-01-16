package vn.com.iuh.fit.BackEnd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.iuh.fit.BackEnd.models.JobSkill;
import vn.com.iuh.fit.BackEnd.models.Skill;

public interface JobSkillRepository extends JpaRepository<JobSkill, Skill> {
}