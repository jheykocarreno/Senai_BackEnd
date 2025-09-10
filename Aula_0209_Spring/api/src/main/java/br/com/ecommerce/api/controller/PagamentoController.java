package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.Pagamento;
import br.com.ecommerce.api.service.PagamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pagamentos")
public class PagamentoController {

    private PagamentoService pagamentoService;

    public PagamentoController(PagamentoService pagamentoServ) {
        this.pagamentoService = pagamentoServ;
    }

    @GetMapping
    public ResponseEntity<List<Pagamento>> listaPagamentos(){
        List<Pagamento> pagamentos = pagamentoService.listarPagamento();
        return ResponseEntity.ok(pagamentos);
    }

    @PostMapping
    public ResponseEntity<Pagamento> cadastrarPagamento(@RequestBody Pagamento pagamento){
        pagamentoService.cadastrarPagamento(pagamento);
        return ResponseEntity.status(HttpStatus.CREATED).body(pagamento);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pagamento> buscarPagamento(@PathVariable Integer id){
        Pagamento pagamento = pagamentoService.pagamentoPorId(id);

        if(pagamento == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(pagamento);
    }
}
