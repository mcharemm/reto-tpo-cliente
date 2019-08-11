package pe.promart.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class infoClient {

    Client client;
    @DateTimeFormat( pattern = "yyyy-MM-dd")
    Date possibleDeathDate;

    public infoClient(Client client, Date possibleDeathDate){
        this.client = client;
        this.possibleDeathDate = possibleDeathDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getPossibleDeathDate() {
        return possibleDeathDate;
    }

    public void setPossibleDeathDate(Date possibleDeathDate) {
        this.possibleDeathDate = possibleDeathDate;
    }
}
