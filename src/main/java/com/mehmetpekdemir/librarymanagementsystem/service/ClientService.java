package com.mehmetpekdemir.librarymanagementsystem.service;

import com.mehmetpekdemir.librarymanagementsystem.entity.Client;
import com.mehmetpekdemir.librarymanagementsystem.entity.ClientLogin;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    void addClient(Client client);

    List<Client> getAllClient();

    public Optional<Client> updateClient(Integer id, Client client);

    void deleteClient(Integer id);

    Object getById(Integer id);

    public ClientLogin getClientLogin(String cemail);
}
