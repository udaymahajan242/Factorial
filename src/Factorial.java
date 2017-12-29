
// Factorial by Uday Mahajan;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Factorial {

	private JFrame frmFactorialUday;
	JTextField txtIn;
	JButton btnClosed;
	JButton btnRecursive;
	JTextField textOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Factorial window = new Factorial();
					window.frmFactorialUday.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Factorial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFactorialUday = new JFrame();
		frmFactorialUday.setTitle("Factorial by Uday Mahajan");
		frmFactorialUday.setBounds(100, 100, 450, 300);
		frmFactorialUday.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFactorialUday.getContentPane().setLayout(null);

		txtIn = new JTextField();
		txtIn.setBounds(10, 52, 158, 20);
		frmFactorialUday.getContentPane().add(txtIn);
		txtIn.setColumns(10);

		btnClosed = new JButton("Closed !");
		btnClosed.addActionListener(new BtnClosedActionListener());
		btnClosed.setBounds(201, 51, 173, 23);
		frmFactorialUday.getContentPane().add(btnClosed);

		btnRecursive = new JButton("Recursive!");
		btnRecursive.addActionListener(new BtnRecursiveActionListener());
		btnRecursive.setBounds(211, 102, 158, 23);
		frmFactorialUday.getContentPane().add(btnRecursive);

		textOut = new JTextField();
		textOut.setBounds(159, 173, 146, 26);
		frmFactorialUday.getContentPane().add(textOut);
		textOut.setColumns(10);
	}

	private class BtnClosedActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			int x = Integer.parseInt(txtIn.getText());
			System.out.println("Calculating " + x + "! in closed form ");
			double y = factClosed(x);
			textOut.setText(x + "!= " + y);
		}

		private double factClosed(int x) {
			double y = 1;
			for (int i = 1; i <= x; i++)
				y *= i;
			return y;
		}
	}
	private class BtnRecursiveActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int x = Integer.parseInt(txtIn.getText());
			System.out.println("Calculating " + x + "! in closed form ");
			double y = factRecurse(x);
			textOut.setText(x + "!= " + y);
		}

		private double factRecurse(int x) {
			System.out.println("Calculating "+ x+ " factorial.");
			if (x == 0) return 1.0;
			return x*factRecurse(x-1);
		}
	}
}
