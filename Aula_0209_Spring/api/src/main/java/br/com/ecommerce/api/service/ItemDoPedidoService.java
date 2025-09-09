package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.ItemDoPedido;
import br.com.ecommerce.api.repository.itemDoPedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemDoPedidoService {

    private final itemDoPedidoRepository itemDoPedidoRepository;

    public ItemDoPedidoService(itemDoPedidoRepository itemDoPedidoRepo) {
        this.itemDoPedidoRepository = itemDoPedidoRepo;
    }

    public List<ItemDoPedido> listarPedidos(){
        return itemDoPedidoRepository.findAll();
    }

    public ItemDoPedido cadastrarPedido(ItemDoPedido itemDoPedido){
        return itemDoPedidoRepository.save(itemDoPedido);
    }
}
