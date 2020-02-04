import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Data extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Data frame = new Data();
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
	public Data() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1075, 685);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//setUndecorated(true);
		
		Label label = new Label("Mr. Tony Satark");
		label.setBackground(SystemColor.scrollbar);
		label.setFont(new Font("Dialog", Font.BOLD, 17));
		label.setBounds(134, 310, 152, 21);
		contentPane.add(label);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(0, 102, 255));
		panel.setBounds(-11, 0, 1260, 100);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Label label_1 = new Label("CANDIDATES");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(399, 0, 258, 81);
		panel.add(label_1);
		label_1.setFont(new Font("Dialog", Font.BOLD, 37));
		
		Label label_2 = new Label("<~");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				HomePage f=new HomePage();
				f.setVisible(true);
			}
		});
		label_2.setFont(new Font("Arial", Font.BOLD, 16));
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(10, 10, 59, 21);
		panel.add(label_2);
		
		Label label_3 = new Label("Mr. Steve Rogers");
		label_3.setBackground(SystemColor.scrollbar);
		label_3.setFont(new Font("Dialog", Font.BOLD, 17));
		label_3.setForeground(Color.BLACK);
		label_3.setBounds(476, 310, 140, 21);
		contentPane.add(label_3);
		
		Label label_4 = new Label("Mr. Nick Fury");
		label_4.setBackground(SystemColor.scrollbar);
		label_4.setFont(new Font("Dialog", Font.BOLD, 17));
		label_4.setBounds(812, 310, 118, 21);
		contentPane.add(label_4);
		
		Label label_5 = new Label("Mr. Bruce Wayne");
		label_5.setBackground(new Color(153, 153, 153));
		label_5.setFont(new Font("Dialog", Font.BOLD, 17));
		label_5.setBounds(284, 579, 140, 21);
		contentPane.add(label_5);
		
		Label label_6 = new Label("Mr. Wade Wilson");
		label_6.setBackground(new Color(153, 153, 153));
		label_6.setFont(new Font("Dialog", Font.BOLD, 17));
		label_6.setBounds(649, 579, 140, 21);
		contentPane.add(label_6);
		
		JLabel label_8 = new JLabel("New label");
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				NickFury nf=new NickFury();
				nf.setVisible(true);
			}
		});
		label_8.setIcon(new ImageIcon(Data.class.getResource("/eleimage/nick.jpg")));
		label_8.setBounds(802, 119, 140, 185);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("New label");
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				BruceWayne bw=new BruceWayne();
				bw.setVisible(true);
			}
		});
		label_9.setIcon(new ImageIcon(Data.class.getResource("/eleimage/bruce.jpg")));
		label_9.setBounds(284, 380, 140, 185);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("New label");
		label_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				WadwWilson ww=new WadwWilson();
				ww.setVisible(true);
			}
		});
		label_10.setIcon(new ImageIcon(Data.class.getResource("/eleimage/wade.png")));
		label_10.setBounds(649, 388, 140, 185);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("New label");
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				dispose();
				tonysatark ts=new tonysatark();
				ts.setVisible(true);
			}
		});
		label_11.setIcon(new ImageIcon(Data.class.getResource("/eleimage/tony.jpg")));
		label_11.setBounds(134, 119, 140, 185);
		contentPane.add(label_11);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				SteveRogers sr=new SteveRogers();
				sr.setVisible(true);
				
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Data.class.getResource("/eleimage/cap1.jpg")));
		lblNewLabel.setBounds(476, 119, 126, 185);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setIcon(new ImageIcon(Data.class.getResource("/images/bach.jpg")));
		lblNewLabel_1.setBounds(-1, 99, 1058, 539);
		contentPane.add(lblNewLabel_1);
	}
}
