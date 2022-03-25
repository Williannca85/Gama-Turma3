package br.projeto.contas.dao;

import org.springframework.data.repository.CrudRepository;

import br.projeto.contas.model.ContaCorrente;

public interface ContaCorrenteDAO extends CrudRepository<ContaCorrente,Integer>{
}
