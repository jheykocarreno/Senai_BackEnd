package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.Cliente;
import br.com.ecommerce.api.model.ItemDoPedido;
import br.com.ecommerce.api.repository.ItemDoPedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemDoPedidoService {

    private final ItemDoPedidoRepository itemDoPedidoRepository;

    public ItemDoPedidoService(ItemDoPedidoRepository itemDoPedidoRepository) {
        this.itemDoPedidoRepository = itemDoPedidoRepository;
    }

    public List<ItemDoPedido> listarTodos() {
        return itemDoPedidoRepository.findAll();
    }

    public ItemDoPedido cadastrarItem(ItemDoPedido item) {
        return itemDoPedidoRepository.save(item);
    }

    public ItemDoPedido buscarPorId(Integer id) {
        return itemDoPedidoRepository.findById(id).orElse(null);
    }

    public ItemDoPedido deletarItem(Integer id) {
        ItemDoPedido item = buscarPorId(id);

        if (item == null) {
            return null;
        }

        itemDoPedidoRepository.delete(item);
        return item;
    }
}
