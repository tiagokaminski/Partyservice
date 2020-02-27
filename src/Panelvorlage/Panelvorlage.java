package Panelvorlage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Panelvorlage extends JPanel {
	Image img;
	private JLabel label = new JLabel();
	protected Views v;
	protected MainGui maingui;

	/**
	 * Create the panel.
	 */
	public Panelvorlage(MainGui maingui) {
		setOpaque(false);
	}
	
	
	public void setUeberschrift(String Ueberschrift) {
	

		setLayout(null);
		this.setSize(1920, 1080);
	}
	
	public void beautifyButton(JButton btn) {
		btn.setBackground(Color.CYAN);
		btn.setForeground(Color.BLACK);
	}
	
	@Override
	public void paint(Graphics g) {
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		
		try {
			BufferedImage img2=ImageIO.read(getClass().getResource("/closeButtonx46.png"));
			label.setIcon(new ImageIcon(img2));
			label.setBounds(1430, 15, 50, 50);
			add(label);
		} catch (IOException e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
		}
		try {
			BufferedImage img=ImageIO.read(getClass().getResource("/bg.png"));
		
			g.drawImage(img,0,0,null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.paint(g);

	}
}
