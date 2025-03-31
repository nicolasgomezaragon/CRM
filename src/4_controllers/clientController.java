// Handle incoming requests and responses

package controllers;

import model.Client;
import services.ClientService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService ClientService; // What is final?

    @Autowired
    public ClientController (ClientService ClientService){
        this.ClientService = ClientService;
    }

    @postMapping 
    public Client createClient (@RequestBody Client client){ //
        return ClientService.createClient(client);
    }
    
    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id){
        return clientService.getClientById(id);
    }

    @getMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id){
        return clientService.deleteClient(id);
    }

    @GetMapping("/role/{role}")
    public List<Client> getClientsByRole(@PathVariable String role){
        return clientService.getClientsByRole(role);
    }

    @GetMapping("/company/{company}")
    public List<Client> getClientsByCompany(@PathVariable Long companyId){
        return clientService.getClientsByCompany(companyId);
    }
}