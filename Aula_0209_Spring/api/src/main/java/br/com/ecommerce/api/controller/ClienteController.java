package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.Cliente;
import br.com.ecommerce.api.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Avisando para o Spring que isso é um controller
@RestController

@RequestMapping("/api/clientes")
public class ClienteController {
    //Controller depende de Service
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteServi) {
        this.clienteService = clienteServi;
    }

    // porta de entrada para um metodo, que pega os dados do banco de dados
    @GetMapping
    public ResponseEntity<List<Cliente>> listaCliente(){
        //Pegar a lista de clientes
        List<Cliente> clientes = clienteService.listarClientes();
        return ResponseEntity.ok(clientes);
    }

    @PostMapping
    public ResponseEntity<Cliente> cadastrarCliente(
            @RequestBody Cliente clienteNovo
    ){
        //1. Tentar cadastrar o cliente
        clienteService.cadastrarCliente(clienteNovo);
        //Codigo 200 - OK
        //return ResponseEntity.ok(clienteNovo);
        //Codigo 201 - CREATED
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteNovo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarClientePorId(@PathVariable Integer id){
        Cliente cliente = clienteService.clientePorId(id);

        if (cliente == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizarClientePorId(@PathVariable Integer id, @RequestBody Cliente cliente){
        Cliente clienteAtualizado = clienteService.atualizarCliente(id, cliente);

        if(clienteAtualizado == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(clienteAtualizado);
    }
}
