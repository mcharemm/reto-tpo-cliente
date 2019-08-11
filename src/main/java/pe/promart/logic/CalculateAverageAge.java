package pe.promart.logic;

import pe.promart.model.Client;

import java.util.List;

public class CalculateAverageAge {

    public static Double getAverageAge(List<Client> clients) {

        Integer size = clients.size();

        if(size == 0) {
            return 0d;
        }

        Double result = 0d;

        for(Client item: clients) {
            result = result + item.getAge();
        }

        return result/size;
    }
}
