import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

public class calc implements ActionListener{

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton btnMul_1;
	private JButton btnMul;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
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
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 698, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		t1.setBounds(353, 96, 247, 51);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		t2.setColumns(10);
		t2.setBounds(353, 192, 247, 51);
		frame.getContentPane().add(t2);
		
		b1 = new JButton("Add");
		b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b1.setBounds(353, 278, 97, 51);
		frame.getContentPane().add(b1);
		b1.addActionListener(this);
		
		b2 = new JButton("Sub");
		b2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b2.setBounds(499, 278, 97, 51);
		frame.getContentPane().add(b2);
		b2.addActionListener(this);
		
		t3 = new JTextField();
		t3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		t3.setBounds(353, 457, 247, 51);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		JLabel lblFirstnumber = new JLabel("FirstNumber");
		lblFirstnumber.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblFirstnumber.setBounds(23, 113, 183, 34);
		frame.getContentPane().add(lblFirstnumber);
		
		JLabel lblSecondnumber = new JLabel("SecondNumber");
		lblSecondnumber.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblSecondnumber.setBounds(23, 209, 183, 34);
		frame.getContentPane().add(lblSecondnumber);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblResult.setBounds(23, 474, 183, 34);
		frame.getContentPane().add(lblResult);
		
		b3 = new JButton("Mul");
		b3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b3.setBounds(353, 363, 97, 51);
		frame.getContentPane().add(b3);
		b3.addActionListener(this);
		
		b4 = new JButton("Div");
		b4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b4.setBounds(503, 363, 97, 51);
		frame.getContentPane().add(b4);
		b4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String n1=t1.getText();
		String n2=t2.getText();
		int n3;
		if(e.getActionCommand().equals("Add")==true)
			n3=Integer.parseInt(n1)+Integer.parseInt(n2);
		else if(e.getActionCommand().equals("Sub")==true)
			n3=Integer.parseInt(n1)-Integer.parseInt(n2);
		else if(e.getActionCommand().equals("Mul")==true)
			n3=Integer.parseInt(n1)*Integer.parseInt(n2);
		else 
			n3=Integer.parseInt(n1)/Integer.parseInt(n2);
		t3.setText(""+n3);
		
	}
}
