package com.mehmetpekdemir.librarymanagementsystem.controller;

import com.mehmetpekdemir.librarymanagementsystem.entity.Client;
import com.mehmetpekdemir.librarymanagementsystem.entity.ClientLogin;
import com.mehmetpekdemir.librarymanagementsystem.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;
    @RequestMapping(method = RequestMethod.POST,value = "/addClient")
    public void addClient(@RequestBody Client client) {
        System.out.print(client.getCname());
        clientService.addClient(client);
    }
//    @RequestMapping(method = RequestMethod.GET, value = "getClientbyid/{id}")
//    public Client getClientById(@PathVariable Integer id){
//        return clientService.getById(id);
//    }
    @RequestMapping("/getAllClients")
    public List<Client> getAllClient(){
        return clientService.getAllClient();
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/updateClient/{id}")
    public void updateClients(@PathVariable Integer id, @RequestBody Client client){
        clientService.updateClient(id,client);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getClientLogin/{cemail}")
    public ClientLogin getClientLogin( @PathVariable String cemail){
        return clientService.getClientLogin(cemail);

    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/deleteClient/{id}")
    public void deleteClient(@PathVariable Integer id){clientService.deleteClient(id);}

}
