import java.awt.EventQueue;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class FocusLis implements FocusListener{

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FocusLis window = new FocusLis();
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
	public FocusLis() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 697, 715);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(262, 151, 227, 41);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		t1.addFocusListener(this);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(262, 255, 227, 41);
		frame.getContentPane().add(t2);
		t2.addFocusListener(this);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(262, 364, 227, 41);
		frame.getContentPane().add(t3);
		t3.addFocusListener(this);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(262, 563, 227, 41);
		frame.getContentPane().add(t4);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(262, 617, 227, 41);
		frame.getContentPane().add(t5);
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==t1)
			t4.setText("t1 is focused");
		else if(e.getSource()==t2)
			t4.setText("t2 is focused");
		else 
			t4.setText("t3 is focused");
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==t1)
			t5.setText("t1 focus lost");
		else if(e.getSource()==t2)
			t5.setText("t2 focus lost");
		else 
			t5.setText("t3 focus lost");
	}
}
