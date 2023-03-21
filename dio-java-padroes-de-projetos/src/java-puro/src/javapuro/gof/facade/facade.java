package javapuro.gof.facade;

import javapuro.subsistema1.crm.CrmService;
import javapuro.subsistema2.crp.CepApi;

public class facade {
  public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}