package bookCheck1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Window extends JFrame {

	private JPanel contentPane;
	private JTextField pswrdField;
	private JTextField unameField;
	private JLabel unameLabel;
	private JLabel pswrdLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
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
	public Window() {
		setTitle("Book Check");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		//contentPane.setSize(900,700);
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBackground(Color.ORANGE);
		panel.setBounds(59, -11, 765, 675);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton loginBttn = new JButton("Login");
		loginBttn.setBounds(325, 500, 150, 50);
		panel.add(loginBttn);
		
		JButton regBttn = new JButton("Register");
		regBttn.setBounds(355, 560, 89, 23);
		panel.add(regBttn);
		
		pswrdField = new JTextField();
		pswrdField.setBounds(325, 469, 150, 20);
		panel.add(pswrdField);
		pswrdField.setColumns(10);
		
		unameField = new JTextField();
		unameField.setBounds(325, 438, 150, 20);
		panel.add(unameField);
		unameField.setColumns(10);
		
		unameLabel = new JLabel();
		unameLabel.setForeground(Color.BLACK);
		unameLabel.setBackground(Color.ORANGE);
		unameLabel.setText("Username: ");
		unameLabel.setBounds(229, 438, 86, 20);
		panel.add(unameLabel);
		
		pswrdLabel = new JLabel();
		pswrdLabel.setForeground(Color.BLACK);
		pswrdLabel.setText("Password: ");
		pswrdLabel.setBackground(Color.ORANGE);
		pswrdLabel.setBounds(229, 469, 86, 20);
		panel.add(pswrdLabel);
		
		JPanel picPanel = new JPanel();
		picPanel.setBounds(250, 75, 300, 300);
		panel.add(picPanel);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			MenuFrame frame=new MenuFrame();		// I dont know what im doing here
			frame.setVisible(true);			
		}
	}
}
