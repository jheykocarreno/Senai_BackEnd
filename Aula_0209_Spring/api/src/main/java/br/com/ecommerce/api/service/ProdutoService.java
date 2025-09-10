package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.Produto;
import br.com.ecommerce.api.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository repo) {
        this.produtoRepository = repo;
    }

    public List<Produto> listarTodosProdutos() {
        return produtoRepository.findAll();
    }

    public Produto cadastrarProduto(Produto prod){
        return produtoRepository.save(prod);
    }

    public Produto produtoPorId(Integer id){
        return produtoRepository.findById(id).orElse(null);
    }

    public Produto atualizarProduto(Integer id, Produto produto){
        Produto produtoExiste = produtoPorId(id);

        if (produtoExiste == null){
            return null;
        }

        produtoExiste.setNomeProduto(produto.getNomeProduto());
        produtoExiste.setDescricao(produto.getDescricao());
        produtoExiste.setPreco(produto.getPreco());
        produtoExiste.setEstoqueDisponivel(produto.getEstoqueDisponivel());
        produtoExiste.setImagemUrl(produto.getImagemUrl());
        return produtoRepository.save(produtoExiste);
    }
}
