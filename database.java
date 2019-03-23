import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JPasswordField;

public class database implements ActionListener{

	private JFrame frame;
	private JTextField tf1;
	private JButton b1,b2;
	private JLabel l1,l2,l3;
	private JPasswordField pf1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					database window = new database();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public database() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 810, 609);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		l1 = new JLabel("UserName");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		l1.setBounds(111, 162, 116, 45);
		frame.getContentPane().add(l1);
		
		tf1 = new JTextField();
		tf1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		tf1.setBounds(340, 162, 242, 45);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		l2 = new JLabel("Password");
		l2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		l2.setBounds(111, 245, 116, 45);
		frame.getContentPane().add(l2);
		
		l3 = new JLabel("Login Form");
		l3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		l3.setBounds(249, 29, 139, 45);
		frame.getContentPane().add(l3);
		
		b1 = new JButton("Login");
		b1.setBounds(351, 358, 97, 25);
		frame.getContentPane().add(b1);
		b1.addActionListener(this);
		
		b2 = new JButton("Reset"); 
		b2.setBounds(467, 358, 97, 25);
		frame.getContentPane().add(b2);
		
		pf1 = new JPasswordField();
		pf1.setBounds(340, 245, 242, 45);
		frame.getContentPane().add(pf1);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String pass="";
		String user=tf1.getText();
		char[] pa=pf1.getPassword();
		
		for(int i=0;i<pa.length;i++)
		{
			pass=pass+pa[i];
		}
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost\\sqlexpress;databaseName=NiitDataBase", "sa", "12345");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from login where user1='"+user+"' and pass1='"+pass+"'");
			if(rs.next()==true)
			{
				//JOptionPane.showMessageDialog(frame, "Successs"+user+"!");//to show in the same page
				successpage sp=new successpage();
				frame.setVisible(false);
				sp.frame.setVisible(true);
			}
			else
			{
				JOptionPane.showMessageDialog(frame, "Invalid User"+user+"!");
			}
			
		}
		catch(Exception ee)
		{
			System.out.println("Error Name"+ee.toString());
		}
		
	}
}
