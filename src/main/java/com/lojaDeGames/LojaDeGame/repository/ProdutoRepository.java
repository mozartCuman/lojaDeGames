package com.lojaDeGames.LojaDeGame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.lojaDeGames.LojaDeGame.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByProdutoContainingIgnoreCase(@Param("produto") String produto);

	
}
