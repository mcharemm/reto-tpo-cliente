package pe.promart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.promart.model.Statistics;
import pe.promart.service.StatisticsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/statistic")
public class StatisticsController {

    @Autowired
    private StatisticsService service;

    @GetMapping("/kpideclientes")
    @ResponseStatus(HttpStatus.OK)
    public Statistics printClientsKpi(){
        return service.getClientsKpi();
    }
}
