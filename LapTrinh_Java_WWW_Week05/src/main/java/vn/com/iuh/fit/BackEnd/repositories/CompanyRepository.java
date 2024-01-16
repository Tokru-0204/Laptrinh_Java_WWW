package vn.com.iuh.fit.BackEnd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.iuh.fit.BackEnd.models.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}