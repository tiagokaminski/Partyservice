
package Panelvorlage;


import java.awt.EventQueue;
import java.util.HashMap;

import javax.swing.JFrame;

import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;


public class MainGui extends JFrame {

	private Anmeldescreen anmeldescreen = new Anmeldescreen(this);
	private Wilkommensscreen wilkommensscren = new Wilkommensscreen(this);
	private Livesuche livesuche = new Livesuche(this);
	private Sortiment sortiment = new Sortiment(this);
	private Warenkorb warenkorb = new Warenkorb(this);
	private Kasse kasse = new Kasse(this);
	private HashMap<Views, Panelvorlage> panels = new HashMap<>();
	private Timer t;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGui frame = new MainGui();
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
					frame.setUndecorated(true);
					frame.setExtendedState(MAXIMIZED_BOTH);
					frame.setResizable(true);

					//frame.setUndecorated(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 540);
		setContentPane(wilkommensscren);
		
		
		switchToWithDelay(Views.anmeldescreen, 4000);
	
		
		panels.put(Views.wilkommensscreen, this.wilkommensscren);
		panels.put(Views.anmeldescreen, this.anmeldescreen);
		panels.put(Views.liveSuche, this.livesuche);
		panels.put(Views.sortiment, this.sortiment);
		panels.put(Views.warenkorb, this.warenkorb);
		panels.put(Views.kasse, this.kasse);
	}

	/**
	 * man kann ein Timer f�r den Switch einstellen und zu einem anderen pannel switchen
	 * @param v
	 * @param zeitTimer
	 */
	public void switchToWithDelay(Views v, int zeitTimer) {
		t=new Timer(zeitTimer, e ->  {
			switchTo(v);
			t.stop();
		});
		t.start();
	}
	
	public void switchTo(Views v) {
		setContentPane(this.panels.get(v));
		SwingUtilities.updateComponentTreeUI(this);
	}
	
}




