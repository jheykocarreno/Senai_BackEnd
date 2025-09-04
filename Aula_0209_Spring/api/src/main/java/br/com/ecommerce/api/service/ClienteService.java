package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.Cliente;
import br.com.ecommerce.api.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    //Injeção de Dependencia
    //Falar que Service depende de alguém
    private final ClienteRepository clienteRepository;    //criacao da variavel repositary, com final, sera constante

    //Criamos o construtor, recebendo ClienteRepositary
    public ClienteService(ClienteRepository repo) {
        this.clienteRepository = repo;
    }

    //Listar todos os cliente
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }
}
