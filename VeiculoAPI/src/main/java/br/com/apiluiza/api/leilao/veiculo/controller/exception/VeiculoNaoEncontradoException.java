package br.com.apiluiza.api.leilao.veiculo.controller.exception;

public class VeiculoNaoEncontradoException extends RuntimeException {
	
	public VeiculoNaoEncontradoException(Long id) {
	    super("Veiculo não encontrado com o ID: " + id);
	  }

}
