import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class FocusLisHw implements FocusListener{

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	int n3;
	private JLabel l4,l1,l2,l3;
	private JLabel l5;
	private JLabel l6;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FocusLisHw window = new FocusLisHw();
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
	public FocusLisHw() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 699, 728);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		l1 = new JLabel("Enter the first number :");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		l1.setBounds(12, 138, 223, 39);
		frame.getContentPane().add(l1);
		
		l2 = new JLabel("Enter the second number :");
		l2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		l2.setBounds(12, 225, 223, 39);
		frame.getContentPane().add(l2);
		
		
		t1 = new JTextField();
		t1.setBounds(329, 143, 202, 34);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(329, 229, 202, 34);
		frame.getContentPane().add(t2);
		t2.addFocusListener(this);
		
		
		l3 = new JLabel("Total     -------------->");
		l3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		l3.setBounds(12, 356, 223, 39);
		frame.getContentPane().add(l3);
		
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(329, 361, 202, 34);
		frame.getContentPane().add(t3);
		t3.addFocusListener(this);
		
		l4 = new JLabel("Subract  -------------->");
		l4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		l4.setBounds(12, 428, 223, 39);
		frame.getContentPane().add(l4);
		
		l5 = new JLabel("Multiple  -------------->");
		l5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		l5.setBounds(12, 499, 223, 39);
		frame.getContentPane().add(l5);
		
		l6 = new JLabel("Divide    -------------->");
		l6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		l6.setBounds(12, 572, 223, 39);
		frame.getContentPane().add(l6);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(329, 438, 202, 34);
		frame.getContentPane().add(t4);
		t4.addFocusListener(this);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(329, 509, 202, 34);
		frame.getContentPane().add(t5);
		t5.addFocusListener(this);
		
		t6 = new JTextField();
		t6.setColumns(10);
		t6.setBounds(329, 577, 202, 34);
		frame.getContentPane().add(t6);
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		String n1=t1.getText();
		String n2=t2.getText();
		
		if (e.getSource()==t2)
		{
			n3=Integer.parseInt(n1)+Integer.parseInt(n2);
			t3.setText(" "+n3);	
		}
		else if (e.getSource()==t3)
		{
			n3=Integer.parseInt(n1)-Integer.parseInt(n2);
			t4.setText(" "+n3);	
		}
		else if (e.getSource()==t4)
		{
			n3=Integer.parseInt(n1)*Integer.parseInt(n2);
			t5.setText(" "+n3);	
		}
		else 
		{
			n3=Integer.parseInt(n1)/Integer.parseInt(n2);
			t6.setText(" "+n3);	
		}
		
		
	}

}