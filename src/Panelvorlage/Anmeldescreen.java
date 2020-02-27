package Panelvorlage;

import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Anmeldescreen extends Panelvorlage {
	private JButton buttonNewButton;

	public Anmeldescreen(MainGui mainGui) {
		super(mainGui);
		initGUI();

		
	}
	private void initGUI() {
			 
			try {
			
			JButton buttonNewButton = new JButton("Gast");
			buttonNewButton.setBorder(BorderFactory.createEmptyBorder());
			buttonNewButton.setContentAreaFilled(false);
			buttonNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonNewButtonActionPerformed(e);
				}
			});
			setLayout(null);
			buttonNewButton.setBounds(1200, 30, 200, 25);
			add(buttonNewButton);
			} catch (IOException e1) {
				System.out.println("Bild nicht gefunden, oder andere Fehler");
				
				e1.printStackTrace();
			}
	}
	protected void buttonNewButtonActionPerformed(ActionEvent e) {
		maingui.switchTo(v.liveSuche);
	}
}
