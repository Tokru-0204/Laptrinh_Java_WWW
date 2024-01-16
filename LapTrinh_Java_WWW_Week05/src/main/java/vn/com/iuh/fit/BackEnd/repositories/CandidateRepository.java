package vn.com.iuh.fit.BackEnd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.iuh.fit.BackEnd.models.Candidate;

//@RepositoryRestResource(collectionResourceRel = "candidates", path = "candidates")
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
