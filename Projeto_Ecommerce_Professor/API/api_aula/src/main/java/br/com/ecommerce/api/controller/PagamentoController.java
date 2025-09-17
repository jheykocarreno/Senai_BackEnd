package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.ItemDoPedido;
import br.com.ecommerce.api.model.Pagamento;
import br.com.ecommerce.api.model.Produto;
import br.com.ecommerce.api.service.PagamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pagamentos")
public class PagamentoController {

    private final PagamentoService pagamentoService;

    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @GetMapping
    public ResponseEntity<List<Pagamento>> listarPagamentos() {
        List<Pagamento> pagamentos = pagamentoService.listarTodos();

        return ResponseEntity.ok(pagamentos);
    }

    @PostMapping
    public ResponseEntity<Pagamento> cadastrarPagamento(@RequestBody Pagamento pagamento) {
        Pagamento pagamentoSalvo = pagamentoService.cadastrarPagamento(pagamento);

        return ResponseEntity.status(HttpStatus.CREATED).body(pagamentoSalvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPagamentoPorId(@PathVariable Integer id) {
        Pagamento pag = pagamentoService.buscarPorId(id);

        if (pag == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Pagamento " + id + " não encontrado!");
        }

        return ResponseEntity.ok(pag);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarPagamento(@PathVariable Integer id) {
        Pagamento item = pagamentoService.deletarPagamento(id);

        if (item == null) {
            return ResponseEntity.status(404)
                    .body("Item " + id + " não encontrado!");
        }

        return ResponseEntity.ok(item);
    }

}
