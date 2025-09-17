package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.Cliente;
import br.com.ecommerce.api.model.Pedido;
import br.com.ecommerce.api.model.Produto;
import br.com.ecommerce.api.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listarProdutos() {
        List<Produto> produtos = produtoService.listarTodos();

        return ResponseEntity.ok(produtos);
    }

    @PostMapping
    public ResponseEntity<Produto> cadastrarProduto(@RequestBody Produto produto) {
        Produto produtoSalvo = produtoService.cadastrarProduto(produto);

        return ResponseEntity.status(HttpStatus.CREATED).body(produtoSalvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarProdutoPorId(@PathVariable Integer id) {
        Produto produto = produtoService.buscarPorId(id);

        if (produto == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Produto " + id + " não encontrado!");
        }

        return ResponseEntity.ok(produto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarProduto(@PathVariable Integer id) {
        Produto produto = produtoService.deletarProduto(id);

        if (produto == null) {
            return ResponseEntity.status(404)
                    .body("Produto " + id + " não encontrado!");
        }

        return ResponseEntity.ok(produto);
    }
}
