package Panelvorlage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class JFrameTestPanel extends JFrame {

	private JPanel contentPane;
	
	private JPanel panel1;
	private JPanel panel2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameTestPanel frame = new JFrameTestPanel();
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
	public JFrameTestPanel() {
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel1 = new JPanel();
		panel1.setBounds(10, 11, 197, 239);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(6, 7, 97, 23);
		panel1.add(chckbxNewCheckBox);
		
		panel2 = new JPanel();
		panel2.setBounds(217, 11, 207, 239);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 11, 89, 23);
		panel2.add(btnNewButton);
	}

	/**
	 * SO GEHT ES !!!
	 */
	public void setPanel1(JPanel panel1) {
		contentPane.remove(this.panel1);
		panel1.setBounds(10, 11, 197, 239);
		contentPane.add(panel1);
	}

	/**
	 * So geht es nicht.
	 */
	public void setPanel2(JPanel panel2) {
		this.panel2 = panel2;
		this.panel2.setBounds(10, 11, 197, 239);
		this.repaint();
	}
}
