package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.ItemDoPedido;
import br.com.ecommerce.api.service.ItemDoPedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
@RequestMapping("/api/itemdopedido")
public class ItemDoPedidoController {

    private final ItemDoPedidoService itemDoPedidoService;

    private ItemDoPedidoController(ItemDoPedidoService itemDoPedidoServ){
        this.itemDoPedidoService = itemDoPedidoServ;
    }

    @GetMapping
    public ResponseEntity<List<ItemDoPedido>> listarItemDoPedido(){
        List<ItemDoPedido> pedidos = itemDoPedidoService.listarPedidos();
        return ResponseEntity.ok(pedidos);
    }

    @PostMapping
    public ResponseEntity<ItemDoPedido> cadastrarPedido(@RequestBody ItemDoPedido itemDoPedido){
        return ResponseEntity.status(HttpStatus.CREATED).body(itemDoPedidoService.cadastrarPedido(itemDoPedido));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemDoPedido> buscarItemDoPedido(@PathVariable Integer id){
        ItemDoPedido itemDoPedido = itemDoPedidoService.itemPorId(id);

        if(itemDoPedido == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(itemDoPedido);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ItemDoPedido> atualizarPedido(@PathVariable Integer id, @RequestBody ItemDoPedido itemDoPedido){
        ItemDoPedido itemAtualizado = itemDoPedidoService.atualizarItem(id, itemDoPedido);

        if (itemAtualizado == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(itemAtualizado);
    }

}
