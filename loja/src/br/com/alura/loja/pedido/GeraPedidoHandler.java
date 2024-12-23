package br.com.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoBancoDeDados;

public class GeraPedidoHandler {
	
	//construtor com injeção de dependências: repository, service, etc ...
	private List<AcaoAposGerarPedido> acoes;
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}
	
	public void executar(GeraPedido dados) {
		Orcamento orcamento = new Orcamento();
		orcamento.addItem(new ItemOrcamento(dados.getValorOrcamento()));
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		this.acoes.forEach(acao -> acao.executarAcao(pedido));
	}
}