package br.projeto.contas.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.projeto.contas.dao.ContaEspecialDAO;
import br.projeto.contas.model.ContaEspecial;


@CrossOrigin
@RestController
public class ContaEspecialController {
    @Autowired
	private ContaEspecialDAO dao;
	@GetMapping("/conta-especial")
	public ArrayList<ContaEspecial> recuperarTodasContasEspecial(){
		ArrayList<ContaEspecial> lista;
		lista = (ArrayList<ContaEspecial>)dao.findAll();
		return lista;
		}
	
	@GetMapping("/conta-especial/{numeroConta}")
	public ContaEspecial recuperarContaEspecial(@PathVariable int numeroConta) {
		return dao.findById(numeroConta).orElse(null);
	}
}

