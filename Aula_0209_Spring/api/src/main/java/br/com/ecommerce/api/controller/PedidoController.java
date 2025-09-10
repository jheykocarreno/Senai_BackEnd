package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.Pedido;
import br.com.ecommerce.api.service.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoServ) {
        this.pedidoService = pedidoServ;
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> listaPedidos(){
        List<Pedido> pedidos = pedidoService.listarTodosPedidos();
        return ResponseEntity.ok(pedidos);
    }

    @PostMapping
    public ResponseEntity<Pedido> cadastrarPedido(@RequestBody Pedido pedido){
        return ResponseEntity.status(HttpStatus.CREATED).body(pedidoService.cadastrarPedido(pedido));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscarPedidoPorId(@PathVariable Integer id){
        Pedido pedido = pedidoService.buscarPedidoPorId(id);

        if(pedido == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(pedido);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pedido> atualizarPedidoPorId(@PathVariable Integer id, @RequestBody Pedido pedido){
        Pedido pedidoAtual = pedidoService.atualizarPedido(id, pedido);

        if(pedidoAtual == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(pedidoAtual);
    }
}
