
package Panelvorlage;


import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


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
					//frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 


					//frame.setUndecorated(true);

					//frame.setExtendedState(MAXIMIZED_BOTH);
					frame.setResizable(true);

					//frame.setUndecorated(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	
	}

	/**
	 * Create the frame.8855
	 * @throws IOException 
	 */
	
	public MainGui() throws IOException {
		try {
			BufferedImage img=ImageIO.read(getClass().getResource("/logo_Smileyx32px.png"));
			setIconImage(img);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		setTitle("Partyservice");
		setResizable(false);
		
		//this.setContentPane(new JLabel(new ImageIcon("resource/projektPartyServiceHintergrung.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(BoundsCalc.calcBounds(0, 0,  BoundsCalc.WIDTH,  BoundsCalc.HEIGHT));
		setUndecorated(true);
		// setShape(new RoundRectangle2D.Double(0, 0, 1500, 900, 20,  20));
		getContentPane().setLayout(null);
		//setContentPane(startseite);
		//panels.put(Views.startseite, this.startseite);
		//panels.put(Views.profil, this.profil);
		//panels.put(Views.impressum, this.impressum);
		
		
		
		//Image img = new ImageIcon(this.getClass().getResource("closeButton.png")).getImage();
		
		
		
		this.setLocationRelativeTo(null);
		
		
//		setBounds(BoundsCalc.calcBounds(100, 100, 960, 540));
		
		
		switchToWithDelay(Views.anmeldescreen, 1000);
	
		
		panels.put(Views.wilkommensscreen, this.wilkommensscren);
		panels.put(Views.anmeldescreen, this.anmeldescreen);
		panels.put(Views.liveSuche, this.livesuche);
		panels.put(Views.sortiment, this.sortiment);
		panels.put(Views.warenkorb, this.warenkorb);
		panels.put(Views.kasse, this.kasse);
		switchTo(Views.wilkommensscreen);

	}

	/**
	 * man kann ein Timer für den Switch einstellen und zu einem anderen pannel switchen
	 * @param v
	 * @param zeitTimer
	 * 
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
		System.out.println(getContentPane().getGraphics());
		getContentPane().repaint();
		SwingUtilities.updateComponentTreeUI(this);
	}
	

	
}




