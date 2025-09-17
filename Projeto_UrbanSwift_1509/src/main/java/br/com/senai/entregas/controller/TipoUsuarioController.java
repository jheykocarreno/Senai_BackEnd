package br.com.senai.entregas.controller;

import br.com.senai.entregas.model.TipoUsuario;
import br.com.senai.entregas.service.TipoUsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/entregas/tipoUsuario")
public class TipoUsuarioController {
    private final TipoUsuarioService tipoUsuarioService;

    public TipoUsuarioController(TipoUsuarioService tipoUsuarioService) {
        this.tipoUsuarioService = tipoUsuarioService;
    }

    @GetMapping
    public ResponseEntity<List<TipoUsuario>> listarTipoUsuario(){
        List<TipoUsuario> listaTipoUsuario = tipoUsuarioService.listarTipoUsuario();
        return ResponseEntity.ok(listaTipoUsuario);
    }

    @PostMapping
    public ResponseEntity<TipoUsuario> cadastrarTipoUsuario(@RequestBody TipoUsuario tipoUsuario){
        tipoUsuarioService.cadastrarTipoUsuario(tipoUsuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(tipoUsuario);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoUsuario> buscarTipoUsuario(@PathVariable Integer id){
        TipoUsuario existeTipoUsuario = tipoUsuarioService.buscarTipoUsuario(id);

        if (existeTipoUsuario == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(existeTipoUsuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoUsuario> atualizarTipoUsuario(@PathVariable Integer id, @RequestBody TipoUsuario tipoUsuario){
        TipoUsuario atualizarTipoUsuario = tipoUsuarioService.atualizarTipoUsuario(id, tipoUsuario);

        if (atualizarTipoUsuario == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(atualizarTipoUsuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarTipoUsuario(@PathVariable Integer id){
        TipoUsuario deletarTipoUsuario = tipoUsuarioService.deletarTipoUsuario(id);

        if (deletarTipoUsuario == null){
            return ResponseEntity.badRequest().body("Tipo Usuario " + id + " não existe");
        }

        return ResponseEntity.noContent().build();
    }
}