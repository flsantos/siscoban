package br.com.siscoban.views.Menus;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import br.com.siscoban.views.SiscobanFrame;
import br.com.siscoban.views.CadastroDeProduto.ViewCadastroDeProduto;

public class MenuPrincipal extends JMenuBar implements ActionListener {

	
	private static final long serialVersionUID = 1L;
	
	private JMenu produtos;
	private JMenu caixa;
	private JMenu orcamento;
	private JMenu contasAPagar;
	private JMenu clientes;
	private JMenu devolucao;
	private JMenu reservas;
	private JMenu tabelas;
	private JMenu consultas;
	private JMenu utilitarios;
	private JMenu sair;
	private JMenu ajuda;
	
	
	private JMenuItem cadastroProduto;
	private JMenuItem cadastroCorrecao;
	private JMenuItem cadastroIdentificacao;
	
	private JMenuItem caixaVendas;
	private JMenuItem caixaAbertura;
	private JMenuItem caixaSangria;
	private JMenuItem caixaReforco;
	private JMenuItem caixaFechamento;
	
	private JMenuItem orcamentoCriar;
	
	private JMenuItem contasAPagarLancamento;
	
	private JMenuItem clientesManutencao;
	private JMenuItem clientesEnviaEmail;
	
	private JMenuItem devolucaoLancamento;
	
	private JMenuItem reservasManutencao;
	private JMenuItem reservasPesquisa;
	
	private JMenuItem tabelasHistorico;
	private JMenuItem tabelasGrupoRecurso;
	private JMenuItem tabelasGenero;
	private JMenuItem tabelasGruposProduto;
	private JMenuItem tabelasUsuarios;
	private JMenuItem tabelasFornecedores;
	
	private JMenuItem consultasVendas;
	private JMenuItem consultasPosicaoCliente;
	private JMenuItem consultasExtratoContaEspecial;
	private JMenuItem consultasPosicaoContasAPagar;
	private JMenuItem consultasSangriaCaixa;
	private JMenuItem consultasEntradaProdutos;
	private JMenuItem consultasRelatorioClientesDebito;
	private JMenuItem consultasFechamentoCaixa;
	private JMenuItem consultasRelatorioEstoqueFisicoFinanceiro;
	private JMenuItem consultasTabelaPreco;
	private JMenuItem consultasAnaliseResultado;
	private JMenuItem consultasTransacaoVenda;
	
	private JMenuItem utilitariosManutencaoEmpresa;
	private JMenuItem utilitariosManutencaoTabelas;
	private JMenuItem utilitariosManutencaoImpressoraFiscal;
	
	private JMenuItem siscoban;
	private JMenuItem manual;
	
	
	
	public MenuPrincipal () {
		
		produtos = new JMenu("Produtos");
			
			cadastroProduto = new JMenuItem("Cadastro de Produtos");
			cadastroProduto.addActionListener(this);
			produtos.add(cadastroProduto);
			
			cadastroCorrecao = new JMenuItem("Correção de Estoque");
			cadastroCorrecao.addActionListener(this);
			produtos.add(cadastroCorrecao);
			
			cadastroIdentificacao = new JMenuItem("Identificação do Usuário");
			cadastroIdentificacao.addActionListener(this);
			produtos.add(cadastroIdentificacao);
		
			this.add(produtos);

		caixa = new JMenu ("Caixa");
		
			caixaVendas = new JMenuItem("Vendas");
			caixaVendas.addActionListener(this);
			caixa.add(caixaVendas);
			
			caixaAbertura = new JMenuItem("Abertura");
			caixaAbertura.addActionListener(this);
			caixa.add(caixaAbertura);
			
			caixaSangria = new JMenuItem("Sangria");
			caixaSangria.addActionListener(this);
			caixa.add(caixaSangria);
			
			caixaReforco = new JMenuItem("Reforço");
			caixaReforco.addActionListener(this);
			caixa.add(caixaReforco);
			
			caixaFechamento = new JMenuItem("Fechamento");
			caixaFechamento.addActionListener(this);
			caixa.add(caixaFechamento);
		
			
			this.add(caixa);
			
		orcamento = new JMenu("Orçamento");
		
			orcamentoCriar = new JMenuItem("Criar");
			orcamentoCriar.addActionListener(this);
			orcamento.add(orcamentoCriar);
			
			this.add(orcamento);
			
		contasAPagar = new JMenu("Contas a Pagar");
		
			contasAPagarLancamento = new JMenuItem("Lançamento");
			contasAPagarLancamento.addActionListener(this);
			contasAPagar.add(contasAPagarLancamento);
			
			this.add(contasAPagar);
			
		clientes = new JMenu("Clientes");
		
			clientesManutencao = new JMenuItem("Manutenção de Clientes");
			clientesManutencao.addActionListener(this);
			clientes.add(clientesManutencao);
			
			clientesEnviaEmail = new JMenuItem("Envia Emails");
			clientesEnviaEmail.addActionListener(this);
			clientes.add(clientesEnviaEmail);
		
			this.add(clientes);
		
			
		devolucao = new JMenu("Devolução");
			
			devolucaoLancamento = new JMenuItem("Lançamento");
			devolucaoLancamento.addActionListener(this);
			devolucao.add(devolucaoLancamento);
			
			this.add(devolucao);
			
		reservas = new JMenu("Reservas");
		
			reservasManutencao = new JMenuItem("Manutenção de Reservas");
			reservasManutencao.addActionListener(this);
			reservas.add(reservasManutencao);
			
			reservasPesquisa = new JMenuItem("Pesquisa Reservas");
			reservasPesquisa.addActionListener(this);
			reservas.add(reservasPesquisa);
			
			this.add(reservas);
			
			
		tabelas = new JMenu("Tabelas");
		
			tabelasHistorico = new JMenuItem("Histórico");
			tabelasHistorico.addActionListener(this);
			tabelas.add(tabelasHistorico);
			
			tabelasGrupoRecurso = new JMenuItem("Grupo de Recurso");
			tabelasGrupoRecurso.addActionListener(this);
			tabelas.add(tabelasGrupoRecurso);
			
			tabelasGenero = new JMenuItem("Gênero");
			tabelasGenero.addActionListener(this);
			tabelas.add(tabelasGenero);
			
			tabelasGruposProduto = new JMenuItem("Grupo de Produtos");
			tabelasGruposProduto.addActionListener(this);
			tabelas.add(tabelasGruposProduto);
			
			tabelasUsuarios = new JMenuItem("Usuários Siscoban");
			tabelasUsuarios.addActionListener(this);
			tabelas.add(tabelasUsuarios);
			
			tabelasFornecedores = new JMenuItem("Fornecedores");
			tabelasFornecedores.addActionListener(this);
			tabelas.add(tabelasFornecedores);
			
			this.add(tabelas);
		
			
		consultas = new JMenu("Consultas");
		
				
			consultasVendas = new JMenuItem("Posição das Vendas");
			consultasVendas.addActionListener(this);
			consultas.add(consultasVendas);
			
			consultasPosicaoCliente = new JMenuItem("Posição do Cliente");
			consultasPosicaoCliente.addActionListener(this);
			consultas.add(consultasPosicaoCliente);
			
			consultasExtratoContaEspecial = new JMenuItem("Extrato Conta Especial");
			consultasExtratoContaEspecial.addActionListener(this);
			consultas.add(consultasExtratoContaEspecial);
			
			consultasPosicaoContasAPagar = new JMenuItem("Posição de Contas a Pagar");
			consultasPosicaoContasAPagar.addActionListener(this);
			consultas.add(consultasPosicaoContasAPagar);
			
			consultasSangriaCaixa = new JMenuItem("Consulta Sangria no Caixa");
			consultasSangriaCaixa.addActionListener(this);
			consultas.add(consultasSangriaCaixa);
			
			consultasEntradaProdutos = new JMenuItem("Consulta Entrada de Produtos");
			consultasEntradaProdutos.addActionListener(this);
			consultas.add(consultasEntradaProdutos);
			
			consultasRelatorioClientesDebito = new JMenuItem("Relatório Geral de Clientes com Débito");
			consultasRelatorioClientesDebito.addActionListener(this);
			consultas.add(consultasRelatorioClientesDebito);
			
			consultasFechamentoCaixa = new JMenuItem("Consulta Fechamento de Caixa");
			consultasFechamentoCaixa.addActionListener(this);
			consultas.add(consultasFechamentoCaixa);
			
			consultasRelatorioEstoqueFisicoFinanceiro = new JMenuItem("Relatório de Estoque Físico/Financeiro");
			consultasRelatorioEstoqueFisicoFinanceiro.addActionListener(this);
			consultas.add(consultasRelatorioEstoqueFisicoFinanceiro);
			
			consultasTabelaPreco = new JMenuItem("Tabela de Preços");
			consultasTabelaPreco.addActionListener(this);
			consultas.add(consultasTabelaPreco);
			
			consultasAnaliseResultado = new JMenuItem("Consulta Análise de Resultado");
			consultasAnaliseResultado.addActionListener(this);
			consultas.add(consultasAnaliseResultado);
			
			consultasTransacaoVenda = new JMenuItem("Consulta Transação de Venda");
			consultasTransacaoVenda.addActionListener(this);
			consultas.add(consultasTransacaoVenda);
			
			this.add(consultas);
			
		utilitarios = new JMenu("Utilitarios");
		
			utilitariosManutencaoEmpresa = new JMenuItem("Manutenção Empresa");
			utilitariosManutencaoEmpresa.addActionListener(this);
			utilitarios.add(utilitariosManutencaoEmpresa);
			
			utilitariosManutencaoTabelas = new JMenuItem("Manutenção Tabelas");
			utilitariosManutencaoTabelas.addActionListener(this);
			utilitarios.add(utilitariosManutencaoTabelas);
			
			utilitariosManutencaoImpressoraFiscal = new JMenuItem("Manutenção Impressora Fiscal");
			utilitariosManutencaoImpressoraFiscal.addActionListener(this);
			utilitarios.add(utilitariosManutencaoImpressoraFiscal);
			
			this.add(utilitarios);
		
		
		sair = new JMenu("Sair");
		
			sair.addActionListener(this);
			this.add(sair);
			

		ajuda = new JMenu("Ajuda");
			
			siscoban = new JMenuItem("Sobre o Siscoban");
			siscoban.addActionListener(this);
			ajuda.add(siscoban);
			
			manual = new JMenuItem("Manual de Uso");
			manual.addActionListener(this);
			ajuda.add(manual);
		
			this.add(ajuda);
				
	}

	public void actionPerformed(ActionEvent arg0) {
		JMenuItem source = (JMenuItem)(arg0.getSource());
		
		if (source == cadastroProduto) {
			SiscobanFrame.getInstance().getContentPane().add(new ViewCadastroDeProduto());
		}else if (source == cadastroCorrecao) {
			//Chama a janela de correção
		}
		
		
	}
}
