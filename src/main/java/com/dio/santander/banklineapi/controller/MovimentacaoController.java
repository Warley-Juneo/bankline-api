package com.dio.santander.banklineapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.banklineapi.dto.NovaMovimentacao;
import com.dio.santander.banklineapi.dto.NovoCorrentista;
import com.dio.santander.banklineapi.model.Correntista;
import com.dio.santander.banklineapi.model.Movimentacao;
import com.dio.santander.banklineapi.repository.CorrentistaRepository;
import com.dio.santander.banklineapi.repository.MovimentacaoRepository;
import com.dio.santander.banklineapi.service.CorrentistaService;
import com.dio.santander.banklineapi.service.MovimentacaoService;
@RestController
@RequestMapping("/movimentaçoes")
public class MovimentacaoController {
	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private MovimentacaoService service;
	
	@GetMapping
	public List<Movimentacao> findAll() {
		return repository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody NovaMovimentacao movimentacao) {
		service.save(movimentacao);
	}
}
