package br.com.apiluiza.api.leilao.veiculo.model;

/**
 * Veiculo
 */

public class Veiculo {
	
	public Veiculo() {
		super();
	}
	
	public Veiculo(Long id, String dataLance, String lote, String codigoControle, String marca, String modelo,
			Long anoFabricacao, Long anoModelo, Double valorLance, String usuarioLance) {
		super();
		this.id = id;
		this.dataLance = dataLance;
		this.lote = lote;
		this.codigoControle = codigoControle;
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.valorLance = valorLance;
		this.usuarioLance = usuarioLance;
	}



	private Long id;

	private String dataLance;

	private String lote;

	private String codigoControle;

	private String marca;

	private String modelo;

	private Long anoFabricacao;

	private Long anoModelo;

	private Double valorLance;

	private String usuarioLance;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDataLance() {
		return dataLance;
	}

	public void setDataLance(String dataLance) {
		this.dataLance = dataLance;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getCodigoControle() {
		return codigoControle;
	}

	public void setCodigoControle(String codigoControle) {
		this.codigoControle = codigoControle;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
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

	public Double getValorLance() {
		return valorLance;
	}

	public void setValorLance(Double valorLance) {
		this.valorLance = valorLance;
	}

	public String getUsuarioLance() {
		return usuarioLance;
	}

	public void setUsuarioLance(String usuarioLance) {
		this.usuarioLance = usuarioLance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anoFabricacao == null) ? 0 : anoFabricacao.hashCode());
		result = prime * result + ((anoModelo == null) ? 0 : anoModelo.hashCode());
		result = prime * result + ((codigoControle == null) ? 0 : codigoControle.hashCode());
		result = prime * result + ((dataLance == null) ? 0 : dataLance.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lote == null) ? 0 : lote.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((usuarioLance == null) ? 0 : usuarioLance.hashCode());
		result = prime * result + ((valorLance == null) ? 0 : valorLance.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (anoFabricacao == null) {
			if (other.anoFabricacao != null)
				return false;
		} else if (!anoFabricacao.equals(other.anoFabricacao))
			return false;
		if (anoModelo == null) {
			if (other.anoModelo != null)
				return false;
		} else if (!anoModelo.equals(other.anoModelo))
			return false;
		if (codigoControle == null) {
			if (other.codigoControle != null)
				return false;
		} else if (!codigoControle.equals(other.codigoControle))
			return false;
		if (dataLance == null) {
			if (other.dataLance != null)
				return false;
		} else if (!dataLance.equals(other.dataLance))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lote == null) {
			if (other.lote != null)
				return false;
		} else if (!lote.equals(other.lote))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (usuarioLance == null) {
			if (other.usuarioLance != null)
				return false;
		} else if (!usuarioLance.equals(other.usuarioLance))
			return false;
		if (valorLance == null) {
			if (other.valorLance != null)
				return false;
		} else if (!valorLance.equals(other.valorLance))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", dataLance=" + dataLance + ", lote=" + lote + ", codigoControle="
				+ codigoControle + ", marca=" + marca + ", modelo=" + modelo + ", anoFabricacao=" + anoFabricacao
				+ ", anoModelo=" + anoModelo + ", valorLance=" + valorLance + ", usuarioLance=" + usuarioLance + "]";
	}

	

	
}
