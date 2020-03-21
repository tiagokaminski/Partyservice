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
	private JButton buttonNewButton_1;

	public Anmeldescreen(MainGui mainGui) {
		super(mainGui);
		initGUI();

		
	}
	private void initGUI() {
			JButton buttonNewButton = new JButton("Gast");
			buttonNewButton.setBorder(BorderFactory.createEmptyBorder());
			buttonNewButton.setContentAreaFilled(false);
			try {
				buttonNewButton.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/button.png"))));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			buttonNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonNewButtonActionPerformed(e);
				}
			});
			setLayout(null);
			buttonNewButton.setBounds(BoundsCalc.calcBounds(300, 300, 200, 100));
			add(buttonNewButton);
			
		
	}
	protected void buttonNewButtonActionPerformed(ActionEvent e) {
		maingui.switchTo(v.liveSuche);
	}
}
