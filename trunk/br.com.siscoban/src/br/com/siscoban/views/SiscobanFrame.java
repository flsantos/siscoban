package br.com.siscoban.views;

import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.HierarchyBoundsListener;
import java.awt.event.HierarchyEvent;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import br.com.siscoban.views.Login.ViewLogin;
import br.com.siscoban.views.Menus.MenuAjuda;




public class SiscobanFrame extends JFrame {

	
	private static final long serialVersionUID = -1;
	private static SiscobanFrame instance;
	private JDesktopPane desktopPane;
	
	
	public SiscobanFrame () {
		super();
		initialize();
		
	}
	
	
	
	private void initialize() {

		desktopPane = new JDesktopPane();
		desktopPane.setBackground(new JPanel().getBackground());
		this.setContentPane(desktopPane);
		this.setJMenuBar(new MenuAjuda());
		
		final Rectangle rec = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
		
		this.setTitle("Siscoban");
		this.setVisible(true);
		
		this.setSize(rec.width, rec.height);
		//this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		//this.setMinimumSize(new Dimension(screenWidth, screenHeight));
		//this.setMaximumSize(new Dimension(screenWidth, screenHeight));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setResizable(true);
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH); //Esse comando tira as bordas e deixa a tela mais feia
		this.getContentPane().addHierarchyBoundsListener(new HierarchyBoundsListener(){
			public void ancestorMoved(HierarchyEvent e) {
				//setLocationRelativeTo(null);
				setLocation(0,0);
			}
			public void ancestorResized(HierarchyEvent e) {
				setSize(rec.width, rec.height);
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
			instance = new SiscobanFrame();
		}
		return instance;
	}



	public static void main (String args[] ) throws Exception {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	   /* for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
	        if ("Nimbus".equals(info.getName())) {
	            UIManager.setLookAndFeel(info.getClassName());
	            break;
	        }
	        System.out.println(info.getName());
	    }*/
		JFrame.setDefaultLookAndFeelDecorated(true);

		instance = new SiscobanFrame();
		
	}




}

