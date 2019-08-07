package pe.promart.repository;

import pe.promart.model.Client;

import java.util.List;

public interface ClientDataRepository {
    Client pushClient(Client client);
    List<Client> getClients();
}