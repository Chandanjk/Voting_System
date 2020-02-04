import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class HomePage extends JFrame {

	private JPanel contentPane;
	int r,y,xx,xy;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//setUndecorated(true);
		
      
		
		
		
		Button button = new Button("    INFORMATION \r\nOF CANDIDATES");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Data m=new Data();
				m.setVisible(true);
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(255, 0, 0));
		button.setFont(new Font("Times New Roman", Font.BOLD, 16));
		button.setBounds(10, 554, 280, 67);
		contentPane.add(button);
		
		Button button_2 = new Button("VOTE");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				vote v=new vote();
				v.setVisible(true);
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Dialog", Font.BOLD, 25));
		button_2.setBackground(new Color(255, 0, 0));
		button_2.setBounds(10, 168, 280, 61);
		contentPane.add(button_2);
		
		JLabel lblNewLabel = new JLabel("\" A vote is like a Rifle: \r\nits usefulness depends on the character of the User \"");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(182, 101, 646, 61);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 255));
		panel.setBounds(0, 0, 1000, 90);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Button button_1 = new Button("SIGNOUT");
		button_1.setBounds(902, 10, 70, 22);
		panel.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Home link=new Home();
				link.setVisible(true);
			}
		});
		button_1.setBackground(Color.WHITE);
		button_1.setForeground(Color.BLUE);
		button_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		
		Label label_1 = new Label("WELCOME");
		label_1.setFont(new Font("Dialog", Font.BOLD, 40));
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(398, 10, 217, 59);
		panel.add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(HomePage.class.getResource("/images/back1.jpg")));
		lblNewLabel_1.setBounds(0, 90, 982, 563);
		contentPane.add(lblNewLabel_1);
	}
}

