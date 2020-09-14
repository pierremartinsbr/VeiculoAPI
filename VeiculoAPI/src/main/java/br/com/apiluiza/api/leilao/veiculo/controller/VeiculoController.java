package br.com.apiluiza.api.leilao.veiculo.controller;

import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiluiza.api.leilao.veiculo.model.AnoFabricModel;
import br.com.apiluiza.api.leilao.veiculo.model.AnoFaixaFabricacao;
import br.com.apiluiza.api.leilao.veiculo.model.Veiculo;
import br.com.apiluiza.api.leilao.veiculo.service.VeiculoService;

@RestController
public class VeiculoController {

	private static final Logger log = LoggerFactory.getLogger(VeiculoController.class);

	private final VeiculoService veiculoService;

	@Autowired
	public VeiculoController(VeiculoService veiculoService) {
		this.veiculoService = veiculoService;
	}

	@PostMapping("/veiculos")
	public Veiculo adicionarVeiculo(@RequestBody Veiculo novoVeiculo) {
		
		log.info(">> /veiculos", novoVeiculo);

		return veiculoService.adicionarVeiculo(novoVeiculo);

	};

	@PutMapping("/veiculos/{id}")
	public Veiculo atualizarVeiculo(@PathVariable("id") Long id, @RequestBody Veiculo atualizarVeiculo) {

		log.info(">> /veiculos/{", id, "} Veiculo ", atualizarVeiculo);

		atualizarVeiculo.setId(id);
		return veiculoService.atualizarVeiculo(atualizarVeiculo);
	}

	@GetMapping("/veiculos/{id}")
	public Veiculo consultarVeiculoPorId(@PathVariable("id") Long id) {

		log.info(">> /veiculos/{", id, "}");

		return veiculoService.consultarVeiculoPorId(id);

	}

	@GetMapping("/veiculos")
	public List<Veiculo> consultarVeiculos(@RequestParam(value = "lote", required = false) String lote,
			@RequestParam(value = "marca", required = false) String marca,
			@RequestParam(value = "modelo", required = false) String modelo,
			@RequestParam(value = "anofabricmodel", required = false) String[] anoFabricModel,
			@RequestParam(value = "anofaixafabric", required = false) String[] anoFaixaFabricacao) {

		log.info(">> /veiculos lote ", lote, "marca ", marca, "modelo ", modelo, "anofabricmodel ", anoFabricModel,
				"anofaixafabric ", anoFabricModel);

		AnoFabricModel anoFabricModelObj = null;
		AnoFaixaFabricacao anoFaixaFabricacaoObj = null;

		if (ArrayUtils.isNotEmpty(anoFabricModel))
			anoFabricModelObj = new AnoFabricModel(anoFabricModel[0], anoFabricModel[1]);

		if (ArrayUtils.isNotEmpty(anoFaixaFabricacao))
			anoFaixaFabricacaoObj = new AnoFaixaFabricacao(anoFaixaFabricacao[0], anoFaixaFabricacao[1]);

		return veiculoService.consultarVeiculos(lote, marca, modelo, anoFabricModelObj, anoFaixaFabricacaoObj);
	}

	@DeleteMapping("/veiculos/{id}")
	public void excluirVeiculo(@PathVariable("id") Long id) {
		
		log.info(">> /veiculos/{", id, "}");
		
		veiculoService.excluirVeiculo(id);
	}

}
