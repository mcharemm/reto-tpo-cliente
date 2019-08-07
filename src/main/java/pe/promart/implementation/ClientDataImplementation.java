package pe.promart.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.promart.logic.IncludePossibleDeathDate;
import pe.promart.model.*;
import pe.promart.repository.ClientDataRepository;
import pe.promart.service.ClientDataService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientDataImplementation implements ClientDataService {

    @Autowired
    ClientDataRepository clientRepository;

    @Override
    public Client createClient(Client client){
        return clientRepository.pushClient(client);
    }

    @Override
    public List<infoClient> retrieveClients(){
        List<Client> allClients = clientRepository.getClients();
        List<infoClient> allClientsInfo = allClients.stream()
                .map(IncludePossibleDeathDate::includePossibleDeathDate)
                .collect(Collectors.toList());
        return allClientsInfo;
    }
}
