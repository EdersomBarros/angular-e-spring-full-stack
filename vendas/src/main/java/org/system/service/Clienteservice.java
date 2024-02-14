package org.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.system.model.Cliente;
import org.system.repository.Clientesrepository;

@Service
public class Clienteservice {
    @Autowired
    private Clientesrepository repository;

    public Clienteservice(Clientesrepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);

    }
    public void validarCliente(Cliente cliente){
    //Aplicações
    }
}
