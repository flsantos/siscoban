package br.com.siscoban.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MenuAjuda extends JMenuBar implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JMenu ajuda;
	private JMenuItem siscoban;
	private JMenuItem manual;
	
	public MenuAjuda(){
		ajuda = new JMenu("AJUDA");
		
		siscoban = new JMenuItem("Sobre o Siscoban");
		siscoban.addActionListener(this);
		ajuda.add(siscoban);
		
		manual = new JMenuItem("Manual de Uso");
		manual.addActionListener(this);
		ajuda.add(manual);
		
		this.add(ajuda);
	}

	public void actionPerformed(ActionEvent e) {
		JMenuItem source = (JMenuItem)(e.getSource());
		if( source == siscoban ){
			//MainFrame.getInstance().alterarPainel(new AjudaAPAC (new ViewLogin(), null), null);
		} else if( source == manual ){
			//MainFrame.getInstance().alterarPainel(new AjudaCJR (new ViewLogin(), null), null);
		}
	}
}
