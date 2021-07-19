package com.brunov.clientes.service;

import com.brunov.clientes.exception.UserNotFoundException;
import com.brunov.clientes.model.Cliente;
import com.brunov.clientes.repo.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClienteService {
    private final ClienteRepo clienteRepo;

    @Autowired
    public ClienteService(ClienteRepo cienteRepo) {
        this.clienteRepo = cienteRepo;
    }

    public Cliente adicionaCliente(Cliente cliente){
        return clienteRepo.save(cliente);
    }

    public List<Cliente> retornaTodosClientes(){
        return clienteRepo.findAll();
    }

    public Cliente atualizaCliente(Cliente cliente){
        return clienteRepo.save(cliente);
    }

    public void deletaCliente(Long id){
        clienteRepo.deleteClienteById(id);
    }

    public Cliente buscaClientePorId(Long id){
        return clienteRepo.findClienteById(id)
                .orElseThrow(() -> new UserNotFoundException("Cliente com o id:  " + id + " não foi encontrado."));
    }
}
