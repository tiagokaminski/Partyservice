package Panelvorlage;


import java.awt.EventQueue;
import java.util.HashMap;

import javax.swing.JFrame;

import javax.swing.SwingUtilities;


//import jpanels.Wilkommensscreen;
//import jpanels.Views;


public class MainGui extends JFrame {

	//private JPanel contentPane;
	
	private Wilkommensscreen wilkommensscreen = new Wilkommensscreen(this);
	private Livesuche livesuche = new Livesuche(this);
	private HashMap<Views, Panelvorlage> panels = new HashMap<>();

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGui frame = new MainGui();
					frame.setVisible(true);
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
		setBounds(100, 100, 450, 300);
		setContentPane(wilkommensscreen);
		
		panels.put(Views.wilkommensscreen, this.wilkommensscreen);
		panels.put(Views.liveSuche, this.livesuche);
	}

	public void switchTo(Views v) {
		setContentPane(this.panels.get(v));
		SwingUtilities.updateComponentTreeUI(this);
	}
}



