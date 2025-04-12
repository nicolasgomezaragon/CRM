// Contains business logic, performing operations and apply rules or transformations.  

package services;

import models.Client;
import repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.utils.List; 

@Service
public class ClientService {
   
    private final ClientRepository clientRepository;

    // CRUD methods
    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public Client createClient(Client client){
        return ClientRepository.save(client)
    } 

    public Client getClientById(long id){
        return clientRepository.findById(id).orElse(null);
    }

    public List<Client> getAllClients() {
        return ClientRepository.findAll();
    }

    public void deleteClient(long id){
        clientRepository.deletedById(id);
    }

    // Query methods
    public List<Client> getClientsByRole(String role){
        return clientRepository.findByRole(role);
    }

    public List<Client> getClientsByCompany(Long companyId){
        return clientRepository.findByCompany(companyId);
    }
}