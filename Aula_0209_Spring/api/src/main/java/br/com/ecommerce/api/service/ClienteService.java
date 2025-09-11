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

        if(cliente.isEmpty()){
            return null;
        }

        return cliente.get();
    }

    public Cliente atualizarCliente(Integer id, Cliente cl){
        Cliente clienteExiste = clientePorId(id);

        if (clienteExiste == null){
            return null;
        }


        clienteExiste.setNomeCompleto(cl.getNomeCompleto());
        clienteExiste.setSenha(cl.getSenha());
        clienteExiste.setTelefone(cl.getTelefone());
        clienteExiste.setDataCadastro(cl.getDataCadastro());
        return clienteRepository.save(clienteExiste);
    }

    public Cliente deleteCliente(Integer id) {
        Cliente clienteExiste = clientePorId(id);

        if (clienteExiste == null){
            return null;
        }
        clienteRepository.delete(clienteExiste);
        return clienteExiste;
    }
}
