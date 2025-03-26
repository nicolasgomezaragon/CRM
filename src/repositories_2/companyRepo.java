package repositories;

import models.Company;
import org.springFramework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    
}