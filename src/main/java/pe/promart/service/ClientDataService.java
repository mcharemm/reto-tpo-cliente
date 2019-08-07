package pe.promart.service;

import pe.promart.model.Client;
import pe.promart.model.infoClient;

import java.util.List;

public interface ClientDataService {
    Client createClient(Client client);
    List<infoClient> retrieveClients();
}

