package com.example.produto.service;

import com.example.produto.dto.ProdutoDTO;
import com.example.produto.model.Produto;
import com.example.produto.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public ProdutoDTO create(ProdutoDTO dto) {
        Produto p = Produto.builder()
                .nome(dto.getNome())
                .descricao(dto.getDescricao())
                .preco(dto.getPreco())
                .build();
        Produto saved = repository.save(p);
        return toDto(saved);
    }

    public List<ProdutoDTO> findAll() {
        return repository.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }

    public ProdutoDTO findById(Long id) {
        return repository.findById(id).map(this::toDto).orElse(null);
    }

    public ProdutoDTO update(Long id, ProdutoDTO dto) {
        return repository.findById(id).map(p -> {
            p.setNome(dto.getNome());
            p.setDescricao(dto.getDescricao());
            p.setPreco(dto.getPreco());
            Produto updated = repository.save(p);
            return toDto(updated);
        }).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    private ProdutoDTO toDto(Produto p) {
        return ProdutoDTO.builder()
                .id(p.getId())
                .nome(p.getNome())
                .descricao(p.getDescricao())
                .preco(p.getPreco())
                .build();
    }
}
