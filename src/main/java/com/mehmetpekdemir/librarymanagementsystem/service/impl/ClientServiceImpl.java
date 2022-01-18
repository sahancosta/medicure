package com.mehmetpekdemir.librarymanagementsystem.service.impl;

import com.mehmetpekdemir.librarymanagementsystem.entity.Client;
import com.mehmetpekdemir.librarymanagementsystem.entity.ClientLogin;
import com.mehmetpekdemir.librarymanagementsystem.repository.ClientRepository;
import com.mehmetpekdemir.librarymanagementsystem.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public  void addClient(Client client){clientRepository.save(client);}

    @Override
    public List<Client> getAllClient() {
        List<Client> clientsList = new ArrayList<>();
        clientRepository.findAll().forEach(clientsList::add);
        return clientsList;

    }

    @Override
    public Optional<Client> updateClient(Integer id, Client client) {
        return clientRepository.findById(id).map(e->{
            e.setCname(client.getCname());
            e.setCemail(client.getCemail());
            e.setCaddress(client.getCaddress());
            return e;

        });
    }


    @Override
    public void deleteClient(Integer id) {
        clientRepository.deleteById(id);

    }

    @Override
    public Object getById(Integer id) {
        Optional<Client> cmp = Optional.ofNullable(clientRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid Id")));
        Client client = cmp.get();
        return client;
    }

    @Override
    public ClientLogin getClientLogin(String cemail) {

        Optional<Client> cem = Optional.ofNullable(clientRepository.findClientByCemail(cemail).orElseThrow(()-> new IllegalArgumentException("Invalid Email")));
        ClientLogin clientLogin = cem.get().getClientLogin();
        return clientLogin;
    }
}
