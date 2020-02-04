import java.awt.BorderLayout;
import java.sql.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JSeparator;

public class AdminPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage();
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
	public AdminPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 0, 1034, 95);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Label label = new Label("SIGNOUT");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				Home h=new Home();
				h.setVisible(true);
			}
		});
		label.setForeground(Color.BLUE);
		label.setBackground(Color.WHITE);
		label.setBounds(937, 10, 62, 22);
		panel.add(label);
		
		Label label_1 = new Label("WELCOME");
		label_1.setFont(new Font("Dialog", Font.BOLD, 40));
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(410, 10, 230, 75);
		panel.add(label_1);
		
		JTextArea txtrZasd = new JTextArea();
		txtrZasd.setBackground(Color.WHITE);
		txtrZasd.setFont(new Font("Dialog", Font.BOLD, 25));
		txtrZasd.setEditable(false);
		txtrZasd.setBounds(271, 142, 254, 40);
		contentPane.add(txtrZasd);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setFont(new Font("Dialog", Font.BOLD, 25));
		textArea.setEditable(false);
		textArea.setBounds(271, 205, 254, 40);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setFont(new Font("Dialog", Font.BOLD, 25));
		textArea_1.setEditable(false);
		textArea_1.setBounds(271, 274, 254, 40);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBackground(Color.WHITE);
		textArea_2.setFont(new Font("Dialog", Font.BOLD, 25));
		textArea_2.setEditable(false);
		textArea_2.setBounds(271, 340, 254, 40);
		contentPane.add(textArea_2);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBackground(Color.WHITE);
		textArea_4.setFont(new Font("Dialog", Font.BOLD, 25));
		textArea_4.setEditable(false);
		textArea_4.setBounds(271, 408, 254, 40);
		contentPane.add(textArea_4);
		
		JTextArea txtrWinnerWinner = new JTextArea();
		txtrWinnerWinner.setForeground(Color.BLUE);
		txtrWinnerWinner.setBackground(Color.WHITE);
		txtrWinnerWinner.setFont(new Font("Dialog", Font.BOLD, 25));
		txtrWinnerWinner.setEditable(false);
		txtrWinnerWinner.setBounds(271, 473, 254, 40);
		contentPane.add(txtrWinnerWinner);
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setEditable(false);
		textArea_3.setForeground(Color.RED);
		textArea_3.setFont(new Font("Dialog", Font.BOLD, 27));
		textArea_3.setBounds(158, 534, 798, 40);
		contentPane.add(textArea_3);
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setFont(new Font("Dialog", Font.BOLD, 25));
		textArea_5.setEditable(false);
		textArea_5.setBackground(Color.WHITE);
		textArea_5.setBounds(566, 142, 124, 40);
		contentPane.add(textArea_5);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setFont(new Font("Dialog", Font.BOLD, 25));
		textArea_6.setEditable(false);
		textArea_6.setBackground(Color.WHITE);
		textArea_6.setBounds(566, 205, 124, 40);
		contentPane.add(textArea_6);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setFont(new Font("Dialog", Font.BOLD, 25));
		textArea_7.setEditable(false);
		textArea_7.setBackground(Color.WHITE);
		textArea_7.setBounds(566, 274, 124, 40);
		contentPane.add(textArea_7);
		
		JTextArea textArea_8 = new JTextArea();
		textArea_8.setFont(new Font("Dialog", Font.BOLD, 25));
		textArea_8.setEditable(false);
		textArea_8.setBackground(Color.WHITE);
		textArea_8.setBounds(566, 340, 124, 40);
		contentPane.add(textArea_8);
		
		JTextArea textArea_9 = new JTextArea();
		textArea_9.setFont(new Font("Dialog", Font.BOLD, 25));
		textArea_9.setEditable(false);
		textArea_9.setBackground(Color.WHITE);
		textArea_9.setBounds(566, 408, 124, 40);
		contentPane.add(textArea_9);
		
		JTextArea textArea_10 = new JTextArea();
		textArea_10.setFont(new Font("Dialog", Font.BOLD, 25));
		textArea_10.setEditable(false);
		textArea_10.setBackground(Color.WHITE);
		textArea_10.setBounds(566, 473, 124, 40);
		contentPane.add(textArea_10);
		
		JButton btnNewButton = new JButton("Show Result");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{  
					//STEP 2: Register JDBC driver
								Class.forName("com.mysql.jdbc.Driver"); 
					//STEP 3: Open a connection
								Connection con=DriverManager.getConnection(  
										"jdbc:mysql://localhost:3306/Voting_Sys","root","12345687");  				
								System.out.println("Connection Established!"); 
					//STEP 4: Execute a query
								int i,j,k,l,m,max;
								String a, b, c, d, e1, s=null; 
								Statement stmt=con.createStatement();  									
								ResultSet rs=stmt.executeQuery("select * from vote_counter");
								rs.next();
									txtrZasd.setText("Mr."+rs.getString(2));
									textArea_5.setText(""+rs.getInt(3));
									i=rs.getInt(3);
									a=rs.getString(2);
									rs.next();
									textArea.setText("Mr."+rs.getString(2));
									textArea_6.setText(""+rs.getInt(3));
									j=rs.getInt(3);
									b=rs.getString(2);
									rs.next();
									textArea_1.setText("Mr."+rs.getString(2));
									textArea_7.setText(""+rs.getInt(3));
									k=rs.getInt(3);
									c=rs.getString(2);
									rs.next();
									textArea_2.setText("Mr."+rs.getString(2));
									textArea_8.setText(""+rs.getInt(3));
									l=rs.getInt(3);
									d=rs.getString(2);
									rs.next();
									textArea_4.setText("Mr."+rs.getString(2));
									textArea_9.setText(""+rs.getInt(3));
									m=rs.getInt(3);
									e1=rs.getString(2);
									rs.next();
									txtrWinnerWinner.setText(rs.getString(2));
									textArea_10.setText(""+rs.getInt(3));
									max=Math.max(Math.max(Math.max(Math.max(i,j),k),l),m);
									if(max==i)
									s=a;
									if(max==j)
										s=b;
									if(max==k)
										s=c;
									if(max==l)
										s=d;
									if(max==m)
										s=e1;
									if((max==i)&&(max==j)&&(max==k)&&(max==l)&&(max==m))
										s="No one";
									textArea_3.setText(s+" has Won the elections with a total of "+max+" votes");
									
								con.close();  
								}catch(Exception f){ System.out.println(f);}
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(255, 51, 51));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton.setBounds(425, 600, 179, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
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
							                   "SET votes = 0 WHERE Sr_no=1";
							    String sql1 = "UPDATE Vote_Counter " +
							                   "SET votes = 0 WHERE Sr_no=2;";
							    String sql2 = "UPDATE Vote_Counter " +
						                   "SET votes = 0 WHERE Sr_no=3;";
							    String sql3 = "UPDATE Vote_Counter " +
						                   "SET votes = 0 WHERE Sr_no=4;";
							    String sql4 = "UPDATE Vote_Counter " +
						                   "SET votes = 0 WHERE Sr_no=5;";
							    String sql5 = "UPDATE Vote_Counter " +
						                   "SET votes = 0 WHERE Sr_no=6;";
							    
							    stmt.executeUpdate(sql);
							    stmt.executeUpdate(sql1);
							    stmt.executeUpdate(sql2);
							    stmt.executeUpdate(sql3);
							    stmt.executeUpdate(sql4);
							    stmt.executeUpdate(sql5);
							    System.out.println("Updated statement Successfully!");
							    conn.close();
							}catch(Exception a){ System.out.println(a);}
			}
		});
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1.setBounds(885, 600, 124, 40);
		contentPane.add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(542, 108, 0, 410);
		contentPane.add(separator);
		
		
		
		
		
		
		
	}
}
