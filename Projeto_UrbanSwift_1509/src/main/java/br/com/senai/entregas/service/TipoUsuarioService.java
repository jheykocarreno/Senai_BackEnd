package br.com.senai.entregas.service;

import br.com.senai.entregas.model.TipoUsuario;
import br.com.senai.entregas.repositary.TipoUsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoUsuarioService {
    //Injeção de dependencia
    private final TipoUsuarioRepository tipoUsuarioRepository;

    //Criamos o construtor com entrada Interface
    public TipoUsuarioService(TipoUsuarioRepository tipoUsuarioRepository) {
        this.tipoUsuarioRepository = tipoUsuarioRepository;
    }

    //Lista de TipoDeUsuario
    public List<TipoUsuario> listarTipoUsuario(){
        return tipoUsuarioRepository.findAll();
    }

    //Cadastrar TipoUsuario
    public TipoUsuario cadastrarTipoUsuario(TipoUsuario tipoUsuario){
        return tipoUsuarioRepository.save(tipoUsuario);
    }

    //Busca TipoUsuario
    public TipoUsuario buscarTipoUsuario(Integer id){
        Optional<TipoUsuario> tipoUsuario = tipoUsuarioRepository.findById(id);

        if(tipoUsuario.isEmpty()){
            return null;
        }

        return tipoUsuario.get();
    }

    //Atualizar TipoUsuario
    public TipoUsuario atualizarTipoUsuario(Integer id, TipoUsuario tipoUsuario){
        TipoUsuario existeTipoUsuario = buscarTipoUsuario(id);

        if (existeTipoUsuario == null){
            return null;
        }

        existeTipoUsuario.setDescricao(tipoUsuario.getDescricao());
        return tipoUsuarioRepository.save(existeTipoUsuario);
    }

    public TipoUsuario deletarTipoUsuario(Integer id){
        TipoUsuario existeTipoUsuario = buscarTipoUsuario(id);

        if (existeTipoUsuario == null){
            return null;
        }

        tipoUsuarioRepository.delete(existeTipoUsuario);
        return existeTipoUsuario;
    }
}
