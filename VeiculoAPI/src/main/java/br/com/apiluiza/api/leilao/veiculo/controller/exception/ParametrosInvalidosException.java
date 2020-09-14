package br.com.apiluiza.api.leilao.veiculo.controller.exception;

public class ParametrosInvalidosException extends RuntimeException {
	
	public ParametrosInvalidosException(Long id) {
	    super("Veiculo não encontrado com o ID: " + id);
	  }

}
