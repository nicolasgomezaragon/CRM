// Handle data access

package repositories;
import models.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findByRole(string role);
    List<Client> findByCompany(string companyId);
}