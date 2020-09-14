package br.com.apiluiza.api.leilao.veiculo.model;

/**
 * AnoFabricModel
 */

public class AnoFabricModel {

	private Long anoFabricacao = null;

	private Long anoModelo = null;
	
	public AnoFabricModel(String anoFabricacao, String anoModelo) {
		super();
		if (anoFabricacao != null)
			this.anoFabricacao = Long.parseLong(anoFabricacao);
		
		if (anoModelo != null)
			this.anoModelo = Long.parseLong(anoModelo);
	}

	public Long getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Long anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Long getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Long anoModelo) {
		this.anoModelo = anoModelo;
	}

	
}
