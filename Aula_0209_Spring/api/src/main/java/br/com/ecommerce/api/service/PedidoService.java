package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.Pedido;
import br.com.ecommerce.api.repository.PedidoRepository;
import org.springframework.http.ResponseEntity;
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

    public Pedido buscarPedidoPorId(Integer id){
        return pedidoRepository.findById(id).orElse(null);
    }

    public Pedido atualizarPedido(Integer id, Pedido pedido){
        Pedido pedidoExiste = buscarPedidoPorId(id);

        if (pedidoExiste == null){
            return null;
        }

        pedidoExiste.setDataPedido(pedido.getDataPedido());
        pedidoExiste.setValorTotal(pedido.getValorTotal());
        pedidoExiste.setStatus(pedido.getStatus());
        pedidoExiste.setCliente(pedido.getCliente());
        return pedidoRepository.save(pedidoExiste);
    }
}
