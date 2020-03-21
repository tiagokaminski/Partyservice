package Panelvorlage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class DynamischePanelsAusArrayMitScrollbar extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JScrollPane scrollPane;
	private String[] data= {"Fortnite", "CS:GO", "LoL", "Minecraft", "COD", "BF1", "Factorio", "Hearthstone", "Starcraft 2"};
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DynamischePanelsAusArrayMitScrollbar frame = new DynamischePanelsAusArrayMitScrollbar();
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
	public DynamischePanelsAusArrayMitScrollbar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 826, 564);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(null);
		{
			this.scrollPane = new JScrollPane();
			this.scrollPane.setBounds(65, 33, 210, 481);
			this.contentPane.add(this.scrollPane);
			{
				this.panel = new JPanel();
				this.scrollPane.setViewportView(this.panel);
				this.panel.setBorder(new LineBorder(new Color(0, 0, 0)));
				this.panel.setLayout(null);
				
			}
		}
		
		for(int i=0;i<this.data.length;i++) {
			JPanel gamePanel = new JPanel();
			gamePanel.setBorder(new LineBorder(Color.ORANGE, 2));
			gamePanel.setBounds(10, 10+i*70, 171, 59);
			this.panel.add(gamePanel);
			gamePanel.setLayout(null);
			JLabel title = new JLabel(this.data[i]);
			title.setBounds(21, 11, 46, 14);
			gamePanel.add(title);
		}
		this.panel.setPreferredSize(new Dimension(180,  this.data.length*70));
	

	}
}
