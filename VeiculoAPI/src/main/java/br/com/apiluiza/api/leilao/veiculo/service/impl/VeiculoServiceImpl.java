package br.com.apiluiza.api.leilao.veiculo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apiluiza.api.leilao.veiculo.model.AnoFabricModel;
import br.com.apiluiza.api.leilao.veiculo.model.AnoFaixaFabricacao;
import br.com.apiluiza.api.leilao.veiculo.model.OperacaoLegado;
import br.com.apiluiza.api.leilao.veiculo.model.Veiculo;
import br.com.apiluiza.api.leilao.veiculo.model.VeiculoLegado;
import br.com.apiluiza.api.leilao.veiculo.repository.VeiculoRepository;
import br.com.apiluiza.api.leilao.veiculo.service.VeiculoService;

@Service
public class VeiculoServiceImpl implements VeiculoService {

	private static final Logger log = LoggerFactory.getLogger(VeiculoServiceImpl.class);

	@Autowired
	private VeiculoRepository repository;

	@Override
	public Veiculo adicionarVeiculo(Veiculo veiculo) {
		
		log.info(">> adicionarVeiculo: ", veiculo);
		
		OperacaoLegado operacaoLegado = new OperacaoLegado("criar", 
				new VeiculoLegado(veiculo.getId(), 
				veiculo.getDataLance(), 
				veiculo.getLote(), 
				veiculo.getCodigoControle(), 
				veiculo.getMarca(), 
				veiculo.getModelo(), 
				veiculo.getAnoFabricacao(), 
				veiculo.getAnoModelo(), 
				veiculo.getValorLance(), 
				veiculo.getUsuarioLance()));
	
		VeiculoLegado veiculoCriado = repository.adicionarVeiculo(operacaoLegado);
		
		return new Veiculo(veiculoCriado.getId(), 
				veiculoCriado.getDataLance(), 
				veiculoCriado.getLote(), 
				veiculoCriado.getCodigoControle(), 
				veiculoCriado.getMarca(), 
				veiculoCriado.getModelo(), 
				veiculoCriado.getAnoFabricacao(), 
				veiculoCriado.getAnoModelo(), 
				veiculoCriado.getValorLance(), 
				veiculoCriado.getUsuarioLance());

	}

	@Override
	public Veiculo atualizarVeiculo(Veiculo veiculo) {
		
		log.info(">> atualizarVeiculo: ", veiculo);
		
		OperacaoLegado operacaoLegado = new OperacaoLegado("alterar", 
				new VeiculoLegado(veiculo.getId(), 
				veiculo.getDataLance(), 
				veiculo.getLote(), 
				veiculo.getCodigoControle(), 
				veiculo.getMarca(), 
				veiculo.getModelo(), 
				veiculo.getAnoFabricacao(), 
				veiculo.getAnoModelo(), 
				veiculo.getValorLance(), 
				veiculo.getUsuarioLance()));
	
		VeiculoLegado atualizado = repository.atualizarVeiculo(operacaoLegado);
		
		return new Veiculo(atualizado.getId(), 
				atualizado.getDataLance(), 
				atualizado.getLote(), 
				atualizado.getCodigoControle(), 
				atualizado.getMarca(), 
				atualizado.getModelo(), 
				atualizado.getAnoFabricacao(), 
				atualizado.getAnoModelo(), 
				atualizado.getValorLance(), 
				atualizado.getUsuarioLance());
	}

	@Override
	public Veiculo consultarVeiculoPorId(Long id) {
		
		log.info(">> consultarVeiculoPorId: ", id);
		
		OperacaoLegado operacaoLegado = new OperacaoLegado("consultar");
		
		List<VeiculoLegado> legadoList = repository.consultarVeiculos(operacaoLegado);
		
		VeiculoLegado veiculoEncontrado  = legadoList.stream()
        .filter(veiculoLegado -> veiculoLegado.getId().equals(id))
        .findFirst().get();

		return new Veiculo(veiculoEncontrado.getId(), 
				veiculoEncontrado.getDataLance(), 
				veiculoEncontrado.getLote(), 
				veiculoEncontrado.getCodigoControle(), 
				veiculoEncontrado.getMarca(), 
				veiculoEncontrado.getModelo(), 
				veiculoEncontrado.getAnoFabricacao(), 
				veiculoEncontrado.getAnoModelo(), 
				veiculoEncontrado.getValorLance(), 
				veiculoEncontrado.getUsuarioLance());
	}

	@Override
	public List<Veiculo> consultarVeiculos(String lote, String marca, String modelo, AnoFabricModel anoFabricModel,
			AnoFaixaFabricacao anoFaixaFabricacao) {
		
		OperacaoLegado operacaoLegado = new OperacaoLegado("consultar");
		
		List<VeiculoLegado> legadoList = repository.consultarVeiculos(operacaoLegado);
		
		List<Veiculo> veiculoFiltro = new ArrayList<>();
		
		if (lote != null || marca != null || modelo != null || anoFabricModel != null || anoFaixaFabricacao != null) {
			
			veiculoFiltro = legadoList
					  .stream()
					  .filter(veiculo -> (lote != null && veiculo.getLote() != null && veiculo.getLote().equals(lote))
					  || (marca != null && veiculo.getMarca() != null && veiculo.getMarca().equals(marca))
					  || (modelo != null && veiculo.getModelo() != null && veiculo.getModelo().startsWith(modelo))
					  || (anoFabricModel != null && veiculo.getAnoFabricacao() != null && veiculo.getAnoModelo() != null 
					  && veiculo.getAnoFabricacao().equals(anoFabricModel.getAnoFabricacao()) 
					  && veiculo.getAnoModelo().equals(anoFabricModel.getAnoModelo()))
					  || (anoFaixaFabricacao != null && veiculo.getAnoFabricacao() != null 
					  && (veiculo.getAnoFabricacao() >= anoFaixaFabricacao.getAnoInicio() 
					  && veiculo.getAnoFabricacao() <= anoFaixaFabricacao.getAnoFim()))) 
					  .collect(Collectors.mapping(
							  veiculo -> new Veiculo(veiculo.getId(), 
										veiculo.getDataLance(), 
										veiculo.getLote(), 
										veiculo.getCodigoControle(), 
										veiculo.getMarca(), 
										veiculo.getModelo(), 
										veiculo.getAnoFabricacao(), 
										veiculo.getAnoModelo(), 
										veiculo.getValorLance(), 
										veiculo.getUsuarioLance()),
						      Collectors.toList()));
			
		} else {
			
			veiculoFiltro = legadoList
					  .stream()
					  .collect(Collectors.mapping(
							  veiculo -> new Veiculo(veiculo.getId(), 
										veiculo.getDataLance(), 
										veiculo.getLote(), 
										veiculo.getCodigoControle(), 
										veiculo.getMarca(), 
										veiculo.getModelo(), 
										veiculo.getAnoFabricacao(), 
										veiculo.getAnoModelo(), 
										veiculo.getValorLance(), 
										veiculo.getUsuarioLance()),
						      Collectors.toList()));
			
		}
		
		return veiculoFiltro;
	}
	
	@Override
	public void excluirVeiculo(Long id) {
		
		OperacaoLegado operacaoLegado = new OperacaoLegado();
		operacaoLegado.setOperacao("alterar");
		VeiculoLegado veiculoLegado = new VeiculoLegado();
		veiculoLegado.setId(id);
		operacaoLegado.setVeiculo(veiculoLegado);
	
		repository.excluirVeiculo(operacaoLegado);

	}

}
