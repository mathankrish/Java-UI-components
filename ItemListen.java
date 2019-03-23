import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.time.DayOfWeek;
import java.time.Month;
import javax.swing.JLabel;

public class ItemListen  implements ItemListener{

	private JFrame frame;
	private JComboBox c1;
	private JLabel l1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ItemListen window = new ItemListen();
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
	public ItemListen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 703, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(Month.values()));
		c1.setBounds(330, 211, 215, 32);
		frame.getContentPane().add(c1);
		c1.addItemListener(this);
		
		l1 = new JLabel("ans");
		l1.setBounds(353, 289, 162, 46);
		frame.getContentPane().add(l1);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		int a=c1.getSelectedIndex();
		String b=c1.getItemAt(a).toString();
		l1.setText(""+b);
	}
}
