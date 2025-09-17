package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.Cliente;
import br.com.ecommerce.api.model.ItemDoPedido;
import br.com.ecommerce.api.model.Produto;
import br.com.ecommerce.api.service.ItemDoPedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/itens")
public class ItemDoPedidoController {

    private final ItemDoPedidoService itemDoPedidoService;

    public ItemDoPedidoController(ItemDoPedidoService itemDoPedidoService) {
        this.itemDoPedidoService = itemDoPedidoService;
    }

    @GetMapping
    public ResponseEntity<List<ItemDoPedido>> listarItens() {
        List<ItemDoPedido> itens = itemDoPedidoService.listarTodos();

        return ResponseEntity.ok(itens);
    }

    @PostMapping
    public ResponseEntity<ItemDoPedido> cadastrarItem(@RequestBody ItemDoPedido item) {
        itemDoPedidoService.cadastrarItem(item);

        return ResponseEntity.status(HttpStatus.CREATED).body(item);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarItemPorId(@PathVariable Integer id) {
        ItemDoPedido item = itemDoPedidoService.buscarPorId(id);

        if (item == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Item " + id + " não encontrado!");
        }

        return ResponseEntity.ok(item);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarCliente(@PathVariable Integer id) {
        ItemDoPedido item = itemDoPedidoService.deletarItem(id);

        if (item == null) {
            return ResponseEntity.status(404)
                    .body("Item " + id + " não encontrado!");
        }

        return ResponseEntity.ok(item);
    }
}
