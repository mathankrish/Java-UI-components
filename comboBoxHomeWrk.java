import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.time.Month;
import java.awt.Font;
import javax.swing.JTextArea;

public class comboBoxHomeWrk implements ItemListener{

	private JFrame frame;
	private JComboBox c1,c2,c3;
	private JLabel l1;
	private JTextField t1;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					comboBoxHomeWrk window = new comboBoxHomeWrk();
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
	public comboBoxHomeWrk() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 698, 752);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		c1.setBounds(97, 173, 72, 29);
		frame.getContentPane().add(c1);
		c1.addItemListener(this);
		
		c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(Month.values()));
		c2.setBounds(198, 173, 162, 29);
		frame.getContentPane().add(c2);
		c2.addItemListener(this);
		
		c3 = new JComboBox();
		c3.setModel(new DefaultComboBoxModel(new String[] {"1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"}));
		c3.setBounds(391, 173, 88, 29);
		frame.getContentPane().add(c3);
		c3.addItemListener(this);
		
		l1 = new JLabel("Date");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		l1.setBounds(153, 362, 287, 69);
		frame.getContentPane().add(l1);
		
		t1 = new JTextField();
		t1.setBounds(153, 466, 287, 69);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		ta = new JTextArea();
		ta.setBounds(153, 580, 287, 58);
		frame.getContentPane().add(ta);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		int s1=c1.getSelectedIndex();
		int s2=c2.getSelectedIndex();
		int s3=c3.getSelectedIndex();
		String f1=c1.getItemAt(s1).toString();
		String f2=c2.getItemAt(s2).toString();
		String f3=c3.getItemAt(s3).toString();
		l1.setText(""+f1+" / "+f2+" / "+f3);
		t1.setText(""+f1+" / "+f2+" / "+f3);
		ta.setText(""+f1+" / "+f2+" / "+f3);
	}
}
