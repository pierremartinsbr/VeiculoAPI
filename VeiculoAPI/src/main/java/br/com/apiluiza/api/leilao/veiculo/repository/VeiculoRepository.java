package br.com.apiluiza.api.leilao.veiculo.repository;

import java.util.List;

import br.com.apiluiza.api.leilao.veiculo.model.OperacaoLegado;
import br.com.apiluiza.api.leilao.veiculo.model.VeiculoLegado;

public interface VeiculoRepository {
	
	public VeiculoLegado adicionarVeiculo(OperacaoLegado operacaoLegado);

	public VeiculoLegado atualizarVeiculo(OperacaoLegado operacaoLegado);

	public List<VeiculoLegado> consultarVeiculos(OperacaoLegado operacaoLegado);

	public OperacaoLegado excluirVeiculo(OperacaoLegado operacaoLegado);

}
