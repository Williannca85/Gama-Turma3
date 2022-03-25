package br.projeto.contas.dao;

import org.springframework.data.repository.CrudRepository;

import br.projeto.contas.model.ContaEspecial;

public interface ContaEspecialDAO extends CrudRepository<ContaEspecial,Integer>{
}
