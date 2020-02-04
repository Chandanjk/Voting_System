import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JPasswordField passwordField;
    int x,y,xx,xy;
    private JTextField textField_2;
    private JPasswordField passwordField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					//frame.setUndecorated(true);
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
	public Home() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 666);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button button = new Button("VOTER LOGIN");
		button.setBounds(595, 554, 297, 37);
		button.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(255, 102, 102));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			  try {
				  Connection conn=null;
					ResultSet rs=null;
					PreparedStatement pst=null;
					conn=DriverManager.getConnection(  
							"jdbc:mysql://localhost:3306/Voting_Sys","root","12345687");  				
					System.out.println("Connection Established!"); 
					String sql="select *from login_data where username=? and password=?";
				  pst=conn.prepareStatement(sql);
				  pst.setString(1, textField_1.getText());
				  pst.setString(2, passwordField.getText());
				  rs=pst.executeQuery();
				  if(rs.next()) {
					  //JOptionPane.showMessageDialog(null, "Username and password is correct");
					  dispose();
					  HomePage h=new HomePage();
					  h.setVisible(true);
			          }
				  else {
					  JOptionPane.showMessageDialog(null, "Username and password is incorrect");
				  }
			  }
			  catch(Exception e) {
				  JOptionPane.showMessageDialog(null, e);
			  }
			}
		});
		contentPane.add(button);
		
		JLabel lblUserName = new JLabel("   USERNAME");
		lblUserName.setBounds(576, 352, 110, 50);
		lblUserName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblUserName.setForeground(new Color(0, 0, 128));
		contentPane.add(lblUserName);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setBounds(576, 400, 336, 48);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JLabel lblPassword = new JLabel("    PASSWORD");
		lblPassword.setBounds(576, 442, 110, 48);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPassword.setForeground(new Color(25, 25, 112));
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(576, 486, 336, 48);
		contentPane.add(passwordField);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(576, 86, 336, 48);
		contentPane.add(textField_2);
		
		JLabel label_1 = new JLabel("   USERNAME");
		label_1.setForeground(new Color(0, 0, 128));
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(576, 40, 110, 50);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("    PASSWORD");
		label_2.setForeground(new Color(25, 25, 112));
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_2.setBounds(576, 133, 110, 48);
		contentPane.add(label_2);
		
		Button button_2 = new Button("ADMIN LOGIN");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					  Connection conn=null;
						ResultSet rs=null;
						PreparedStatement pst=null;
						conn=DriverManager.getConnection(  
								"jdbc:mysql://localhost:3306/Voting_Sys","root","12345687");  				
						System.out.println("Connection Established!"); 
						String sql="select *from admin_data where username=? and password=?";
					  pst=conn.prepareStatement(sql);
					  pst.setString(1, textField_2.getText());
					  pst.setString(2, passwordField_1.getText());
					  rs=pst.executeQuery();
					  if(rs.next()) {
						  //JOptionPane.showMessageDialog(null, "Username and password is correct");
						  dispose();
						  AdminPage link2=new AdminPage();
							link2.setVisible(true);
							}
					  else {
						  JOptionPane.showMessageDialog(null, "Username and password is incorrect");
					  }
				  }
				  catch(Exception e) {
					  JOptionPane.showMessageDialog(null, e);
				  }
				
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button_2.setBackground(new Color(255, 102, 102));
		button_2.setBounds(595, 244, 297, 37);
		contentPane.add(button_2);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(576, 177, 336, 48);
		contentPane.add(passwordField_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 489, 619);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(12, 0, 474, 619);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/images/login.png")));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 153, 153));
		panel_1.setBounds(489, 0, 493, 37);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAdmin = new JLabel("ADMIN");
		lblAdmin.setBounds(216, 0, 78, 37);
		panel_1.add(lblAdmin);
		lblAdmin.setForeground(new Color(51, 51, 0));
		lblAdmin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(153, 153, 153));
		panel_2.setBounds(489, 308, 493, 37);
		contentPane.add(panel_2);
		
		JLabel lblVoter = new JLabel("VOTER");
		lblVoter.setForeground(new Color(51, 51, 0));
		lblVoter.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblVoter.setBounds(216, 0, 78, 37);
		panel_2.add(lblVoter);
	}
}
