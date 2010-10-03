package br.com.siscoban.views;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.KeyStroke;


public class ViewLogin extends JInternalFrame {


	private static final long serialVersionUID = 1L;
	private JTextField usuarioText = new JTextField( 15 );
	private JPasswordField senhaText = new JPasswordField( 15 );
	private JButton buttonEntrar;
	private JPanel painelLogin;

	private GridBagConstraints c = new GridBagConstraints();

	
	
	
	public ViewLogin() {
		super("Identificação do Usuário",true,true,true,false);
		
		this.add(getPanelLogin());
		this.setSize(350,150);
		this.setVisible(true);
		
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension paneSize = this.getSize();
		
		this.setLocation((screenSize.width - paneSize.width) / 2, 
						 (screenSize.height - paneSize.height) / 2); 
	
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

			@Override
			public void actionPerformed(ActionEvent arg0) {
				doDefaultCloseAction();
				SiscobanFrame.getInstance().remove(SiscobanFrame.getInstance().getJMenuBar());
				SiscobanFrame.getInstance().setJMenuBar(new MenuPrincipal());
			}
			
		});
			/*@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				LoginModel modeloLogin = new LoginModel();
				usuario = new Usuario();
				usuario.setSenha(senhaText.getText());
				usuario.setUsuario(usuarioText.getText());
				try {
					usuario =  modeloLogin.usuarioOk( usuario );
					Constantes.usuario = usuario;
					
					MainFrame.getInstance().remove( MainFrame.getInstance().getJMenuBar()  );
					MainFrame.getInstance().setJMenuBar(new MenuPrincipal() );
					
					MainFrame.getInstance().remove( MainFrame.getInstance().getContentPane()  );
					MainFrame.getInstance().setContentPane(JanelaInicial.getInstance());
					
					MainFrame.getInstance().changeUI();
					
					MainFrame.getInstance().adicionaListeners();
					
				} 
				catch (DefaultException e1) {
					JOptionPane.showMessageDialog(null, e1.getMsg(), "APAC", JOptionPane.WARNING_MESSAGE);
					e1.printStackTrace();
					usuarioText.requestFocus();
					usuarioText.selectAll();
				}

			}
		});*/
		
		
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
