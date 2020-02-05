import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Application extends Frame implements WindowListener {

	public static void main(String[] args) {
		new Application();
	}
	
	Modele modl;
	
	public Application() {
		super();
		
		this.modl = new Modele();
		Controleur ctrl = new Controleur(modl); 
		Vue vue = new Vue();
		modl.addObserver(vue);
		vue.addActionListener(ctrl);
		this.setTitle("tutoriel git");
		this.addWindowListener(this);
		this.add(vue);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
