package vn.com.iuh.fit.BackEnd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.iuh.fit.BackEnd.models.CandidateSkill;
import vn.com.iuh.fit.BackEnd.models.Skill;


public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, Skill> {
}