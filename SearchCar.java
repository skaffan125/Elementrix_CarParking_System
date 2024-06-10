/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carparking2;

/**
 *
 * @author AFFAN
 */

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class SearchCar extends AbstractSearch {

	private JFrame frmSrarchCar;
	private JTextField CarNmbr;
	private JScrollPane scrollPane;
	private JButton read_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchCar window = new SearchCar();
					window.frmSrarchCar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SearchCar() {
		super(new JTextArea());  // Initialize the parent class with a JTextArea
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSrarchCar = new JFrame();
		frmSrarchCar.getContentPane().setBackground(new Color(0, 0, 51));
		frmSrarchCar.getContentPane().setFont(new Font("Sitka Text", Font.PLAIN, 11));
		frmSrarchCar.setTitle("SEARCH CAR");
		frmSrarchCar.setBounds(100, 100, 754, 479);
		frmSrarchCar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSrarchCar.getContentPane().setLayout(null);
		JLabel lblNsuCarParking = new JLabel("ELementRix PARKING MANAGEMENT SYSTEM");
lblNsuCarParking.setForeground(new Color(0, 0, 255));
lblNsuCarParking.setFont(new Font("Sitka Text", Font.PLAIN, 28));
lblNsuCarParking.setBounds(105, 17, 589, 44);
frmSrarchCar.getContentPane().add(lblNsuCarParking);

// Adjusted position for AbtnHome
JButton AbtnHome = new JButton("");
AbtnHome.setIcon(new ImageIcon("C:\\Users\\AFFAN\\Desktop\\CarPic\\home.png"));
AbtnHome.setForeground(new Color(255, 250, 250));
AbtnHome.setBackground(UIManager.getColor("CheckBox.background"));
AbtnHome.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        Home hm = new Home();   // calling home window will come.
        Home.main(null);
        frmSrarchCar.setVisible(false);
    }
});
AbtnHome.setFont(new Font("Sitka Text", Font.BOLD, 11));
// Updated bounds to match the position in the first code block
AbtnHome.setBounds(1, 69, 53, 42);
frmSrarchCar.getContentPane().add(AbtnHome);

// Adjusted position for AbtnCarPa
JButton AbtnCarPa = new JButton("CAR PARKING");
AbtnCarPa.setForeground(UIManager.getColor("CheckBox.foreground"));
AbtnCarPa.setBackground(UIManager.getColor("CheckBox.background"));
AbtnCarPa.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        CarParking cp = new CarParking();   //calling car parking window will come.
        CarParking.main(null);
        frmSrarchCar.setVisible(false);
    }
});
AbtnCarPa.setFont(new Font("Sitka Text", Font.BOLD, 11));
// Updated bounds to match the position in the first code block
AbtnCarPa.setBounds(49, 69, 184, 42);
frmSrarchCar.getContentPane().add(AbtnCarPa);

// Adjusted position for AbtnCarRe
JButton AbtnCarRe = new JButton("CAR RELEASE");
AbtnCarRe.setForeground(UIManager.getColor("CheckBox.foreground"));
AbtnCarRe.setBackground(UIManager.getColor("CheckBox.background"));
AbtnCarRe.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        CarRele cr = new CarRele();   //calling car release window will come.
        CarRele.main(null);
        frmSrarchCar.setVisible(false);
    }
});
AbtnCarRe.setFont(new Font("Sitka Text", Font.BOLD, 11));
// Updated bounds to match the position in the first code block
AbtnCarRe.setBounds(287, 69, 157, 42);
frmSrarchCar.getContentPane().add(AbtnCarRe);

// Adjusted position for AbtnSearchCar
JButton AbtnSearchCar = new JButton("SEARCH CAR");
AbtnSearchCar.setForeground(UIManager.getColor("CheckBox.foreground"));
AbtnSearchCar.setBackground(UIManager.getColor("CheckBox.background"));
AbtnSearchCar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        SearchCar au = new SearchCar();  //calling about window will come.
        SearchCar.main(null);
        frmSrarchCar.setVisible(false);
    }
});
AbtnSearchCar.setFont(new Font("Sitka Text", Font.BOLD, 11));
// Updated bounds to match the position in the first code block
AbtnSearchCar.setBounds(524, 69, 150, 42);
frmSrarchCar.getContentPane().add(AbtnSearchCar);

// Adjusted position for AbtnLogout
JButton AbtnLogout = new JButton("");
AbtnLogout.setForeground(new Color(255, 250, 250));
AbtnLogout.setIcon(new ImageIcon("C:\\Users\\AFFAN\\Desktop\\CarPic\\exit.png"));
// Updated bounds to match the position in the first code block
AbtnLogout.setBounds(674, 69, 46, 42);
AbtnLogout.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        int AbtnLogout = JOptionPane.showConfirmDialog(null, "Are You Sure?", "LOG OUT", JOptionPane.YES_NO_OPTION);
        if (AbtnLogout == JOptionPane.YES_OPTION) {
            LOGIN li = new LOGIN();
            LOGIN.main(null);
            frmSrarchCar.setVisible(false);
        }
    }
});
AbtnLogout.setFont(new Font("Sitka Text", Font.BOLD, 11));
frmSrarchCar.getContentPane().add(AbtnLogout);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\AFFAN\\Desktop\\CarPic\\nsu.jpg"));
		lblNewLabel.setBounds(33, 0, 63, 72);
		frmSrarchCar.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 745, 72);
		frmSrarchCar.getContentPane().add(panel);
		
		JLabel lblCarNmbr = new JLabel("Enter Your Car Number:");
		lblCarNmbr.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblCarNmbr.setForeground(Color.WHITE);
		lblCarNmbr.setBounds(54, 159, 240, 30);
		frmSrarchCar.getContentPane().add(lblCarNmbr);
		
		CarNmbr = new JTextField();
		CarNmbr.setBounds(54, 206, 206, 30);
		frmSrarchCar.getContentPane().add(CarNmbr);
		CarNmbr.setColumns(10);
		
		JButton btnSrc = new JButton("");
		btnSrc.setIcon(new ImageIcon("C:\\Users\\AFFAN\\Desktop\\CarPic\\search.png"));
		btnSrc.setForeground(new Color(248, 248, 255));
		btnSrc.setBackground(new Color(255, 250, 250));
		btnSrc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String m="Car Number: "+ CarNmbr.getText();
				try {
					FileReader fr = new FileReader("carpark.txt");
					BufferedReader br = new BufferedReader(fr);
					String in;
					boolean exists = false;
					try {
						while ((in = br.readLine()) != null) {
							

							if ((in.equals(m))) {

								JOptionPane.showMessageDialog(null, "CAR FOUND");
//								System.out.println(in);
								exists = true;
								
								break;
							}
						}
						if (!exists)
							JOptionPane.showMessageDialog(null, "INVALID INFORMATION");
						    CarNmbr.setText(null);
						    
					}
					catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnSrc.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		btnSrc.setBounds(119, 262, 59, 50);
		frmSrarchCar.getContentPane().add(btnSrc);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		textArea_1 = new JTextArea();  // Initialize the textArea_1 here
		textArea_1.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		textArea_1.setBounds(367, 209, 363, 440);
		scrollPane.setBounds(367, 209, 363, 217);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setViewportView(textArea_1);
		frmSrarchCar.getContentPane().add(scrollPane); 
			
		textArea_1.setText(" ");
		
		read_1 = new JButton("PARKED CARS INFO");
		read_1.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		read_1.setBounds(444, 148, 191, 38);
		frmSrarchCar.getContentPane().add(read_1);
		
		JLabel lblNewLabel_1 = new JLabel("SRARCH CAR");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(UIManager.getColor("Button.highlight"));
		lblNewLabel_1.setBounds(96, 322, 114, 24);
		frmSrarchCar.getContentPane().add(lblNewLabel_1);

		textArea_1.append(" ");
        read_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                readCarParkInfo();
            }
        });
    
	}

    // Implementation of abstract method for reading car park information
    @Override
    void readCarParkInfo() {
        try {
            FileReader reader = new FileReader("carpark.txt");
            BufferedReader br = new BufferedReader(reader);
            textArea_1.read(br, null);
            br.close();
            textArea_1.requestFocus();
        } catch (Exception e2) {
            System.out.println(e2);
        }
    }
}
