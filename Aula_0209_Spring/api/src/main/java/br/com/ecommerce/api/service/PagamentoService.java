package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.Pagamento;
import br.com.ecommerce.api.repository.PagamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagamentoService {

    private final PagamentoRepository pagamentoRepository;

    public PagamentoService(PagamentoRepository pagamentoRepo) {
        this.pagamentoRepository = pagamentoRepo;
    }

    public List<Pagamento> listarPagamento(){
        return pagamentoRepository.findAll();
    }

    public Pagamento cadastrarPagamento(Pagamento paga){
        return pagamentoRepository.save(paga);
    }
}
