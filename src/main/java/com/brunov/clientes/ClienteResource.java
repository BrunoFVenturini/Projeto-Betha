package com.brunov.clientes;

import com.brunov.clientes.model.Cliente;
import com.brunov.clientes.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {
    private final ClienteService clienteService;

    public ClienteResource(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Cliente>> buscaClientes (){
        List<Cliente> clientes = clienteService.retornaTodosClientes();
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Cliente> buscaClientesPorId (@PathVariable("id") Long id){
        Cliente cliente = clienteService.buscaClientePorId(id);
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Cliente> adicionaCliente(@RequestBody Cliente cliente){
        Cliente newCliente = clienteService.adicionaCliente(cliente);
        return new ResponseEntity<>(newCliente, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Cliente> atualizaCliente(@RequestBody Cliente cliente){
        Cliente updatedCliente = clienteService.atualizaCliente(cliente);
        return new ResponseEntity<>(updatedCliente, HttpStatus.OK);
    }

    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> deletaCliente(@PathVariable("id") Long id){
        clienteService.deletaCliente(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
