package com.example.loginauthapi.service;


import com.example.loginauthapi.domain.user.Produto;
import com.example.loginauthapi.dto.ProdutoDTO;
import com.example.loginauthapi.repositories.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public Produto criarProduto(ProdutoDTO produtoDTO) {
        Produto produto = new Produto();
        produto.setNomeProduto(produtoDTO.nomeProduto());
        produto.setProduto(produtoDTO.produto());
        produto.setValor(produtoDTO.valor());
        produto.setLocalProduto(produtoDTO.localProduto());
        return produtoRepository.save(produto);
    }

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Produto obterProduto(String id) {
        return produtoRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    public Produto atualizarProduto(String id, ProdutoDTO produtoDTO) {
        Produto produto = obterProduto(id);
        produto.setNomeProduto(produtoDTO.nomeProduto());
        produto.setProduto(produtoDTO.produto());
        produto.setValor(produtoDTO.valor());
        produto.setLocalProduto(produtoDTO.localProduto());
        return produtoRepository.save(produto);
    }

    public void deletarProduto(String id) {
        produtoRepository.deleteById(id);
    }
}
