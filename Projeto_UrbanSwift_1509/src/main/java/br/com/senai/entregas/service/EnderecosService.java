package br.com.senai.entregas.service;

import br.com.senai.entregas.model.Enderecos;
import br.com.senai.entregas.repositary.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecosService {

    EnderecoRepository enderecoRepository;
    public EnderecosService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public List<Enderecos> listarEnderecos(){
        return enderecoRepository.findAll();
    }

    public Enderecos cadastrarEnderecos(Enderecos endereco){
        return enderecoRepository.save(endereco);
    }

    public Enderecos buscarEnderecoPorId(int id){
        return enderecoRepository.findById(id).orElse(null);
    }

    public Enderecos atualizarEnderecos(int id, Enderecos endereco){
        Enderecos enderecoAtualizado = buscarEnderecoPorId(id);

        if (enderecoAtualizado == null){
            return null;
        }

        enderecoAtualizado.setUsuario_id(endereco.getUsuario_id());
        enderecoAtualizado.setLogradouro(endereco.getLogradouro());
        enderecoAtualizado.setNumero(endereco.getNumero());
        enderecoAtualizado.setCidade(endereco.getCidade());
        enderecoAtualizado.setCep(endereco.getCep());

        return enderecoRepository.save(enderecoAtualizado);
    }
}
