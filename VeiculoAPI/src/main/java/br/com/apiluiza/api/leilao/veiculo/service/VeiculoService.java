package br.com.apiluiza.api.leilao.veiculo.service;

import java.util.List;

import br.com.apiluiza.api.leilao.veiculo.model.AnoFabricModel;
import br.com.apiluiza.api.leilao.veiculo.model.AnoFaixaFabricacao;
import br.com.apiluiza.api.leilao.veiculo.model.Veiculo;

public interface VeiculoService {
	
	public Veiculo adicionarVeiculo(Veiculo veiculo);

	public Veiculo atualizarVeiculo(Veiculo veiculo);
	
	public Veiculo consultarVeiculoPorId(Long id);
		
	public List<Veiculo> consultarVeiculos(String lote,
			String marca,
			String modelo,
			AnoFabricModel anoFabricModel,
			AnoFaixaFabricacao anoFaixaFabricacao);
	
	public void excluirVeiculo(Long id);

}
