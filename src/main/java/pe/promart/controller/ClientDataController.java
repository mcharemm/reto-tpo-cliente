package pe.promart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.promart.model.Client;
import pe.promart.model.infoClient;
import pe.promart.service.ClientDataService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClientDataController {

    @Autowired
    private ClientDataService service;

    @PostMapping("/creacliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Client createClient(@RequestBody Client client){
        return service.createClient(client);
    }

    @GetMapping("/listclientes")
    public List<infoClient> printClientsInfoList(){
        return service.getClients();
    }
}
