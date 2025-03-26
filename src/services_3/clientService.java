package services;

import models.Client;
import repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.utils.List; 

@Service
public class ClientService {
    @Autowired
    private ClientRepository ClientRepository;

    public List<Client> getAllClients() {
        return ClientRepository.findAll();
    }
}