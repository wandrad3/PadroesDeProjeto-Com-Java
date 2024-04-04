package one.digitalinnovation.gof.facade;

import subsistema.cep.CepApi;
import subsistema.crm.CrmService;

/**
 * 
 */
public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstacy().recuperarCidade();
		String estado = CepApi.getInstacy().recuperarEstado();
		CrmService.gravarCliente(nome, cep, cidade,estado);
		
		
		
	}
}
