package br.com.siscoban.views.cadastrodeprodutos;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;

public class CadastroDeProduto extends JInternalFrame {

	private JPanel jContentPane = null;

	/**
	 * This is the xxx default constructor
	 */
	public CadastroDeProduto() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setContentPane(getJContentPane());
		this.setVisible(true);
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

}
