import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextField;
import java.awt.Panel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Final_frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Final_frame frame = new Final_frame();
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
	public Final_frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 450);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(0, 102, 255));
		panel.setBounds(0, 0, 832, 68);
		contentPane.add(panel);
		
		JTextPane txtpnThankYouFor = new JTextPane();
		panel.add(txtpnThankYouFor);
		txtpnThankYouFor.setBackground(new Color(0, 102, 255));
		txtpnThankYouFor.setForeground(Color.WHITE);
		txtpnThankYouFor.setFont(new Font("Dialog", Font.BOLD, 37));
		txtpnThankYouFor.setText("Thank you for Voting!");
		
		JButton btnNewButton = new JButton("Sign out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Home h=new Home();
				h.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 51, 51));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 23));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(335, 191, 169, 44);
		contentPane.add(btnNewButton);
	}
}
