package scraper;

import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class DignitasScraper extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DignitasScraper frame = new DignitasScraper();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public DignitasScraper() throws IOException {
		setBackground(Color.LIGHT_GRAY);
		setForeground(Color.RED);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ryank\\Pictures\\Eportfolio\\!dignh.png"));
		
		String nonHolo = "https://csgo.steamanalyst.com/id/273343/Sticker-Team-Dignitas-Katowice-2014";
        Document document = Jsoup.connect(nonHolo).get();
        
        String name0 = document.select(".card-header > .m-b-0").text();
        String steam = document.select("td:nth-of-type(10)").text();
        String csmoney = document.select(".table > tbody > tr > td:nth-of-type(3)").text();
        String skinport = document.select("td:nth-of-type(5)").text();
        String skinbaron = document.select("td:nth-of-type(9)").text();
        String weekAverage = document.select(".averagepricehistory.col-xl-6.col-lg-12.col-md-12.col-sm-12 > .card > .list-group > li.list-group-item:nth-of-type(1) > p > .tag").text();
        
      
        
        String holo = "https://csgo.steamanalyst.com/id/277139/Sticker-Team-Dignitas-Holo-Katowice-2014";
        Document document1 = Jsoup.connect(holo).get();
        
        String name1 = document1.select(".card-header > .m-b-0").text();       
        String skinbaron1 = document1.select("td:nth-of-type(9)").text();
        
		setTitle("Dignitas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 250);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Item: " + name0);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 11, 322, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Steam price: " + steam);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 24, 218, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cs.money price: " + csmoney);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 36, 218, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Skinport price: " + skinport + " (Cash)");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 49, 218, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Skinbaron price: " + skinbaron + " (Cash)");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 61, 218, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Average in last week: " + weekAverage);
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(10, 74, 218, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\ryank\\Downloads\\Webp.net-resizeimage.png"));
		lblNewLabel_6.setBounds(263, 0, 109, 96);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\ryank\\Downloads\\Webp.net-resizeimage (1).png"));
		lblNewLabel_7.setBounds(263, 107, 109, 96);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Item: " + name1);
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(10, 107, 286, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Skinbaron price: " + skinbaron1 + " (Cash)");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setBounds(10, 121, 243, 14);
		contentPane.add(lblNewLabel_9);
	}
}
