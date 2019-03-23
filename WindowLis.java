import java.awt.EventQueue;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;

public class WindowLis implements WindowListener {

	private JFrame frame;
	private JList l1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowLis window = new WindowLis();
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
	public WindowLis() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 711, 742);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		l1 = new JList();
		l1.setBounds(162, 13, 338, 384);
		frame.getContentPane().add(l1);
		frame.addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(frame, "Window Opened");
		System.out.println("Opened");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(frame, "Window closing");
		System.out.println("Closing");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(frame, "Window closed");
		System.out.println("Closed");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(frame, "Window Iconfied");//Msg box should not be used
		System.out.println("Iconified");
		WindowLis window = new WindowLis();
		window.frame.setVisible(true);
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(frame, "Window Deiconified");
		System.out.println("Deiconified");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(frame, "Window Activated");
		System.out.println("Activated");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(frame, "Window Deactivated");
		System.out.println("Deactivated");
		
	}
}
