package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.Cliente;
import br.com.ecommerce.api.service.ClienteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
// Rota/Link do CONTROLLER
@RequestMapping("/api/clientes")
@Tag(name = "Clientes", description = "Métodos de Clientes")
public class ClienteController {
    // Controller -> Service
    private final ClienteService clienteService;

    public ClienteController(ClienteService service) {
        clienteService = service;
    }

    // Listar Todos
    @GetMapping
    @Operation(
            summary = "Lista todos os clientes",
            description = "Lista todos os clientes sem nenhuma restrição"
    )
    public ResponseEntity<List<Cliente>> listarClientes() {
        // 1. Pegar a lista de clientes
        List<Cliente> clientes = clienteService.listarTodos();

        return ResponseEntity.ok(clientes);
    }

    @PostMapping
    public ResponseEntity<Cliente> cadastrarCliente(@RequestBody Cliente cliente) {
        clienteService.cadastrarCliente(cliente);

        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }

    // Buscar Cliente por Id
    // GET, POST, PUT, DELETE
    @GetMapping("/{id}")
    // Path Variable -> Recebe um valor no LINK
    // Request Body -> Recebe dados pelo corpo
    public ResponseEntity<?> buscarClientePorId(@PathVariable Integer id) {
        // 1. Procurar e guardar o Cliente
        Cliente cliente = clienteService.buscarPorId(id);

        // 2. Se não encontrar, retorno um erro
        if (cliente == null) {
            // Mais simples:
            // return ResponseEntity.notFound().build();
            // Mais detalhes:
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Cliente " + id + " não encontrado!");
        }

        // 3. Se encontrar, retorno o Cliente.
        return ResponseEntity.ok(cliente);
    }

    // GET, POST, PUT, DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarCliente(@PathVariable Integer id) {
        // 1. Verifico se o cliente existe
        Cliente cliente = clienteService.deletarCliente(id);

        // 2. Se não existir retorno erro
        if (cliente == null) {
            return ResponseEntity.status(404)
                    .body("Cliente " + id + " não encontrado!");
        }

        // 3. Se existir, retorno ok
        return ResponseEntity.ok(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizarCliente(
            @PathVariable Integer id, @RequestBody Cliente clienteNovo) {
        // 1. Tento atualizar o Cliente
        Cliente cl = clienteService.atualizarCliente(id, clienteNovo);

        // 2. Se não achar o Cliente, mostro erro
        if(cl == null) {
            return ResponseEntity.status(404)
                    .body("Cliente não encontrado!");
        }

        // 3. Se achar retorno ok
        return ResponseEntity.ok(cl);
    }
}
