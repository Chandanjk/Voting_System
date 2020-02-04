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

public class NickFury extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NickFury frame = new NickFury();
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
	public NickFury() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1234, 689);
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
		
		Label label = new Label("Mr. Steve Rogers");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dialog", Font.BOLD, 37));
		label.setBounds(865, 0, 380, 80);
		panel.add(label);
		
		Panel panel_1 = new Panel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 102, 255));
		panel_1.setBounds(5, 5, 1218, 82);
		contentPane.add(panel_1);
		
		Label label_1 = new Label("Mr.Nick Fury");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Dialog", Font.BOLD, 37));
		label_1.setBounds(392, 10, 301, 62);
		panel_1.add(label_1);
		
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
		panel_1.add(label_3);
		
		JLabel lblNicholasnickJoseph = new JLabel("Nicholas \"Nick\" Joseph Fury was a former Colonel who had served with the United States Army and an espionage veteran of the CIA during the Cold War. Continuing to serve the world, Fury joined S.H.I.E.L.D., a covert international peacekeeping organization which operates as humanity's first line of defense against Earth's most dangerous enemies. The great scope of enemies widened as Fury met Kree warrior Vers. Fury helped her uncover her human heritage as Carol Danvers, as the two fought off the Kree Starforce, which was led by Yon-Rogg, as they targeted refugee Skrull families. Fury took a liking to Mar-Vell's pet Flerken, Goose, who proceeded to scratch him and permanently blinded his left eye. Fury has kept the reason for this injury his secret while Captain Marvel had left the Earth.\r\n\r\nLater promoted to Director of S.H.I.E.L.D., Fury refocused his efforts to organizing the Avengers Initiative, which had been named after Danvers' own former codename, with Fury's true intentions being to bring together any other super-powered individuals assist S.H.I.E.L.D. with protecting the Earth from extraterrestrial threats, which he had only learned of following his encounters with the Kree and Skrulls. Despite some more considerable reluctance from World Security Council who had not believed in his theories, Fury had still continued his efforts and eventually managed to recruit both Iron Man and Captain America into their Initiative, ready for an incoming invasion.\r\n\r\n");
		lblNicholasnickJoseph.setIcon(new ImageIcon(NickFury.class.getResource("/eleimage/nick.jpg")));
		lblNicholasnickJoseph.setBounds(1015, 127, 140, 185);
		contentPane.add(lblNicholasnickJoseph);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea.setText("Nicholas \"Nick\" Joseph Fury was a former Colonel who had served with the \r\nUnited States Army and an espionage veteran of the CIA during the Cold \r\nWar. Continuing to serve the world, Fury joined S.H.I.E.L.D., a covert \r\ninternational peacekeeping organization which operates as humanity's \r\nfirst line of defense against Earth's most dangerous enemies. The great \r\nscope of enemies widened as Fury met Kree warrior Vers. Fury helped her\r\n uncover her human heritage as Carol Danvers, as the two fought off the \r\nKree Starforce, which was led by Yon-Rogg, as they targeted refugee Skrull\r\nfamilies. Fury took a liking to Mar-Vell's pet Flerken, Goose, who proceeded\r\nto scratch him and permanently blinded his left eye. Fury has kept the reason\r\nfor this injury his secret while Captain Marvel had left the Earth.\r\n\r\nLater promoted to Director of S.H.I.E.L.D., Fury refocused his efforts to \r\norganizing the Avengers Initiative, which had been named after Danvers'\r\nown former codename, with Fury's true intentions being to bring together\r\nany other super-powered individuals assist S.H.I.E.L.D. with protecting the \r\nEarth from extraterrestrial threats, which he had only learned of following \r\nhis encounters with the Kree and Skrulls. Despite some more considerable \r\nreluctance from World Security Council who had not believed in his theories,\r\nFury had still continued his efforts and eventually managed to recruit both \r\nIron Man and Captain America into their Initiative, ready for an incoming \r\ninvasion.");
		textArea.setBounds(5, 89, 957, 563);
		contentPane.add(textArea);
		
		Label label_2 = new Label("Mr. Nick Fury");
		label_2.setFont(new Font("Dialog", Font.BOLD, 13));
		label_2.setBounds(1023, 332, 118, 21);
		contentPane.add(label_2);
		
		Label label_4 = new Label("S.H.I.E.L.D.");
		label_4.setFont(new Font("Dialog", Font.BOLD, 13));
		label_4.setBounds(1038, 372, 89, 21);
		contentPane.add(label_4);
	}
}