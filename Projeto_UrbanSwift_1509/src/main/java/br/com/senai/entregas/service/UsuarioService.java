package br.com.senai.entregas.service;

import br.com.senai.entregas.model.Usuario;
import br.com.senai.entregas.repositary.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    //Injeção
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    //Listar todo
    public List<Usuario> listarUsuario(){
        return usuarioRepository.findAll();
    }

    //Cadastrar usuario
    public Usuario cadastrarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    //Buscar usuario por ID
    public Usuario buscarUsuarioPorId(Integer id){
        Optional<Usuario> usuario = usuarioRepository.findById(id);

        if (usuario.isEmpty()) {
            return null;
        }

        return usuario.get();
    }

    //Atualizar usuario
    public Usuario atualizarUsuario(Integer id, Usuario usuario){
        Usuario existeUsuario = buscarUsuarioPorId(id);

        if (existeUsuario == null) {
            return null;
        }

        existeUsuario.setTipoUsuario(usuario.getTipoUsuario());
        existeUsuario.setNomeCompleto(usuario.getNomeCompleto());
        existeUsuario.setEmail(usuario.getEmail());
        existeUsuario.setSenha(usuario.getSenha());
        return usuarioRepository.save(existeUsuario);
    }

    //Deletar Usuario
    public Usuario deletarUsuario(Integer id){
        Usuario usuarioExiste = buscarUsuarioPorId(id);

        if (usuarioExiste == null) {
            return null;
        }
        usuarioRepository.delete(usuarioExiste);
        return usuarioExiste;
    }
}
