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

public class BruceWayne extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BruceWayne frame = new BruceWayne();
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
	public BruceWayne() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1234, 689);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 102, 255));
		panel.setBounds(0, 0, 1218, 82);
		contentPane.add(panel);
		
		Label label = new Label("Mr.Bruce Wayne");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dialog", Font.BOLD, 37));
		label.setBounds(392, 8, 366, 62);
		panel.add(label);
		
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
		panel.add(label_4);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon(BruceWayne.class.getResource("/eleimage/bruce.jpg")));
		label_1.setBounds(1015, 123, 140, 185);
		contentPane.add(label_1);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea.setText("\r\n     IT'S A TOP SECRET");
		textArea.setBounds(0, 82, 923, 570);
		contentPane.add(textArea);
		
		Label label_2 = new Label("Mr. Bruce Wayne");
		label_2.setFont(new Font("Dialog", Font.BOLD, 13));
		label_2.setBounds(1015, 331, 140, 21);
		contentPane.add(label_2);
		
		Label label_3 = new Label("\r\nGOTHAM DAL");
		label_3.setFont(new Font("Dialog", Font.BOLD, 13));
		label_3.setBounds(1015, 406, 140, 36);
		contentPane.add(label_3);
	}
}