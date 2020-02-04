import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Button;
import java.awt.TextArea;
import javax.swing.JTextPane;
import java.awt.SystemColor; 
import java.sql.*;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class vote extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vote frame = new vote();
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
	public vote() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1004, 639);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBackground(new Color(0, 102, 255));
		panel.setBounds(0, 0, 986, 86);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblVoting = new JLabel("VOTING");
		lblVoting.setForeground(Color.WHITE);
		lblVoting.setFont(new Font("Dialog", Font.BOLD, 37));
		lblVoting.setBounds(438, 13, 160, 58);
		panel.add(lblVoting);
		
		JLabel lblNewLabel_1 = new JLabel("<~");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				HomePage g=new HomePage();
				g.setVisible(true);
			}
		});
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(12, 13, 56, 16);
		panel.add(lblNewLabel_1);
		
		Button button = new Button("VOTE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{  
					//STEP 2: Register JDBC driver
								Class.forName("com.mysql.jdbc.Driver"); 
					//STEP 3: Open a connection
								Connection conn=DriverManager.getConnection(  
										"jdbc:mysql://localhost:3306/Voting_Sys","root","12345687");  				
								System.out.println("Connection Established!"); 
					//STEP 4: Execute a query
								System.out.println("Updating statement...");
								Statement stmt = conn.createStatement();
							    String sql = "UPDATE Vote_Counter " +
							                   "SET votes = votes+1 WHERE Sr_no=1";
							    String sql1 = "UPDATE Vote_Counter " +
							                   "SET votes = votes+1 WHERE Sr_no=6;";
							    stmt.executeUpdate(sql);
							    stmt.executeUpdate(sql1);
							    System.out.println("Updated statement Successfully!");
							    conn.close();
							}catch(Exception a){ System.out.println(a);}
				dispose();
				Final_frame f=new Final_frame();
				f.setVisible(true);				
			}
				
			
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(255, 51, 51));
		button.setFont(new Font("Dialog", Font.BOLD, 20));
		button.setBounds(69, 129, 125, 40);
		contentPane.add(button);
		
		JTextPane txtpnMrTonySatark = new JTextPane();
		txtpnMrTonySatark.setBackground(SystemColor.menu);
		txtpnMrTonySatark.setFont(new Font("Dialog", Font.BOLD, 23));
		txtpnMrTonySatark.setEditable(false);
		txtpnMrTonySatark.setText("Mr. Tony Satark, Satark Party");
		txtpnMrTonySatark.setBounds(346, 129, 592, 40);
		contentPane.add(txtpnMrTonySatark);
		
		Button button_1 = new Button("VOTE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{  
					//STEP 2: Register JDBC driver
								Class.forName("com.mysql.jdbc.Driver"); 
					//STEP 3: Open a connection
								Connection conn=DriverManager.getConnection(  
										"jdbc:mysql://localhost:3306/Voting_Sys","root","12345687");  				
								System.out.println("Connection Established!"); 
					//STEP 4: Execute a query
								System.out.println("Updating statement...");
								Statement stmt = conn.createStatement();
							    String sql = "UPDATE Vote_Counter " +
							                   "SET votes = votes+1 WHERE Sr_no=2";
							    String sql1 = "UPDATE Vote_Counter " +
							                   "SET votes = votes+1 WHERE Sr_no=6;";
							    stmt.executeUpdate(sql);
							    stmt.executeUpdate(sql1);
							    System.out.println("Updated statement Successfully!");
							    conn.close();
							}catch(Exception a){ System.out.println(a);}  
				dispose();
				Final_frame f=new Final_frame();
				f.setVisible(true);	
			}
			
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Dialog", Font.BOLD, 20));
		button_1.setBackground(new Color(255, 51, 51));
		button_1.setBounds(69, 211, 125, 40);
		contentPane.add(button_1);
		
		Button button_2 = new Button("VOTE");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{  
				//STEP 2: Register JDBC driver
				Class.forName("com.mysql.jdbc.Driver"); 
	//STEP 3: Open a connection
				Connection conn=DriverManager.getConnection(  
						"jdbc:mysql://localhost:3306/Voting_Sys","root","12345687");  				
				System.out.println("Connection Established!"); 
	//STEP 4: Execute a query
				System.out.println("Updating statement...");
				Statement stmt = conn.createStatement();
			    String sql = "UPDATE Vote_Counter " +
			                   "SET votes = votes+1 WHERE Sr_no=3";
			    String sql1 = "UPDATE Vote_Counter " +
			                   "SET votes = votes+1 WHERE Sr_no=6;";
			    stmt.executeUpdate(sql);
			    stmt.executeUpdate(sql1);
			    System.out.println("Updated statement Successfully!");
			    conn.close();
			}catch(Exception a){ System.out.println(a);}  
				dispose();
				Final_frame f=new Final_frame();
				f.setVisible(true);	
			}
			
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Dialog", Font.BOLD, 20));
		button_2.setBackground(new Color(255, 51, 51));
		button_2.setBounds(69, 293, 125, 40);
		contentPane.add(button_2);
		
		Button button_3 = new Button("VOTE");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{  
					//STEP 2: Register JDBC driver
								Class.forName("com.mysql.jdbc.Driver"); 
					//STEP 3: Open a connection
								Connection conn=DriverManager.getConnection(  
										"jdbc:mysql://localhost:3306/Voting_Sys","root","12345687");  				
								System.out.println("Connection Established!"); 
					//STEP 4: Execute a query
								System.out.println("Updating statement...");
								Statement stmt = conn.createStatement();
							    String sql = "UPDATE Vote_Counter " +
							                   "SET votes = votes+1 WHERE Sr_no=4";
							    String sql1 = "UPDATE Vote_Counter " +
							                   "SET votes = votes+1 WHERE Sr_no=6;";
							    stmt.executeUpdate(sql);
							    stmt.executeUpdate(sql1);
							    System.out.println("Updated statement Successfully!");
							    conn.close();
							}catch(Exception a){ System.out.println(a);}  
				dispose();
				Final_frame f=new Final_frame();
				f.setVisible(true);	
			}
		});
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Dialog", Font.BOLD, 20));
		button_3.setBackground(new Color(255, 51, 51));
		button_3.setBounds(69, 380, 125, 40);
		contentPane.add(button_3);
		
		Button button_4 = new Button("VOTE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try{  
				//STEP 2: Register JDBC driver
				Class.forName("com.mysql.jdbc.Driver"); 
	//STEP 3: Open a connection
				Connection conn=DriverManager.getConnection(  
						"jdbc:mysql://localhost:3306/Voting_Sys","root","12345687");  				
				System.out.println("Connection Established!"); 
	//STEP 4: Execute a query
				System.out.println("Updating statement...");
				Statement stmt = conn.createStatement();
			    String sql = "UPDATE Vote_Counter " +
			                   "SET votes = votes+1 WHERE Sr_no=5";
			    String sql1 = "UPDATE Vote_Counter " +
			                   "SET votes = votes+1 WHERE Sr_no=6;";
			    stmt.executeUpdate(sql);
			    stmt.executeUpdate(sql1);
			    System.out.println("Updated statement Successfully!");
			    conn.close();
			}catch(Exception a){ System.out.println(a);}
			dispose();
			Final_frame f=new Final_frame();
			f.setVisible(true);	
			}
		});
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Dialog", Font.BOLD, 20));
		button_4.setBackground(new Color(255, 51, 51));
		button_4.setBounds(69, 461, 125, 40);
		contentPane.add(button_4);
		
		JTextPane txtpnMrsteveRogers = new JTextPane();
		txtpnMrsteveRogers.setText("Mr.Steve Rogers, SSR");
		txtpnMrsteveRogers.setFont(new Font("Dialog", Font.BOLD, 23));
		txtpnMrsteveRogers.setEditable(false);
		txtpnMrsteveRogers.setBackground(SystemColor.menu);
		txtpnMrsteveRogers.setBounds(346, 211, 592, 40);
		contentPane.add(txtpnMrsteveRogers);
		
		JTextPane txtpnMrnickFuryShield = new JTextPane();
		txtpnMrnickFuryShield.setText("Mr.Nick Fury, S.H.I.E.L.D");
		txtpnMrnickFuryShield.setFont(new Font("Dialog", Font.BOLD, 23));
		txtpnMrnickFuryShield.setEditable(false);
		txtpnMrnickFuryShield.setBackground(SystemColor.menu);
		txtpnMrnickFuryShield.setBounds(346, 293, 592, 40);
		contentPane.add(txtpnMrnickFuryShield);
		
		JTextPane txtpnMrbruceWayneGotham = new JTextPane();
		txtpnMrbruceWayneGotham.setText("Mr.Bruce Wayne, Gotham Dal");
		txtpnMrbruceWayneGotham.setFont(new Font("Dialog", Font.BOLD, 23));
		txtpnMrbruceWayneGotham.setEditable(false);
		txtpnMrbruceWayneGotham.setBackground(SystemColor.menu);
		txtpnMrbruceWayneGotham.setBounds(346, 380, 592, 40);
		contentPane.add(txtpnMrbruceWayneGotham);
		
		JTextPane txtpnMrwadeWilson = new JTextPane();
		txtpnMrwadeWilson.setText("Mr.Wade Wilson, X Party");
		txtpnMrwadeWilson.setFont(new Font("Dialog", Font.BOLD, 23));
		txtpnMrwadeWilson.setEditable(false);
		txtpnMrwadeWilson.setBackground(SystemColor.menu);
		txtpnMrwadeWilson.setBounds(346, 461, 592, 40);
		contentPane.add(txtpnMrwadeWilson);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(vote.class.getResource("/eleimage/ironman.png")));
		lblNewLabel.setBounds(224, 114, 60, 64);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon(vote.class.getResource("/eleimage/cap.png")));
		label.setBounds(224, 201, 60, 64);
		contentPane.add(label);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon(vote.class.getResource("/eleimage/batman.png")));
		label_2.setBounds(224, 368, 60, 64);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon(vote.class.getResource("/eleimage/deadpool.jpg")));
		label_3.setBounds(224, 449, 60, 64);
		contentPane.add(label_3);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon(vote.class.getResource("/eleimage/nickfury.jpg")));
		label_1.setBounds(224, 280, 60, 64);
		contentPane.add(label_1);
		Image img = new ImageIcon(this.getClass().getResource("/eleimage/ironman.png")).getImage();
		Image img1 = new ImageIcon(this.getClass().getResource("/eleimage/cap.png")).getImage();
		Image img2 = new ImageIcon(this.getClass().getResource("/eleimage/nickfury.jpg")).getImage();
		Image img3 = new ImageIcon(this.getClass().getResource("/eleimage/batman.png")).getImage();
		Image img4 = new ImageIcon(this.getClass().getResource("/eleimage/deadpool.jpg")).getImage();
	}
}
