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
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class CarRele {

	//public static ArrayList<carpark> car = new ArrayList<carpark>();

	private JFrame frmCarRelease;
	private JTextField carNmbr;
	private JTextField name1;
	private JTextField cell1;
	private JTextField place;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarRele window = new CarRele();
					window.frmCarRelease.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CarRele() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCarRelease = new JFrame();
frmCarRelease.getContentPane().setBackground(new Color(0, 0, 51));
frmCarRelease.setTitle("CAR RELEASE");
frmCarRelease.setBounds(100, 100, 744, 465);
frmCarRelease.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frmCarRelease.getContentPane().setLayout(null);

JLabel lblNsuCarParking = new JLabel("LementRix PARKING MANAGEMENT SYSTEM");
lblNsuCarParking.setForeground(new Color(0, 0, 204));
lblNsuCarParking.setFont(new Font("Sitka Text", Font.PLAIN, 28));
lblNsuCarParking.setBounds(103, 12, 582, 44);
frmCarRelease.getContentPane().add(lblNsuCarParking);

JButton CRbtnHome = new JButton("");
CRbtnHome.setForeground(new Color(255, 250, 250));
CRbtnHome.setIcon(new ImageIcon("C:\\Users\\AFFAN\\Desktop\\CarPic\\home.png"));
CRbtnHome.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        Home hm = new Home(); // calling home window will come.
        Home.main(null);
        frmCarRelease.setVisible(false);
    }
});
CRbtnHome.setFont(new Font("Sitka Text", Font.BOLD, 11));
CRbtnHome.setBounds(0, 66, 50, 45);
frmCarRelease.getContentPane().add(CRbtnHome);

JButton CRbtnCarPa = new JButton("CAR PARKING");
CRbtnCarPa.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        CarParking cp = new CarParking(); // calling car parking window will come.
        CarParking.main(null);
        frmCarRelease.setVisible(false);
    }
});
CRbtnCarPa.setFont(new Font("Sitka Text", Font.BOLD, 11));
CRbtnCarPa.setBounds(51, 66, 169, 45); // Adjusted position
frmCarRelease.getContentPane().add(CRbtnCarPa);

JButton CRbtnCarRe = new JButton("CAR RELEASE");
CRbtnCarRe.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        CarRele cr = new CarRele(); // calling car release window will come.
        CarRele.main(null);
        frmCarRelease.setVisible(false);
    }
});
CRbtnCarRe.setFont(new Font("Sitka Text", Font.BOLD, 11));
CRbtnCarRe.setBounds(220, 66, 161, 45); // Adjusted position
frmCarRelease.getContentPane().add(CRbtnCarRe);


JButton CRbtnAbout = new JButton("SEARCH CAR");
CRbtnAbout.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        SearchCar au = new SearchCar(); // calling about window will come.
        SearchCar.main(null);
        frmCarRelease.setVisible(false);
    }
});
CRbtnAbout.setFont(new Font("Sitka Text", Font.BOLD, 11));
CRbtnAbout.setBounds(386, 66, 154, 45); // Adjusted position
frmCarRelease.getContentPane().add(CRbtnAbout);

JButton CPbtnLogout = new JButton("");
CPbtnLogout.setIcon(new ImageIcon("C:\\Users\\AFFAN\\Desktop\\CarPic\\exit.png"));
CPbtnLogout.setBounds(542, 66, 46, 45); // Adjusted position
CPbtnLogout.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        LOGIN li = new LOGIN();
        LOGIN.main(null);
        frmCarRelease.setVisible(false);
    }
});
CPbtnLogout.setFont(new Font("Sitka Text", Font.BOLD, 11));
frmCarRelease.getContentPane().add(CPbtnLogout);


		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\AFFAN\\Desktop\\CarPic\\nsu.png"));
		lblNewLabel.setBounds(26, -7, 73, 80);
		frmCarRelease.getContentPane().add(lblNewLabel);

		JTextPane carnmbr = new JTextPane();
		carnmbr.setBackground(Color.GRAY);
		carnmbr.setText("CAR NUMBER:");
		carnmbr.setFont(new Font("Sitka Text", Font.BOLD, 11));
		carnmbr.setBounds(156, 182, 89, 20);
		frmCarRelease.getContentPane().add(carnmbr);

		carNmbr = new JTextField();
		carNmbr.setColumns(10);
		carNmbr.setBackground(SystemColor.inactiveCaptionBorder);
		carNmbr.setBounds(276, 182, 178, 20);
		frmCarRelease.getContentPane().add(carNmbr);

		


		
		JButton select = new JButton("Release Car");
		select.setFont(new Font("Sitka Text", Font.BOLD, 18));
		select.setForeground(new Color(248, 248, 255));
		select.setBackground(new Color(0, 0, 0));
		select.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				File inputFile = new File("carpark.txt");
				File tempFile = new File("src/TempFile.txt");

				BufferedReader reader = null;
				try {
					reader = new BufferedReader(new FileReader("carpark.txt"));
				} catch (FileNotFoundException e) {

					e.printStackTrace();
				}
				BufferedWriter writer = null;
				try {
					writer = new BufferedWriter(new FileWriter(tempFile));
				} catch (IOException e) {

					e.printStackTrace();
				}

				String lineToRemove = "Car Number: " + carNmbr.getText();
				String currentLine;
				@SuppressWarnings("unused")
				boolean successful = false;

				try {
					while ((currentLine = reader.readLine()) != null) {

						System.out.println(currentLine);
						String trimmedLine = currentLine.trim();
						if (trimmedLine.equals(lineToRemove)) {
							for (int x = 0; x <= 6; x++) {
								reader.readLine();
							}
							JOptionPane.showMessageDialog(null, "Released successfully");
							successful = true;
							continue;
						}
						writer.write(currentLine + System.getProperty("line.separator"));
					}
				} catch (IOException e) {

					e.printStackTrace();
				}
				try {
					writer.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
				try {
					reader.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
				inputFile.delete();
				File outf = new File("carpark.txt");
				FileReader ins = null;
				FileWriter outs = null;
				try {
					ins = new FileReader("src/TempFile.txt");
					outs = new FileWriter(outf);
					int ch;
					while ((ch = ins.read()) != -1) {
						outs.write(ch);
					}
				} catch (IOException e) {
					System.out.println(e);
					System.exit(-1);
				} finally {
					try {
						ins.close();
						outs.close();
					} catch (IOException e) {
					}
				}

				tempFile.delete();
			}

		});

		select.setBounds(244, 356, 169, 31);
		frmCarRelease.getContentPane().add(select);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 737, 69);
		frmCarRelease.getContentPane().add(panel);
	}
}
