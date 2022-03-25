package br.projeto.contas.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.projeto.contas.dao.ContaCorrenteDAO;
import br.projeto.contas.model.ContaCorrente;

@RestController
@CrossOrigin("*") // solicitações podem vir de qualuqer origem
public class ContaCorrenteController {
     
     @Autowired // injeção de dependência: JPA criar a classe e o objeto
     private ContaCorrenteDAO dao;
	@GetMapping("/conta-corrente")
	public ArrayList<ContaCorrente> recuperarTudasContasCorrente(){
		ArrayList<ContaCorrente> lista;
		lista = (ArrayList<ContaCorrente>)dao.findAll();
		return lista;
		}
	
	@GetMapping("/conta-corrente/{numeroConta}")
	public ContaCorrente recuperarContaCorrente(@PathVariable int numeroConta) {
		return dao.findById(numeroConta).orElse(null);
	}

     
}
