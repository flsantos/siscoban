import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JFrame;


public class SiscobanFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private static SiscobanFrame instance;

	/**
	 * This is the default constructor
	 */
	public SiscobanFrame() {
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
		this.setTitle("JFrame");
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
	
	
	public static void main ( String args[] ) {
		
		getInstance().setVisible(true);
		
	}

	private static SiscobanFrame getInstance() {
		if (instance == null) {
			instance = new SiscobanFrame();
		}
		
		return instance;
	}

}
