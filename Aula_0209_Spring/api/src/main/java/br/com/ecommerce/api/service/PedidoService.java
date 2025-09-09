package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.Pedido;
import br.com.ecommerce.api.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepo) {
        this.pedidoRepository = pedidoRepo;
    }

    public List<Pedido> listarTodosPedidos(){
        return pedidoRepository.findAll();
    }

    public Pedido cadastrarPedido(Pedido pedido){
        return pedidoRepository.save(pedido);
    }
}
