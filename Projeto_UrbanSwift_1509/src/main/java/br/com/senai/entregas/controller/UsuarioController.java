package br.com.senai.entregas.controller;

import br.com.senai.entregas.model.Usuario;
import br.com.senai.entregas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/entregas/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuario(){
        List<Usuario> usuarios = usuarioService.listarUsuario();
        return ResponseEntity.ok().body(usuarios);
    }

    @PostMapping
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuarioNovo){
        usuarioService.cadastrarUsuario(usuarioNovo);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioNovo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarUsuarioPorId(@PathVariable int id){
        Usuario usuario = usuarioService.buscarUsuarioPorId(id);

        if(usuario == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usuario);
    }

    @PutMapping("{id}")
    public ResponseEntity<Usuario> atualizarUsuario(@PathVariable int id, @RequestBody Usuario usuarioNovo){
        Usuario usuarioAtualizar = usuarioService.atualizarUsuario(id, usuarioNovo);

        if (usuarioAtualizar == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usuarioAtualizar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarUsuarioPorId(@PathVariable int id){
        Usuario usuarioDeletar = usuarioService.buscarUsuarioPorId(id);

        if (usuarioDeletar == null){
            return ResponseEntity.badRequest().body("Não existe usuario " + id);
        }
        return ResponseEntity.noContent().build();
    }
}
