package br.com.siscoban.views;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Dimension;
import javax.swing.JMenuItem;

import br.com.siscoban.views.cadastrodeprodutos.CadastroDeProduto;

import java.awt.event.KeyEvent;

public class SiscobanFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JMenuBar menuPrincipal = null;
	private JMenu menuCadastro = null;
	private JMenuItem itemProduto = null;
	private CadastroDeProduto cadastroDeProduto;
	
	/**
	 * This is the default constructor
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws  
	 */
	public SiscobanFrame() throws Exception {
		super();
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(800, 600);
		this.setJMenuBar(getMenuPrincipal());
		this.setTitle("Siscoban");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
		}
		return jContentPane;
	}

	/**
	 * This method initializes menuPrincipal	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getMenuPrincipal() {
		if (menuPrincipal == null) {
			menuPrincipal = new JMenuBar();
			menuPrincipal.setPreferredSize(new Dimension(0, 25));
			menuPrincipal.add(getMenuCadastro());
		}
		return menuPrincipal;
	}

	/**
	 * This method initializes menuCadastro	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getMenuCadastro() {
		if (menuCadastro == null) {
			menuCadastro = new JMenu();
			menuCadastro.setText("Cadastro");
			menuCadastro.setToolTipText("Cadastro");
			menuCadastro.add(getItemProduto());
		}
		return menuCadastro;
	}

	/**
	 * This method initializes itemProduto	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getItemProduto() {
		if (itemProduto == null) {
			itemProduto = new JMenuItem();
			itemProduto.setText("Cadastro de Produtos");
			itemProduto.setMnemonic(KeyEvent.VK_UNDEFINED);
			itemProduto.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					cadastroDeProduto = new CadastroDeProduto();
				}
			});
		}
		return itemProduto;
	}

}
