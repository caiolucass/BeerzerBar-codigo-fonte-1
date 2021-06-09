package github.beerzer.service;

import github.beerzer.dominio.DTO.ProdutoDTO;
import github.beerzer.dominio.Produtos;
import github.beerzer.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produtos salvar(ProdutoDTO produtoDTO) {
        Produtos produtos = new Produtos();
        produtos.setNome(produtoDTO.getNome());
        produtos.setDescricao(produtoDTO.getDescricao());
        produtos.setQuantidade(produtoDTO.getQuantidade());
        produtos.setPreco(Double.valueOf(produtoDTO.getPreco()));
        produtos.setCategoria(produtoDTO.getCategoria());
        return produtoRepository.save(produtos);
    }

    public List<Produtos> listarProdutos() {
        return produtoRepository.findAll();
    }
}
