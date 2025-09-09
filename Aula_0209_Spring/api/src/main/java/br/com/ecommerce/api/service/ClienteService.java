package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.Cliente;
import br.com.ecommerce.api.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    //Injeção de Dependencia
    //Falar que Service depende de alguém
    private final ClienteRepository clienteRepository;    //criacao da variavel repositary, com final, sera constante

    //Criamos o construtor, recebendo ClienteRepositary
    public ClienteService(ClienteRepository clienteRepo) {
        this.clienteRepository = clienteRepo;
    }

    //Listar todos os cliente
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Cliente cadastrarCliente(Cliente cl){
        return clienteRepository.save(cl);
    }

    public Cliente clientePorId(Integer id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);

        if(cliente.isPresent()){
            return null;
        }

        return cliente.get();
    }
}
