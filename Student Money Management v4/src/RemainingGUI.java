import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;

public class RemainingGUI extends JFrame {

	private JPanel contentPane;

	private static DecimalFormat df2 = new DecimalFormat("#.##");

	
	/**
	 * Launch the application.
	 */
	public static void Remaining() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemainingGUI frame = new RemainingGUI();
					frame.setLocationRelativeTo(null);
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
	public RemainingGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u03A5\u03C0\u03CC\u03BB\u03BF\u03B9\u03C0\u03BF");
		label.setBounds(162, 11, 149, 41);
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(label);
		
		JButton button = new JButton("\u03A0\u03AF\u03C3\u03C9");
		button.setBounds(0, 0, 89, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu m = new Menu();
				m.MenuScreen();
				close();
			}
		});
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("\u039F \u03BC\u03AD\u03C3\u03BF\u03C2 \u03CC\u03C1\u03BF\u03C2  \u03C7\u03C1\u03B7\u03BC\u03AC\u03C4\u03C9\u03BD \u03C0\u03BF\u03C5 \u03BC\u03C0\u03BF\u03C1\u03B5\u03AF\u03C4\u03B5 \u03BD\u03B1 \u03BA\u03B1\u03C4\u03B1\u03BD\u03B1\u03BB\u03C9\u03C3\u03B5\u03C4\u03B5 \u03B7\u03BC\u03B5\u03C1\u03B7\u03C3\u03AF\u03C9\u03C2:");
		lblNewLabel.setBounds(16, 134, 345, 41);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		contentPane.add(lblNewLabel);
		
		JLabel label_2 = new JLabel(" \u0393\u03B9\u03B1 \u03B1\u03CD\u03BE\u03B7\u03C3\u03B7 \u03AE \u03BC\u03B5\u03AF\u03C9\u03C3\u03B7 \u03C4\u03BF\u03C5 \u03B4\u03B9\u03B1\u03B8\u03AD\u03C3\u03B9\u03BC\u03BF\u03C5 \u03C5\u03C0\u03BF\u03BB\u03BF\u03AF\u03C0\u03BF\u03C5 \u03BC\u03AD\u03C3\u03C9 \u03C4\u03B7\u03C2 \u03B1\u03C0\u03BF\u03C4\u03B1\u03BC\u03AF\u03B5\u03C5\u03C3\u03B7\u03C2 \u03C0\u03B1\u03C4\u03AE\u03C3\u03C4\u03B5 ");
		label_2.setBounds(10, 279, 414, 61);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		contentPane.add(label_2);

		
		JButton button_1 = new JButton("\u03B5\u03B4\u03CE");
		button_1.setBounds(400, 298, 54, 23);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Remaining2GUI r = new Remaining2GUI();
				r.Remaining2();
				close();
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		contentPane.add(button_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(239, 89, 59, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(365, 147, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel label_1 = new JLabel("\u03A4\u03BF \u03BC\u03B7\u03BD\u03B9\u03B1\u03AF\u03BF \u03B4\u03B9\u03B1\u03B8\u03AD\u03C3\u03B9\u03BC\u03BF \u03C0\u03BF\u03C3\u03CC \u03B5\u03AF\u03BD\u03B1\u03B9:");
		label_1.setBounds(16, 89, 217, 14);
		contentPane.add(label_1);
		
		
			try {
				BufferedReader br = new BufferedReader(new FileReader("date.txt"));
				String st;
				while((st=br.readLine())!=null){
				
					File f = new File(st + "_yp.txt");
					
				if (f.exists()){
				BufferedReader br2 = new BufferedReader(new FileReader(st+"_yp.txt"));
				String st2;
				while ((st2=br2.readLine())!=null){
					lblNewLabel_1.setText(st2);
					
				double ypoloipo=Double.parseDouble(st2);
				String mera=st.substring(0,2);
				String minas=st.substring(3,4);
				double dmera=Double.parseDouble(mera);
				double dminas=Double.parseDouble(minas);
				int days;
				if(dminas==01||dminas==03||dminas==05||dminas==07||dminas==8||dminas==10||dminas==12){
				days=31;}
				else if(dminas==2){
				days=28;}
				else{
				days=30;}
				
				double mo=ypoloipo/(days-dmera);	
				lblNewLabel_2.setText(df2.format(mo));
				
				}
				}else{

		        	BufferedReader br1=new BufferedReader(new FileReader(st+"_tbe.txt"));
		        	BufferedReader br2=new BufferedReader(new FileReader(st+"_tde.txt"));
		        	String st1,st2;
		        	while((st1=br1.readLine())!=null){
		        		double be=Double.parseDouble(st1);
		        		while((st2=br2.readLine())!=null){
	        				double de = Double.parseDouble(st2);
	        				double te = be + de;
	        				PrintWriter output = new PrintWriter(new File(st+"_te.txt"));
	        				output.print(String.valueOf(te));
	        				output.close();
		        	
	        				BufferedReader br3=new BufferedReader(new FileReader(st+"_ti.txt"));
	        				String st3;
	        				while((st3=br3.readLine())!=null){
	        					double inc = Double.parseDouble(st3);
	        					double ypoloipo = inc - te;
	        		 
	        					PrintWriter output1=new PrintWriter(st+"_yp.txt");
	        					output1.print(ypoloipo);
	        					output1.close();
       			
	        			
	        		}
		        			
		        		}
		        	}
		        	
		        	
		        }
					
				}
			} catch ( NumberFormatException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			}

	public void close(){
		this.setVisible(false);
		 this.dispose();
		
	}
}