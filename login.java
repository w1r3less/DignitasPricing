package scraper;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class login extends JFrame implements ActionListener{
	
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel;
	private Button button;
	private JLabel lblNewLabel_1 ;
	private JLabel lblNewLabel_1_1;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
            public void run() {
            	 try {
                     login frame = new login();
                     frame.setUndecorated(true);
                     frame.setVisible(true);
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
            }
        });
    }
	
		
	
	public login() {
		setVisible(true);
		setTitle("Login");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 250);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		
		button = new Button("Login");
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(241, 57, 83) );
		button.setBounds(10, 161, 252, 40);
		button.addActionListener(this);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setBounds(10, 25, 252, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(10, 11, 84, 14);
		contentPane.add(lblNewLabel);
		
		 lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setBounds(10, 76, 84, 14);
		contentPane.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 90, 252, 40);
		contentPane.add(passwordField);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(10, 141, 252, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ryank\\Downloads\\Webp.net-resizeimage (1).png"));
		lblNewLabel_2.setBounds(272, 25, 112, 105);
		contentPane.add(lblNewLabel_2);
	}


	@Override
    public void actionPerformed(ActionEvent yh) {
       String user = textField.getText();
       String password = passwordField.getText();
       
       if(user.equals("Ryan") && password.equals("passwordlol")) {
           lblNewLabel_3.setText("Login successful.");
           
           DignitasScraper mainPage = null;
		try {
			mainPage = new DignitasScraper();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           mainPage.setVisible(true);
           
       }else lblNewLabel_3.setText("Login failed.");

	
	}
}
