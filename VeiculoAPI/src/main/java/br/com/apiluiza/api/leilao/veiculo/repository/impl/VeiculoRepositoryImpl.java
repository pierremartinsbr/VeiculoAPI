package br.com.apiluiza.api.leilao.veiculo.repository.impl;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import br.com.apiluiza.api.leilao.veiculo.model.OperacaoLegado;
import br.com.apiluiza.api.leilao.veiculo.model.VeiculoLegado;
import br.com.apiluiza.api.leilao.veiculo.repository.VeiculoRepository;

@Repository
public class VeiculoRepositoryImpl implements VeiculoRepository{
	
	private static final Logger log = LoggerFactory.getLogger(VeiculoRepositoryImpl.class);
	
	private static String RESOURCE_URL = "https://dev.apiluiza.com.br/legado/veiculo";
	
	private RestTemplate restTemplate;
	 
	@Autowired
	public VeiculoRepositoryImpl(RestTemplateBuilder builder) {
	    this.restTemplate = builder.build();
	}


	@Override
	public VeiculoLegado adicionarVeiculo(OperacaoLegado novaOperacaoLegado) {
		
		VeiculoLegado veiculoLegado = restTemplate.postForObject(RESOURCE_URL, novaOperacaoLegado, VeiculoLegado.class);

		return veiculoLegado;
	}

	@Override
	public VeiculoLegado atualizarVeiculo(OperacaoLegado atualizarOperacaoLegado) {
		
		VeiculoLegado veiculoLegado = restTemplate.postForObject(RESOURCE_URL, atualizarOperacaoLegado, VeiculoLegado.class);

		return veiculoLegado;
	}

	@Override
	public List<VeiculoLegado> consultarVeiculos(OperacaoLegado consultaOperacaoLegado) {
		
		VeiculoLegado[] lista = restTemplate.postForObject(RESOURCE_URL, consultaOperacaoLegado, VeiculoLegado[].class);
		
		return Arrays.asList(lista);
	}

	@Override
	public OperacaoLegado excluirVeiculo(OperacaoLegado excluirOperacaoLegado) {
		
		OperacaoLegado operacaoLegado = restTemplate.postForObject(RESOURCE_URL, excluirOperacaoLegado, OperacaoLegado.class);

		return operacaoLegado;

	}

}
