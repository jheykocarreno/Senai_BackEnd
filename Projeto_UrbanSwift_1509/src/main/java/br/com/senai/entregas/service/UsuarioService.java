package br.com.senai.entregas.service;

import br.com.senai.entregas.repositary.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    //Injeção
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

}
