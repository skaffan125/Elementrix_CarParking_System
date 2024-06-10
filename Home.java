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
//import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Home  {

	private JFrame frmHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frmHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHome = new JFrame();
                
		frmHome.getContentPane().setForeground(Color.WHITE);
		frmHome.getContentPane().setBackground(new Color(255, 255, 255));
		frmHome.setTitle("HOME");
		frmHome.setBounds(100, 100, 734, 520);
		frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHome.getContentPane().setLayout(null);
		
		JButton HbtnHome = new JButton("");

		HbtnHome.setIcon(new ImageIcon("C:\\Users\\AFFAN\\Desktop\\CarPic\\home.png"));
		HbtnHome.setForeground(new Color(255, 250, 250));
		HbtnHome.setBackground(UIManager.getColor("Button.background"));
		HbtnHome.setBounds(1, 69, 48, 42);
		HbtnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Home hm= new Home();   // calling home window will come.
				Home.main(null);
				frmHome.setVisible(false);
			}
		});
		HbtnHome.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frmHome.getContentPane().add(HbtnHome);
		
		JButton HbtnCarPa = new JButton("CAR PARKING");
		HbtnCarPa.setForeground(new Color(0, 0, 0));
		HbtnCarPa.setBackground(new Color(240, 240, 240));
		HbtnCarPa.setBounds(49, 69, 184, 42);
		HbtnCarPa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarParking cp= new CarParking();   //calling car parking window will come.
				CarParking.main(null);
				frmHome.setVisible(false);
			}
		});
		HbtnCarPa.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frmHome.getContentPane().add(HbtnCarPa);
		
		JButton HbtnCarRe = new JButton("CAR RELEASE");
		HbtnCarRe.setForeground(new Color(0, 0, 0));
		HbtnCarRe.setBackground(new Color(240, 240, 240));
		HbtnCarRe.setBounds(287, 69, 157, 42);
		HbtnCarRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarRele cr= new CarRele();   //calling car release window will come.
				CarRele.main(null);
				frmHome.setVisible(false);
			}
		});
		HbtnCarRe.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frmHome.getContentPane().add(HbtnCarRe);
		

		
		JButton HbtnAbout = new JButton("SEARCH CAR");
		HbtnAbout.setForeground(new Color(0, 0, 0));
		HbtnAbout.setBackground(new Color(240, 240, 240));
		HbtnAbout.setBounds(524, 69, 150, 42);
		HbtnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchCar au= new SearchCar();  //calling about window will come.
				SearchCar.main(null);
				frmHome.setVisible(false);
			}
		});
		HbtnAbout.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frmHome.getContentPane().add(HbtnAbout);		
		
		JButton HbtnLogout = new JButton("");
		HbtnLogout.setForeground(Color.WHITE);
		HbtnLogout.setIcon(new ImageIcon("C:\\Users\\AFFAN\\Desktop\\CarPic\\exit.png"));
		HbtnLogout.setBounds(674, 69, 46, 42);
		HbtnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int HbtnLogout = JOptionPane.showConfirmDialog(null, "Are You Sure?", "LOG OUT", JOptionPane.YES_NO_OPTION);
				if(HbtnLogout == JOptionPane.YES_OPTION) {
				LOGIN li= new LOGIN();
				LOGIN.main(null);
				frmHome.setVisible(false);
				}
				
			}
		});
		HbtnLogout.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frmHome.getContentPane().add(HbtnLogout);
		
		JLabel lblNewLabel_3 = new JLabel("ELementRix PARKING MANAGEMENT SYSTEM");
		lblNewLabel_3.setForeground(new Color(0, 0, 153));
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.PLAIN, 28));
		lblNewLabel_3.setBounds(88, 15, 654, 44);
		frmHome.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\AFFAN\\Desktop\\CarPic\\nsu.png"));
		lblNewLabel.setBounds(20, 0, 58, 64);
		frmHome.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(UIManager.getColor("Button.background"));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\AFFAN\\Desktop\\CarPic\\parking-accident-lawyer.jpg"));
		lblNewLabel_1.setBounds(0, 110, 720, 373);
		frmHome.getContentPane().add(lblNewLabel_1);

// Inside the initialize() method, after the declaration of lblNewLabel_1 label

// Label for course name
JLabel lblCourse = new JLabel("CSE215L-Elementrix");
lblCourse.setFont(new Font("Sitka Text", Font.BOLD, 16));
lblCourse.setBounds(100, 200, 200, 30); // Adjust position as needed
frmHome.getContentPane().add(lblCourse);

// Label for group members
JLabel lblGroupMembers = new JLabel("Group Members:");
lblGroupMembers.setFont(new Font("Sitka Text", Font.BOLD, 16));
lblGroupMembers.setBounds(100, 230, 200, 30); // Adjust position as needed
frmHome.getContentPane().add(lblGroupMembers);
// Label for name 1
JLabel lblName1 = new JLabel("Sk Affan Ibna Salim Zihad - 2012609042");
lblName1.setFont(new Font("Sitka Text", Font.PLAIN, 14));
lblName1.setBounds(120, 260, 300, 20); // Increased width to 300
frmHome.getContentPane().add(lblName1);


// Label for name 3
JLabel lblName3 = new JLabel("Rebecca Sultana Asha - 2312640642");
lblName3.setFont(new Font("Sitka Text", Font.PLAIN, 14));
lblName3.setBounds(120, 320, 300, 20); // Increased width to 300
frmHome.getContentPane().add(lblName3);

	}

}

