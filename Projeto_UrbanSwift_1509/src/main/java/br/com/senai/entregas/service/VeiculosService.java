package br.com.senai.entregas.service;

import br.com.senai.entregas.model.Veiculos;
import br.com.senai.entregas.repositary.VeiculosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculosService {

    private final VeiculosRepository veiculosRepository;

    public VeiculosService(VeiculosRepository veiculosRepository) {
        this.veiculosRepository = veiculosRepository;
    }

    public List<Veiculos> findAll() {
        return veiculosRepository.findAll();
    }

    public Veiculos cadastrarVeiculos(Veiculos veiculos){
        return veiculosRepository.save(veiculos);
    }

    public Veiculos buscarVeiculos(Integer id){
        Optional<Veiculos> veiculos = veiculosRepository.findById(id);

        if(veiculos.isEmpty()){
            return null;
        }
        return veiculos.get();
    }

    public Veiculos atualizarVeiculos(Integer id, Veiculos veiculos){
        Veiculos veiculoExistente = buscarVeiculos(id);

        if(veiculoExistente == null){
            return null;
        }

        veiculoExistente.setPlaca(veiculos.getPlaca());
        veiculoExistente.setModelo(veiculos.getModelo());
        veiculoExistente.setTipo(veiculos.getTipo());
        veiculoExistente.setUsuario_id(veiculos.getUsuario_id());
        return veiculosRepository.save(veiculoExistente);
    }

    public Veiculos deletarVeiculos(Integer id){
        Veiculos veiculoExistente = buscarVeiculos(id);

        if(veiculoExistente == null){
            return null;
        }
        veiculosRepository.delete(veiculoExistente);
        return veiculoExistente;
    }
}
