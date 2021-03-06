
package Panelvorlage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.OverlayLayout;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class Panelvorlage extends JPanel {
	Image img;
	private JLabel labelCloseBtn = new JLabel();
	private JLabel ueberschrift;
	protected Views v;
	protected MainGui maingui;
	private JPanel headerPanel;
	
	/**
	 * Create the panel.
	 */
	public Panelvorlage(MainGui maingui){
		this.maingui = maingui;
		initGUI();
	}
	
	private void initGUI() {
		try {
			
			this.headerPanel=new JPanel();
			this.headerPanel.setLayout(null);
			this.headerPanel.setBounds(0, 0, 180, 90);
			this.headerPanel.setBackground(Color.magenta);
			this.headerPanel.setOpaque(true);
			this.add(this.headerPanel);
			
			setBackground(Color.LIGHT_GRAY);
			setLayout(null);
			setOpaque(false);
			this.ueberschrift=new JLabel();
			this.ueberschrift.setBounds(0, 0, 1500, 90);
			ueberschrift.setVerticalAlignment(SwingConstants.BOTTOM);
			ueberschrift.setFont(new Font("Tahoma", Font.PLAIN, 69));
		this.ueberschrift.setOpaque(false);			
	this.setSize(200, 200);
			
			
			BufferedImage img2=ImageIO.read(getClass().getResource("/closeButtonx46.png"));
			labelCloseBtn.setIcon(new ImageIcon(img2));
			this.labelCloseBtn.setBounds(1500, 0, 100, 90);

			labelCloseBtn.setOpaque(false);
			labelCloseBtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					System.exit(0);
				}
			});
			this.headerPanel.add(labelCloseBtn);
			this.headerPanel.add(this.ueberschrift);

			repaint();
		

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void setUeberschrift(String Ueberschrift) {	
		this.ueberschrift.setText(Ueberschrift);
	}
	
	public void beautifyButton(JButton btn) {
		btn.setBackground(Color.CYAN);
		btn.setForeground(Color.BLACK);
	}

	//@Override
//	public void paint(Graphics g) {
//		AbstractButton label = null;
//		label.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				System.exit(0);
//			}
//		});
//		
//		try {
//			BufferedImage img2=ImageIO.read(getClass().getResource("/closeButtonx46.png"));
//			label.setIcon(new ImageIcon(img2));
//			label.setBounds(1430, 15, 50, 50);
//			add(label);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//		
//			e.printStackTrace();
//		}
//		try {
//			BufferedImage img=ImageIO.read(getClass().getResource("/bg.png"));
//		
//			g.drawImage(img,0,0,null);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		super.paint(g);
//
//	}
}
	

