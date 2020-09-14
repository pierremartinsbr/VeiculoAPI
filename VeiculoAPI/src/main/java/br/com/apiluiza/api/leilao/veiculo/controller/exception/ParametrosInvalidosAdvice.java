package br.com.apiluiza.api.leilao.veiculo.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ParametrosInvalidosAdvice {

	@ResponseBody
	@ExceptionHandler(ParametrosInvalidosException.class)
	@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
	String veiculoNaoEncontradoHandler(ParametrosInvalidosException ex) {
		return ex.getMessage();
	}

}
