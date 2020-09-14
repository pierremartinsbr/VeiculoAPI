package br.com.apiluiza.api.leilao.veiculo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "br.com.apiluiza.api.leilao"})
public class VeiculoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeiculoApiApplication.class, args);
	}

}
