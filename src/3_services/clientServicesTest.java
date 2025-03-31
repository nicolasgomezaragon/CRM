package services;

import models.Client;
import repositories.ClientRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ClientserviceTest{
    @Mock
    private ClientRepository clientRepository;

    @InjectMocks
    private ClientService clientService;

    @BeforeEach 
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateClient() {
        Client client = new Client();
        client.setName("John Doe");

        when(ClientRepository.save(client)).thenReturn(client);

        Client createClient = clientService.createClient(client);

        assertNotNull(createdClient);
        assertEquals("John Doe", createdClient.getName());
        verify(clientRepository, times(1)).saveClient();
    }

    @Test
    public void testGetClient(){
        Client client = new Client();
        client.setId(1L);
        client.setName("John Doe");
    }

    when(clientRepository.findById(1L)).thenReturn(Optional.of(client));

        Client foundClient = clientService.getClientById(1L);

        assertNotNull(foundClient);
        assertEquals(1L, foundClient.getId);
        assertEquals("John Doe", foundClient.getName());
        verify(clientRepository, times(1).findById(1L));
}
