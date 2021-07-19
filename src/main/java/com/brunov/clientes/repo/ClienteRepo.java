package com.brunov.clientes.repo;

import com.brunov.clientes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepo extends JpaRepository<Cliente, Long> {
    void deleteClienteById(Long id);

    Optional<Cliente> findClienteById(Long id);
}
