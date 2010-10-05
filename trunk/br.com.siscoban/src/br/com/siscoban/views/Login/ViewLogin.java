package br.com.siscoban.views.Login;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import br.com.siscoban.models.ModelLogin;
import br.com.siscoban.pojos.Usuario;
import br.com.siscoban.utils.DefaultException;
import br.com.siscoban.views.SiscobanFrame;
import br.com.siscoban.views.Menus.MenuPrincipal;



public class ViewLogin extends JInternalFrame {


	private static final long serialVersionUID = 1L;
	private JTextField usuarioText = new JTextField( 15 );
	private JPasswordField senhaText = new JPasswordField( 15 );
	private JButton buttonEntrar;
	private JPanel painelLogin;

	private GridBagConstraints c = new GridBagConstraints();

	
	
	
	public ViewLogin() {
		super("Identificação do Usuário",false,false,false,false);
		
		
		
		this.getContentPane().add(getPanelLogin());
		this.setSize(350,150);
		this.setVisible(true);

		Rectangle screenSize = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
		Dimension paneSize = this.getSize();
		
		
		this.setLocation((screenSize.width - paneSize.width) / 2, (screenSize.height - paneSize.height - 100) / 2); 
		
	
	}

	private JPanel getPanelLogin() {

		painelLogin = new JPanel();
		
		painelLogin.setLayout(new GridBagLayout());
		c.fill = GridBagConstraints.HORIZONTAL;
		
		labels();
		fields();
		buttons();
		listeners();
		
		usuarioText.requestFocus();
		usuarioText.grabFocus();
		usuarioText.setText("");
		senhaText.setText("");

		painelLogin.setMinimumSize(new Dimension(200, 100));
		painelLogin.setPreferredSize(new Dimension(200, 100));
		return painelLogin;
	}


	public void labels(){
		c.gridx = 0; c.gridy = 0;
		painelLogin.add(new JLabel("Usuário: "), c);
		
		c.gridx = 1; c.gridy = 0;
		painelLogin.add(new JLabel("Senha: "), c);
	}
	
	public void fields(){
		c.gridx = 0; c.gridy = 1;
		painelLogin.add(usuarioText, c);
		
		c.gridx = 1; c.gridy = 1;
		painelLogin.add(senhaText, c);
	}
	
	public void buttons(){
		buttonEntrar = new JButton("Ok");
		c.gridx = 0;c.gridy = 2;
		c.gridwidth = 2;
		c.insets = new Insets(13,80,0,80);
		painelLogin.add(buttonEntrar, c);
	}
	
	public void listeners(){		
		buttonEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Usuario usuario = new Usuario();
				usuario.setLogin(usuarioText.getText());
				usuario.setSenha(senhaText.getPassword());
				ModelLogin modelLogin = new ModelLogin(usuario);
				
				try  {
					modelLogin.usuarioOk();
					
					doDefaultCloseAction();
					SiscobanFrame.getInstance().remove(SiscobanFrame.getInstance().getJMenuBar());
					SiscobanFrame.getInstance().setJMenuBar(new MenuPrincipal());
				}
				catch (DefaultException de) {
					JOptionPane.showMessageDialog(null, de.getMsg(), "Siscoban", JOptionPane.WARNING_MESSAGE);
					//de.printStackTrace();
					usuarioText.selectAll();
					usuarioText.requestFocus();
				}
			}
			
		});
			
		
		
		usuarioText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				senhaText.requestFocus();
				if (!senhaText.getPassword().equals(""))
					senhaText.selectAll();
			}
		});
		
		
		senhaText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buttonEntrar.requestFocus();
			}
		});
		

	    buttonEntrar.registerKeyboardAction(
	    		buttonEntrar.getActionForKeyStroke(
	        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)), 
	        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), 
	        JComponent.WHEN_FOCUSED
	      );

	    buttonEntrar.registerKeyboardAction(
	    		buttonEntrar.getActionForKeyStroke(
	        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)), 
	        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), 
	        JComponent.WHEN_FOCUSED
	        
	      );

	}
	
}
