package controllers;

import model.Client;
import services.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientService ClientService;

    @GetMapping
    public List<Client> getAllClients(){
        return ClientService.getAllClients();
    }
    
}