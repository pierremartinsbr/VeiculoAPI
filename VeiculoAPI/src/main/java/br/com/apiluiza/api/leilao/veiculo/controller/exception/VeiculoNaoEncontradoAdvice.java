package br.com.apiluiza.api.leilao.veiculo.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class VeiculoNaoEncontradoAdvice {

	@ResponseBody
	@ExceptionHandler(VeiculoNaoEncontradoException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String veiculoNaoEncontradoHandler(VeiculoNaoEncontradoException ex) {
		return ex.getMessage();
	}

}
