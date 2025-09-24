package br.com.senai.entregas.controller;

import br.com.senai.entregas.model.Entregas;
import br.com.senai.entregas.service.EntregasService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entregas/entregas")

public class EntregasController {
    private final EntregasService entregasService;

    public EntregasController(EntregasService entregasService) {
        this.entregasService = entregasService;
    }

    @GetMapping
    public ResponseEntity<List<Entregas>> listaEntregas(){
        List<Entregas> entregas = entregasService.findAll();
        return ResponseEntity.ok().body(entregas);
    }

    @PostMapping
    public ResponseEntity<Entregas> cadastroEntregas(@RequestBody Entregas entregas){
        entregasService.cadastroEntrega(entregas);
        return ResponseEntity.status(HttpStatus.CREATED).body(entregas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Entregas> buscaEntregas(@PathVariable Integer id){
        Entregas entregaExiste = entregasService.buscarEntregaPorId(id);

        if (entregaExiste == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(entregaExiste);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Entregas> atualizarEntregas(@PathVariable Integer id, @RequestBody Entregas entregas){
        Entregas entregaAtualizar = entregasService.atualizarEntrega(id, entregas);

        if (entregaAtualizar == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(entregaAtualizar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarEntregas(@PathVariable Integer id){
        Entregas entregaDelete = entregasService.delEntregas(id);
        if (entregaDelete == null){
            return ResponseEntity.badRequest().body("Não existe Entrega com ID: " + id);
        }
        return ResponseEntity.noContent().build();
    }
}
