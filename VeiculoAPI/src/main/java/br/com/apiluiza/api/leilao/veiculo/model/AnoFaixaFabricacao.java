package br.com.apiluiza.api.leilao.veiculo.model;

/**
 * AnoFaixaFabricacao
 */

public class AnoFaixaFabricacao {

	private Long anoInicio = null;

	private Long anoFim = null;
	
	public AnoFaixaFabricacao(String anoInicio, String anoFim) {
		super();
		if (anoInicio != null) {
			this.anoInicio = Long.parseLong(anoInicio);
		}
		
		if (anoFim != null) {
			this.anoFim = Long.parseLong(anoFim);
		}
		
	}

	public Long getAnoInicio() {
		return anoInicio;
	}

	public void setAnoInicio(Long anoInicio) {
		this.anoInicio = anoInicio;
	}

	public Long getAnoFim() {
		return anoFim;
	}

	public void setAnoFim(Long anoFim) {
		this.anoFim = anoFim;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anoFim == null) ? 0 : anoFim.hashCode());
		result = prime * result + ((anoInicio == null) ? 0 : anoInicio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		AnoFaixaFabricacao other = (AnoFaixaFabricacao) obj;
		if (anoFim == null) {
			if (other.anoFim != null) {
				return false;
			}
		} else if (!anoFim.equals(other.anoFim)) {
			return false;
		}
		if (anoInicio == null) {
			if (other.anoInicio != null) {
				return false;
			}
		} else if (!anoInicio.equals(other.anoInicio)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "AnoFaixaFabricacao [anoInicio=" + anoInicio + ", anoFim=" + anoFim + "]";
	}

	
	
}
