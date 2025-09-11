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

    public Pagamento pagamentoPorId(Integer id){
        return pagamentoRepository.findById(id).orElse(null);
    }

    public Pagamento atualizarPagamento(Integer id, Pagamento pagamento){
        Pagamento pagamentoExiste = pagamentoPorId(id);

        if(pagamentoExiste == null){
            return null;
        }


        pagamentoExiste.setPedido(pagamento.getPedido());
        pagamentoExiste.setFormaPagamento(pagamento.getFormaPagamento());
        pagamentoExiste.setStatus(pagamento.getStatus());
        pagamentoExiste.setDataPagamento(pagamento.getDataPagamento());
        return pagamentoRepository.save(pagamentoExiste);
    }
}
