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
import java.awt.Label;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WadwWilson extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WadwWilson frame = new WadwWilson();
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
	public WadwWilson() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1234, 687);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(5, 5, 1210, 0);
		panel.setLayout(null);
		panel.setBackground(new Color(0, 102, 255));
		contentPane.add(panel);
		
		Label label = new Label("Mr.Bruce Wayne");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dialog", Font.BOLD, 37));
		label.setBounds(392, 8, 366, 62);
		panel.add(label);
		
		Panel panel_1 = new Panel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 102, 255));
		panel_1.setBounds(-3, 0, 1218, 82);
		contentPane.add(panel_1);
		
		Label label_1 = new Label("Mr.Wade Wilson");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Dialog", Font.BOLD, 37));
		label_1.setBounds(392, 8, 366, 62);
		panel_1.add(label_1);
		
		Label label_4 = new Label("<~");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Data d=new Data();
				d.setVisible(true);
			}
		});
		label_4.setFont(new Font("Dialog", Font.BOLD, 18));
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(10, 8, 59, 21);
		panel_1.add(label_4);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon(WadwWilson.class.getResource("/eleimage/wade.png")));
		label_2.setBounds(1018, 126, 140, 185);
		contentPane.add(label_2);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea.setText("Wade Wilson was born on November 22, 1973 in Vancouver, British Columbia, \r\nCanada. Wade was the result of an affair between Slade Wilson and his sister-in\r\n-law at the time, Hailey Wilson. As a child, Wade was raised by his mother and \r\nhis uncle, Mickey, whom he believed to be his biological father.\r\n\r\nHe later gave many conflicting reports regarding his childhood. Among these \r\nwas his claiming that his father abandoned his mother while she was pregnant \r\nwith him and she took out her anger on him until, as an adult, he beat her instead.\r\n He also claimed that his mother died when he was five and that his father, an \r\narmy officer, became abusive, causing Wade to grow up to be a thug and criminal.\r\n When his father got his act together and tried to rein in his son, one of Wade's \r\nfriends shot and killed him. On another occasion, he told a writer that his father \r\nwas a teller of bad jokes who abandoned him and his mother while he was a boy.\r\n And because of this his mother turned to humor, alcohol and home shopping \r\nnetworks as a coping mechanism. He believed that he ran away from home so that\r\n his mother wouldn't need to spend what little money she had left on him. All of \r\nthese accounts appeared to either be false memories implanted in his mind or lies \r\nmade up by himself.");
		textArea.setBounds(7, 88, 985, 567);
		contentPane.add(textArea);
		
		Label label_3 = new Label("Mr. Wade Wilson");
		label_3.setFont(new Font("Dialog", Font.BOLD, 13));
		label_3.setBounds(1018, 334, 140, 21);
		contentPane.add(label_3);
		
		Label label_5 = new Label("X Party");
		label_5.setFont(new Font("Dialog", Font.BOLD, 13));
		label_5.setBounds(1058, 372, 66, 21);
		contentPane.add(label_5);
	}

}