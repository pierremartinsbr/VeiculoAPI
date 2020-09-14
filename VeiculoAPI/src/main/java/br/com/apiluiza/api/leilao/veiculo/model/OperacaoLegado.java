package br.com.apiluiza.api.leilao.veiculo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OperacaoLegado {
	
	public OperacaoLegado() {
		super();
	}

	public OperacaoLegado(String operacao) {
		super();
		this.operacao = operacao;
	}

	public OperacaoLegado(String operacao, VeiculoLegado veiculo) {
		super();
		this.operacao = operacao;
		this.veiculo = veiculo;
	}

	@JsonProperty("OPERACAO")
	private String operacao;
	
	@JsonProperty("VEICULO")
	private VeiculoLegado veiculo;
	
	@JsonProperty("mensagem")
	private String mensagem;

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public VeiculoLegado getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(VeiculoLegado veiculo) {
		this.veiculo = veiculo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	

}
