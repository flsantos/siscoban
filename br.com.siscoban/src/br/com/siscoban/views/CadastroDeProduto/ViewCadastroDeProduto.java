
package br.com.siscoban.views.CadastroDeProduto;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.beans.PropertyVetoException;

import javax.swing.JInternalFrame;


public class ViewCadastroDeProduto extends JInternalFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final int frameHeight = 540;
	private static final int frameWidth = 600;
	
	private PainelCadastroDeProduto painel;

	public ViewCadastroDeProduto () {
		super("Cadastro de Produto", true, true, true, true);
		
		try {
			this.setSelected(true);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		
		painel = new PainelCadastroDeProduto();
		this.getContentPane().add(painel);
		
		
		

		this.setSize(frameWidth, frameHeight);
		this.setPreferredSize(new Dimension(frameWidth, frameHeight));
		this.setVisible(true);
		
		Rectangle screenSize = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
		Dimension paneSize = this.getSize();
		this.setLocation((screenSize.width - paneSize.width) / 2, (screenSize.height - paneSize.height - 100) / 2); 
		
	}
	
	
	
}