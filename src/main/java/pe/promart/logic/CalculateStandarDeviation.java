package pe.promart.logic;

import pe.promart.model.Client;

import java.util.List;

public class CalculateStandarDeviation {

    public static Double getStandarDeviation(List<Client> clients) {
        Double mean = CalculateAverageAge.getAverageAge(clients);

        Integer size = clients.size();

        if(size == 1 || size == 0) {
            return 0d;
        }

        return Math.sqrt(clients.stream()
                .mapToDouble(cl -> cl.getAge())
                .map(age -> Math.pow(age - mean, 2))
                .sum() / (size - 1));
    }
}
