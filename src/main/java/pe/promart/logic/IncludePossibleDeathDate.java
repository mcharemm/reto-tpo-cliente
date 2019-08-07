package pe.promart.logic;

import pe.promart.model.*;

import java.util.Date;

public class IncludePossibleDeathDate {

    public static infoClient includePossibleDeathDate(Client client) {
        Date clientPossibleDeathDate = CalculatePossibleDeathDate.getPossibleDeathDate(client.getBirthDate());
        return new infoClient(client, clientPossibleDeathDate);
    }

}