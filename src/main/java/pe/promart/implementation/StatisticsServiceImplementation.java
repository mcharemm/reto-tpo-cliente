package pe.promart.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.promart.logic.CalculateAverageAge;
import pe.promart.logic.CalculateStandarDeviation;
import pe.promart.model.Client;
import pe.promart.model.Statistics;
import pe.promart.repository.ClientDataRepository;
import pe.promart.service.StatisticsService;

import java.util.List;

@Service
public class StatisticsServiceImplementation implements StatisticsService {

    @Autowired
    ClientDataRepository clientRepository;

    @Override
    public Statistics getClientsKpi(){
        List<Client> allClients = clientRepository.findAll();
        Statistics clientsKpi = new Statistics(CalculateAverageAge.getAverageAge(allClients),
                CalculateStandarDeviation.getStandarDeviation(allClients));
        return clientsKpi;
    }
}
