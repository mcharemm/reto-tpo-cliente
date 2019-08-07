package pe.promart.logic;

import java.util.Date;

public class CalculatePossibleDeathDate {

    private final static Integer AVERAGE_DEATH_AGE = 75;

    public static Date getPossibleDeathDate(Date clientBirthDate){
        return new Date(clientBirthDate.getYear() + AVERAGE_DEATH_AGE, clientBirthDate.getMonth(), clientBirthDate.getDate());
    }

}
