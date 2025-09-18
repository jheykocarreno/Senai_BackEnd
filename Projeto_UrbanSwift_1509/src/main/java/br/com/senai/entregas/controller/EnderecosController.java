package br.com.senai.entregas.controller;

import br.com.senai.entregas.model.Enderecos;
import br.com.senai.entregas.service.EnderecosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entregas/enderecos")

public class EnderecosController {

    EnderecosService enderecosService;

    public EnderecosController(EnderecosService enderecosService){
        this.enderecosService = enderecosService;
    }

    @GetMapping
    public ResponseEntity<List<Enderecos>> buscarEnderecos(){
        List<Enderecos> listaEndereco = enderecosService.listarEnderecos();
        return ResponseEntity.ok().body(listaEndereco);
    }

    @PostMapping
    public ResponseEntity<Enderecos> cadastrarEnderecos(@RequestBody Enderecos enderecos){
        enderecosService.cadastrarEnderecos(enderecos);
        return ResponseEntity.ok(enderecos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Enderecos> buscarEnderecos(@PathVariable int id){
        Enderecos enderecoExiste = enderecosService.buscarEnderecoPorId(id);

        if(enderecoExiste == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(enderecoExiste);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Enderecos> atualizarEnderecos(@PathVariable int id, @RequestBody Enderecos enderecos){
        Enderecos enderecoExiste = enderecosService.buscarEnderecoPorId(id);
        if(enderecoExiste == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(enderecoExiste);
    }
}
