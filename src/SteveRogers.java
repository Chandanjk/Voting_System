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

public class SteveRogers extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SteveRogers frame = new SteveRogers();
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
	public SteveRogers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1234, 689);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(5, 5, 1189, 0);
		panel.setLayout(null);
		panel.setBackground(new Color(0, 102, 255));
		contentPane.add(panel);
		
		Label label = new Label("Mr. Tony Satark");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dialog", Font.BOLD, 37));
		label.setBounds(435, -10, 355, 80);
		panel.add(label);
		
		Panel panel_1 = new Panel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 102, 255));
		panel_1.setBounds(-502, 5, 1722, 80);
		contentPane.add(panel_1);
		
		Label label_1 = new Label("Mr. Steve Rogers");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Dialog", Font.BOLD, 37));
		label_1.setBounds(865, 0, 380, 80);
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
		label_4.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(512, 10, 59, 21);
		panel_1.add(label_4);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon(SteveRogers.class.getResource("/eleimage/cap1.jpg")));
		label_2.setBounds(1024, 140, 126, 185);
		contentPane.add(label_2);
		
		Label label_3 = new Label("Mr Steve Rogers");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Dialog", Font.BOLD, 13));
		label_3.setBounds(1024, 343, 163, 21);
		contentPane.add(label_3);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Dialog", Font.BOLD, 19));
		textArea.setText("Captain Steven Grant \"Steve\" Rogers is a World War II veteran, a founding \r\nmember of the Avengers, and one of the world's first superheroes. Rogers\r\nhad suffered from numerous health problems, and upon America's entry \r\ninto World War II, was rejected from military service despite several attempts \r\nto enlist. Rogers was the only recipient of the Super Soldier Serum developed\r\nby Abraham Erskine under the Strategic Scientific Reserve. Determined to\r\nserve, Rogers ultimately volunteered for the Project Rebirth, which enhanced\r\nthe frail Rogers' body to the peak of human physicality. Mistrusted by\r\nColonel Chester Phillips, the head of the SSR, Rogers was relegated to \r\npropaganda campaigns, and was given the new moniker of Captain America.\r\nRogers later joined the war with a combat role after he single-handedly \r\nliberated captured Allied prisoners of war.\r\n\r\nFrom 1943 to 1945, Rogers attacked multiple HYDRA bases alongside his\r\nown team, the Howling Commandos, in another attempt to capture Red \r\nSkull, and recover the Tesseract. His famous World War II exploits had made \r\nhim a living legend, and during this time he also formed a relationship with \r\nPeggy Carter. Despite seemingly losing his closest best friend and loyal \r\nteammate, Bucky Barnes, during a mission, Rogers carried on to help the \r\nAllies win the war, but crashed into the Arctic during his final mission. His \r\nfriend Howard Stark spent time searching for his body. Rogers then spent \r\nsixty six years encased into ice in suspended animation before Rogers was \r\neventually found by S.H.I.E.L.D. in the early 21st century.");
		textArea.setBounds(0, 85, 944, 567);
		contentPane.add(textArea);
		
		Label label_5 = new Label("SSR");
		label_5.setForeground(Color.BLACK);
		label_5.setFont(new Font("Dialog", Font.BOLD, 13));
		label_5.setBounds(1068, 380, 41, 21);
		contentPane.add(label_5);
	}
}
