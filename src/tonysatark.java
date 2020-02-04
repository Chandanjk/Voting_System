import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Label;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.TextField;
import javax.swing.JTextArea;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class tonysatark extends JFrame {

	private JPanel contentPane;
	private TextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tonysatark frame = new tonysatark();
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
	public tonysatark() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1234, 689);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(0, 102, 255));
		panel.setBounds(0, 0, 1230, 80);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Label label = new Label("Mr. Tony Satark");
		label.setFont(new Font("Dialog", Font.BOLD, 37));
		label.setForeground(Color.WHITE);
		label.setBounds(435, -10, 355, 80);
		panel.add(label);
		
		Label label_3 = new Label("<~");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Data d=new Data();
				d.setVisible(true);
			}
		});
		label_3.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(10, 10, 59, 21);
		panel.add(label_3);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(tonysatark.class.getResource("/eleimage/tony.jpg")));
		lblNewLabel_1.setBounds(1008, 96, 140, 185);
		contentPane.add(lblNewLabel_1);
		
		Label label_1 = new Label("Satark Party");
		label_1.setFont(new Font("Dialog", Font.BOLD, 14));
		label_1.setBounds(1018, 332, 115, 30);
		contentPane.add(label_1);
		
		textArea = new TextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setFont(new Font("Dialog", Font.BOLD, 22));
		textArea.setText("Anthony Edward Stark is the son of wealthy industrialist and head\r\nof Stark Industries, Howard Stark, and Maria Stark. A boy genius, \r\nhe enters MIT at the age of 15 to study engineering and later \r\nreceives master's degrees in engineering and physics. After his \r\nparents are killed in a car accident, he inherits his father's company.\r\nStark is injured by a booby trap and captured by enemy forces\r\nled by Wong-Chu. Wong-Chu orders Stark to build weapons,\r\nbut Stark's injuries are dire and shrapnel is moving towards\r\nhis heart. His fellow prisoner, Ho Yinsen, a Nobel Prize-winning \r\nphysicist whose work Stark had greatly admired during college,\r\nconstructs a magnetic chest plate to keep the shrapnel from \r\nreaching Stark's heart. In secret, Stark and Yinsen use the workshop\r\nto design and construct a suit of powered armor, which Stark uses \r\nto escape. During the escape attempt, Yinsen sacrifices his life to\r\nsave Stark's by distracting the enemy as Stark recharges. Stark \r\ntakes revenge on his kidnappers and rejoins the American forces,\r\non his way meeting a wounded American Marine fighter pilot,\r\nJames \"Rhodey\" Rhodes. ");
		textArea.setBounds(36, 108, 893, 541);
		contentPane.add(textArea);
		
		Label label_2 = new Label("Mr Tony Satark");
		label_2.setFont(new Font("Dialog", Font.BOLD, 13));
		label_2.setBounds(1018, 294, 152, 21);
		contentPane.add(label_2);
	}
}