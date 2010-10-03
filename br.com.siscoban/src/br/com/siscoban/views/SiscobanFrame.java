package br.com.siscoban.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.HierarchyBoundsListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.awt.image.ColorModel;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;


public class SiscobanFrame extends JFrame {

	
	private static final long serialVersionUID = -1;
	private static SiscobanFrame instance = null;
	private JDesktopPane desktopPane;
	
	
	public SiscobanFrame () {
		super();
		initialize();
		
	}
	
	
	
	private void initialize() {

		JFrame.setDefaultLookAndFeelDecorated(true);

		desktopPane = new JDesktopPane();
		desktopPane.setBackground(new JPanel().getBackground());
		this.setContentPane(desktopPane);
		this.setJMenuBar(new MenuAjuda());
		
		this.setTitle("Siscoban");
		this.setVisible(true);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		this.getContentPane().addHierarchyBoundsListener(new HierarchyBoundsListener(){
			public void ancestorMoved(HierarchyEvent e) {
				setLocationRelativeTo(null);		
			}
			public void ancestorResized(HierarchyEvent e) {
				setExtendedState(JFrame.MAXIMIZED_BOTH);
			}			
		});

		chamaLogin();
		
	}
	
	private void chamaLogin() {
		ViewLogin viewLogin = new ViewLogin();
		desktopPane.add(viewLogin);
		try {
			viewLogin.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {}
	}



	public static SiscobanFrame getInstance () {
		if ( instance == null ) {
			return new SiscobanFrame();
		}
		return instance;
	}



	public static void main (String args[] ) throws Exception {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		instance = new SiscobanFrame();
	}
}

