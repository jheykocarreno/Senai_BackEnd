package br.com.senai.entregas.service;

import br.com.senai.entregas.model.Entregas;
import br.com.senai.entregas.repositary.EntregasRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntregasService {

    private final EntregasRepository entregasRepository;

    public EntregasService(EntregasRepository entregasRepository) {
        this.entregasRepository = entregasRepository;
    }

    public List<Entregas> findAll() {
        return entregasRepository.findAll();
    }

    public Entregas cadastroEntrega(Entregas entregas){
        return entregasRepository.save(entregas);
    }

    public Entregas buscarEntregaPorId(Integer id) {
        Optional<Entregas> entregas = entregasRepository.findById(id);

        if(entregas.isEmpty()){
            return null;
        }
        return entregas.get();
    }

    public Entregas atualizarEntrega(Integer id, Entregas entregas){
        Entregas existeEntrega =  buscarEntregaPorId(id);

        if(existeEntrega == null){
            return null;
        }

        existeEntrega.setCliente(entregas.getCliente());
        existeEntrega.setEndereco(entregas.getEndereco());
        existeEntrega.setDescricaoProduto(entregas.getDescricaoProduto());
        existeEntrega.setStatus(entregas.getStatus());
        existeEntrega.setDataPedido(entregas.getDataPedido());
        return entregasRepository.save(existeEntrega);
    }

    public Entregas delEntregas(Integer id) {
        Entregas existeEntrega =  buscarEntregaPorId(id);

        if(existeEntrega == null){
            return null;
        }

        entregasRepository.delete(existeEntrega);
        return existeEntrega;
    }
}
