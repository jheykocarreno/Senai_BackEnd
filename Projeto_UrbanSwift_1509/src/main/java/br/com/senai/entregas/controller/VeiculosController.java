package br.com.senai.entregas.controller;

import br.com.senai.entregas.model.Veiculos;
import br.com.senai.entregas.service.VeiculosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entregas/veiculos")
public class VeiculosController {

    private final VeiculosService veiculosService;

    public VeiculosController(VeiculosService veiculosService) {
        this.veiculosService = veiculosService;
    }

    @GetMapping
    public ResponseEntity<List<Veiculos>> listarVeiculos(){
        List<Veiculos> veiculos = veiculosService.findAll();
        return ResponseEntity.ok().body(veiculos);
    }

    @PostMapping
    public ResponseEntity<Veiculos> cadastrarVeiculos(@RequestBody Veiculos veiculos){
        veiculosService.cadastrarVeiculos(veiculos);
        return ResponseEntity.status(HttpStatus.CREATED).body(veiculos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Veiculos> buscarVeiculos(@PathVariable Integer id){
        Veiculos existeVeiculo = veiculosService.buscarVeiculos(id);

        if(existeVeiculo == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(existeVeiculo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Veiculos> atualizarVeiculos(@PathVariable Integer id, @RequestBody Veiculos veiculos){
        Veiculos veiculoAtualizar = veiculosService.atualizarVeiculos(id, veiculos);

        if (veiculoAtualizar == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(veiculoAtualizar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> removerVeiculos(@PathVariable Integer id){
        Veiculos veiculoDelete = veiculosService.deletarVeiculos(id);

        if (veiculoDelete == null){
            return ResponseEntity.badRequest().body("Não existe veiculo " + id);
        }
        return ResponseEntity.noContent().build();
    }
}
