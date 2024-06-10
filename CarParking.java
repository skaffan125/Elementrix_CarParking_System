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
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;


public class CarParking extends carpark {

	public static ArrayList<carpark> car = new ArrayList<carpark>();
	public static HashMap<carpark, Boolean> hm = new HashMap<carpark, Boolean>();
	String s;
	
	private JFrame frmCarParking;
	private JTextField Name;
	private JTextField MobileNmbr;
	private JTextField carNumber;
	private JTextField plcNmbr;
	private JTextField TkPerHr;	
	private JTextField Time;
	private JTextField Duration;
	private JTextField Date;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarParking window = new CarParking();
					window.frmCarParking.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CarParking() {
		initialize();
	}

	private void initialize() {
		frmCarParking = new JFrame();
frmCarParking.getContentPane().setBackground(new Color(0, 0, 51));
frmCarParking.setTitle("CAR PARKING");
frmCarParking.setBounds(100, 100, 734, 484);
frmCarParking.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frmCarParking.getContentPane().setLayout(null);

JLabel lblNewLabel_1 = new JLabel("Hour");
lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 15));
lblNewLabel_1.setForeground(SystemColor.text);
lblNewLabel_1.setBounds(595, 284, 46, 20);
frmCarParking.getContentPane().add(lblNewLabel_1);

// Adjusted positions for buttons
JButton CPbtnHome = new JButton("");
CPbtnHome.setIcon(new ImageIcon("C:\\Users\\AFFAN\\Desktop\\CarPic\\home.png"));
CPbtnHome.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        Home hm = new Home();   // calling home window will come.
        Home.main(null);
        frmCarParking.setVisible(false);
    }
});
CPbtnHome.setFont(new Font("Sitka Text", Font.BOLD, 11));
CPbtnHome.setBounds(0, 69, 49, 42);
frmCarParking.getContentPane().add(CPbtnHome);

JButton CPbtnCarPa = new JButton("CAR PARKING");
CPbtnCarPa.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        CarParking cp = new CarParking();   //calling car parking window will come.
        CarParking.main(null);
        frmCarParking.setVisible(false);
    }
});
CPbtnCarPa.setFont(new Font("Sitka Text", Font.BOLD, 11));
CPbtnCarPa.setBounds(50, 69, 168, 42);
frmCarParking.getContentPane().add(CPbtnCarPa);

JButton CPbtnCarRe = new JButton("CAR RELEASE");
CPbtnCarRe.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        CarRele cr = new CarRele();   //calling car release window will come.
        CarRele.main(null);
        frmCarParking.setVisible(false);
    }
});
CPbtnCarRe.setFont(new Font("Sitka Text", Font.BOLD, 11));
CPbtnCarRe.setBounds(218, 69, 169, 42);
frmCarParking.getContentPane().add(CPbtnCarRe);

JButton CPbtnAbout = new JButton("SEARCH CAR");
CPbtnAbout.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        SearchCar au = new SearchCar();  //calling search window will come.
        SearchCar.main(null);
        frmCarParking.setVisible(false);
    }
});
CPbtnAbout.setFont(new Font("Sitka Text", Font.BOLD, 11));
CPbtnAbout.setBounds(387, 69, 142, 42); // Adjusted position
frmCarParking.getContentPane().add(CPbtnAbout);

JButton CPbtnLogout = new JButton("");
CPbtnLogout.setIcon(new ImageIcon("C:\\Users\\AFFAN\\Desktop\\CarPic\\exit.png"));
CPbtnLogout.setBounds(529, 69, 46, 42); // Adjusted position
CPbtnLogout.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        int CPbtnLogout = JOptionPane.showConfirmDialog(null, "Are You Sure?", "LOG OUT", JOptionPane.YES_NO_OPTION);
        if (CPbtnLogout == JOptionPane.YES_OPTION) {
            LOGIN li = new LOGIN();
            LOGIN.main(null);
            frmCarParking.setVisible(false);
        }
    }
});
CPbtnLogout.setFont(new Font("Sitka Text", Font.BOLD, 11));
frmCarParking.getContentPane().add(CPbtnLogout);

		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\AFFAN\\Desktop\\CarPic\\nsu.png"));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(29, -5, 82, 80);
		frmCarParking.getContentPane().add(label_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(192, 192, 192), Color.LIGHT_GRAY));
		panel.setBounds(0, 112, 352, 340);
		frmCarParking.getContentPane().add(panel);
		panel.setLayout(null);
		
		JCheckBox A_11 = new JCheckBox("A1");
		A_11.setBackground(new Color(204, 204, 102));
		A_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==A_11) {
			String s= "A1";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(A_11);
		A_11.setBounds(6, 7, 51, 23);
		panel.add(A_11);
		
		
		
		
		JCheckBox A_12 = new JCheckBox("A2");
		A_12.setBackground(new Color(204, 204, 102));
		A_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==A_12) {
			String s= "A2";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(A_12);
		A_12.setBounds(6, 33, 51, 23);
		panel.add(A_12);
		
		JCheckBox A_1 = new JCheckBox("A3");
		A_1.setBackground(new Color(204, 204, 102));
		A_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==A_1) {
			String s= "A3";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(A_1);
		A_1.setBounds(6, 59, 51, 23);
		panel.add(A_1);
		
		JCheckBox A_2 = new JCheckBox("A4");
		A_2.setBackground(new Color(204, 204, 102));
		A_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==A_2) {
			String s= "A4";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(A_2);
		A_2.setBounds(6, 85, 51, 23);
		panel.add(A_2);
		
		JCheckBox A_3 = new JCheckBox("A5");
		A_3.setBackground(new Color(204, 204, 102));
		A_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==A_3) {
			String s= "A5";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(A_3);
		A_3.setBounds(6, 111, 51, 23);
		panel.add(A_3);
		
		JCheckBox A_4 = new JCheckBox("A6");
		A_4.setBackground(new Color(204, 204, 102));
		A_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==A_4) {
			String s= "A6";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(A_4);
		A_4.setBounds(6, 137, 51, 23);
		panel.add(A_4);
		
		JCheckBox A_5 = new JCheckBox("A7");
		A_5.setBackground(new Color(204, 204, 102));
		A_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==A_5) {
			String s= "A7";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(A_5);
		A_5.setBounds(6, 163, 51, 23);
		panel.add(A_5);
		
		JCheckBox A_6 = new JCheckBox("A8");
		A_6.setBackground(new Color(204, 204, 102));
		A_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==A_6) {
			String s= "A8";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(A_6);
		A_6.setBounds(6, 189, 51, 23);
		panel.add(A_6);
		
		
		JCheckBox A_7 = new JCheckBox("A9");
		A_7.setBackground(new Color(204, 204, 102));
		A_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==A_7) {
			String s= "A9";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(A_7);
		A_7.setBounds(6, 215, 51, 23);
		panel.add(A_7);
		
		JCheckBox A_8 = new JCheckBox("A10");
		A_8.setBackground(new Color(204, 204, 102));
		A_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==A_8) {
			String s= "A10";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(A_8);
		A_8.setBounds(6, 241, 51, 23);
		panel.add(A_8);
		
		
		JCheckBox A_9 = new JCheckBox("A11");
		A_9.setBackground(new Color(204, 204, 102));
		A_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==A_9) {
			String s= "A11";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(A_9);
		A_9.setBounds(6, 267, 51, 23);
		panel.add(A_9);
		
		JCheckBox A_10 = new JCheckBox("A12");
		A_10.setBackground(new Color(204, 204, 102));
		A_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==A_10) {
			String s= "A12";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(A_10);
		A_10.setBounds(6, 293, 51, 23);
		panel.add(A_10);
		
		JCheckBox B = new JCheckBox("B1");
		B.setBackground(new Color(255, 204, 102));
		B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==B) {
			String s= "B1";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(B);
		B.setBounds(59, 7, 58, 23);
		panel.add(B);
		
		JCheckBox B_1 = new JCheckBox("B2");
		B_1.setBackground(new Color(255, 204, 102));
		B_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==B_1) {
			String s= "B2";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(B_1);
		B_1.setBounds(59, 33, 58, 23);
		panel.add(B_1);
		
		JCheckBox B_2 = new JCheckBox("B3");
		B_2.setBackground(new Color(255, 204, 102));
		B_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==B_2) {
			String s= "B3";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(B_2);
		B_2.setBounds(59, 59, 58, 23);
		panel.add(B_2);
		
		JCheckBox B_3 = new JCheckBox("B4");
		B_3.setBackground(new Color(255, 204, 102));
		B_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==B_3) {
			String s= "B4";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(B_3);
		B_3.setBounds(59, 85, 58, 23);
		panel.add(B_3);
		
		JCheckBox B_4 = new JCheckBox("B5");
		B_4.setBackground(new Color(255, 204, 102));
		B_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==B_4) {
			String s= "B5";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(B_4);
		B_4.setBounds(59, 111, 58, 23);
		panel.add(B_4);
		
		JCheckBox B_5 = new JCheckBox("B6");
		B_5.setBackground(new Color(255, 204, 102));
		B_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==B_5) {
			String s= "B6";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(B_5);
		B_5.setBounds(59, 137, 58, 23);
		panel.add(B_5);
		
		JCheckBox B_6 = new JCheckBox("B7");
		B_6.setBackground(new Color(255, 204, 102));
		B_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==B_6) {
			String s= "B7";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(B_6);
		B_6.setBounds(59, 163, 58, 23);
		panel.add(B_6);
		
		JCheckBox B_7 = new JCheckBox("B8");
		B_7.setBackground(new Color(255, 204, 102));
		B_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==B_7) {
			String s= "B8";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(B_7);
		B_7.setBounds(59, 189, 58, 23);
		panel.add(B_7);
		
		JCheckBox B_8 = new JCheckBox("B9");
		B_8.setBackground(new Color(255, 204, 102));
		B_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==B_8) {
			String s= "B9";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(B_8);
		B_8.setBounds(59, 215, 58, 23);
		panel.add(B_8);
		
		JCheckBox B_9 = new JCheckBox("B10");
		B_9.setBackground(new Color(255, 204, 102));
		B_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==B_9) {
			String s= "B10";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(B_9);
		B_9.setBounds(59, 241, 58, 23);
		panel.add(B_9);
		
		JCheckBox B_10 = new JCheckBox("B11");
		B_10.setBackground(new Color(255, 204, 102));
		B_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==B_10) {
			String s= "B11";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(B_10);
		B_10.setBounds(59, 267, 58, 23);
		panel.add(B_10);
		
		JCheckBox B_11 = new JCheckBox("B12");
		B_11.setBackground(new Color(255, 204, 102));
		B_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==B_11) {
			String s= "B12";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(B_11);
		B_11.setBounds(59, 293, 58, 23);
		panel.add(B_11);
		
		JCheckBox C = new JCheckBox("C1");
		C.setBackground(new Color(204, 255, 51));
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==C) {
			String s= "C1";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(C);
		C.setBounds(119, 7, 59, 23);
		panel.add(C);
		
		JCheckBox C_1 = new JCheckBox("C2");
		C_1.setBackground(new Color(204, 255, 51));
		C_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==C_1) {
			String s= "C2";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(C_1);
		C_1.setBounds(119, 33, 59, 23);
		panel.add(C_1);
		
		JCheckBox C_2 = new JCheckBox("C3");
		C_2.setBackground(new Color(204, 255, 51));
		C_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==C_2) {
			String s= "C3";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(C_2);
		C_2.setBounds(119, 59, 59, 23);
		panel.add(C_2);
		
		JCheckBox C_3 = new JCheckBox("C4");
		C_3.setBackground(new Color(204, 255, 51));
		C_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==C_3) {
			String s= "C4";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(C_3);
		C_3.setBounds(119, 85, 59, 23);
		panel.add(C_3);
		
		JCheckBox C_4 = new JCheckBox("C5");
		C_4.setBackground(new Color(204, 255, 102));
		C_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==C_4) {
			String s= "C5";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(C_4);
		C_4.setBounds(119, 111, 59, 23);
		panel.add(C_4);
		
		JCheckBox C_5 = new JCheckBox("C6");
		C_5.setBackground(new Color(204, 255, 102));
		C_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==C_5) {
			String s= "C6";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(C_5);
		C_5.setBounds(119, 137, 59, 23);
		panel.add(C_5);
		
		JCheckBox C_6 = new JCheckBox("C7");
		C_6.setBackground(new Color(204, 255, 51));
		C_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==C_6) {
			String s= "C7";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(C_6);
		C_6.setBounds(119, 163, 59, 23);
		panel.add(C_6);
		
		JCheckBox C_7 = new JCheckBox("C8");
		C_7.setBackground(new Color(204, 255, 51));
		C_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==C_7) {
			String s= "C8";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(C_7);
		C_7.setBounds(119, 189, 59, 23);
		panel.add(C_7);
		
		JCheckBox C_8 = new JCheckBox("C9");
		C_8.setBackground(new Color(204, 255, 51));
		C_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==C_8) {
			String s= "C9";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(C_8);
		C_8.setBounds(119, 215, 59, 23);
		panel.add(C_8);
		
		JCheckBox C_9 = new JCheckBox("C10");
		C_9.setBackground(new Color(204, 255, 51));
		C_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==C_9) {
			String s= "C10";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(C_9);
		C_9.setBounds(119, 241, 59, 23);
		panel.add(C_9);
		
		JCheckBox C_10 = new JCheckBox("C11");
		C_10.setBackground(new Color(204, 255, 51));
		C_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==C_10) {
			String s= "C11";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(C_10);
		C_10.setBounds(119, 267, 59, 23);
		panel.add(C_10);
		
		JCheckBox C_11 = new JCheckBox("C12");
		C_11.setBackground(new Color(204, 255, 51));
		C_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==C_11) {
			String s= "C12";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(C_11);
		C_11.setBounds(119, 293, 59, 23);
		panel.add(C_11);
		
		JCheckBox D = new JCheckBox("D1");
		D.setBackground(new Color(102, 255, 102));
		D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==D) {
			String s= "D1";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(D);
		D.setBounds(180, 7, 60, 23);
		panel.add(D);
		
		JCheckBox D_1 = new JCheckBox("D2");
		D_1.setBackground(new Color(51, 255, 102));
		D_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==D_1) {
			String s= "D2";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(D_1);
		D_1.setBounds(180, 33, 60, 23);
		panel.add(D_1);
		
		JCheckBox D_2 = new JCheckBox("D3");
		D_2.setBackground(new Color(51, 255, 102));
		D_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==D_2) {
			String s= "D3";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(D_2);
		D_2.setBounds(180, 59, 60, 23);
		panel.add(D_2);
		
		JCheckBox D_3 = new JCheckBox("D4");
		D_3.setBackground(new Color(51, 255, 102));
		D_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==D_3) {
			String s= "D4";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(D_3);
		D_3.setBounds(180, 85, 60, 23);
		panel.add(D_3);
		
		JCheckBox D_4 = new JCheckBox("D5");
		D_4.setBackground(new Color(51, 255, 102));
		D_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==D_4) {
			String s= "D5";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(D_4);
		D_4.setBounds(180, 111, 60, 23);
		panel.add(D_4);
		
		JCheckBox D_5 = new JCheckBox("D6");
		D_5.setBackground(new Color(51, 255, 102));
		D_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==D_5) {
			String s= "D6";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(D_5);
		D_5.setBounds(180, 137, 60, 23);
		panel.add(D_5);
		
		JCheckBox D_6 = new JCheckBox("D7");
		D_6.setBackground(new Color(51, 255, 102));
		D_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==D_6) {
			String s= "D7";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(D_6);
		D_6.setBounds(180, 163, 60, 23);
		panel.add(D_6);
		
		JCheckBox D_7 = new JCheckBox("D8");
		D_7.setBackground(new Color(51, 255, 102));
		D_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==D_7) {
			String s= "D8";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(D_7);
		D_7.setBounds(180, 189, 60, 23);
		panel.add(D_7);
		
		JCheckBox D_8 = new JCheckBox("D9");
		D_8.setBackground(new Color(51, 255, 102));
		D_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==D_8) {
			String s= "D9";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(D_8);
		D_8.setBounds(180, 215, 60, 23);
		panel.add(D_8);
		
		JCheckBox D_9 = new JCheckBox("D10");
		D_9.setBackground(new Color(51, 255, 102));
		D_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==D_1) {
			String s= "D2";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(D_9);
		D_9.setBounds(180, 241, 60, 23);
		panel.add(D_9);
		
		JCheckBox D_10 = new JCheckBox("D11");
		D_10.setBackground(new Color(51, 255, 102));
		D_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==D_10) {
			String s= "D11";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(D_10);
		D_10.setBounds(180, 267, 60, 23);
		panel.add(D_10);
		
		JCheckBox D_11 = new JCheckBox("D12");
		D_11.setBackground(new Color(51, 255, 102));
		D_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==D_11) {
			String s= "D12";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(D_11);
		D_11.setBounds(180, 293, 60, 23);
		panel.add(D_11);
		
		JCheckBox E = new JCheckBox("E1");
		E.setBackground(new Color(0, 153, 204));
		E.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==E) {
			String s= "E1";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(E);
		E.setBounds(242, 7, 57, 23);
		panel.add(E);
		
		JCheckBox E_1 = new JCheckBox("E2");
		E_1.setBackground(new Color(0, 153, 204));
		E_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==E_1) {
			String s= "E2";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(E_1);
		E_1.setBounds(242, 33, 57, 23);
		panel.add(E_1);
		
		JCheckBox E_2 = new JCheckBox("E3");
		E_2.setBackground(new Color(0, 153, 204));
		E_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==E_2) {
			String s= "E3"+E_2.isSelected();
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(E_2);
		E_2.setBounds(242, 59, 57, 23);
		panel.add(E_2);
		
		JCheckBox E_3 = new JCheckBox("E4");
		E_3.setBackground(new Color(0, 153, 204));
		E_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==E_3) {
			String s= "E4";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(E_3);
		E_3.setBounds(242, 85, 57, 23);
		panel.add(E_3);
		
		JCheckBox E_4 = new JCheckBox("E5");
		E_4.setBackground(new Color(0, 153, 204));
		E_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==E_4) {
			String s= "E5";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(E_4);
		E_4.setBounds(242, 111, 57, 23);
		panel.add(E_4);
		
		JCheckBox E_5 = new JCheckBox("E6");
		E_5.setBackground(new Color(0, 153, 204));
		E_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==E_5) {
			String s= "E6";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(E_5);
		E_5.setBounds(242, 137, 57, 23);
		panel.add(E_5);
		
		JCheckBox E_6 = new JCheckBox("E7");
		E_6.setBackground(new Color(0, 153, 204));
		E_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==E_6) {
			String s= "E7";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(E_6);
		E_6.setBounds(242, 163, 57, 23);
		panel.add(E_6);
		
		JCheckBox E_7 = new JCheckBox("E8");
		E_7.setBackground(new Color(0, 153, 204));
		E_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==E_7) {
			String s= "E8";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(E_7);
		E_7.setBounds(242, 189, 57, 23);
		panel.add(E_7);
		
		JCheckBox E_8 = new JCheckBox("E9");
		E_8.setBackground(new Color(0, 153, 204));
		E_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==E_8) {
			String s= "E9";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(E_8);
		E_8.setBounds(242, 215, 57, 23);
		panel.add(E_8);
		
		JCheckBox E_9 = new JCheckBox("E10");
		E_9.setBackground(new Color(0, 153, 204));
		E_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==E_9) {
			String s= "E10";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(E_9);
		E_9.setBounds(242, 241, 57, 23);
		panel.add(E_9);
		
		JCheckBox E_10 = new JCheckBox("E11");
		E_10.setBackground(new Color(0, 153, 204));
		E_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==E_10) {
			String s= "E11";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(E_10);
		E_10.setBounds(242, 267, 57, 23);
		panel.add(E_10);
		
		JCheckBox E_11 = new JCheckBox("E12");
		E_11.setBackground(new Color(0, 153, 204));
		E_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==E_11) {
			String s= "E12";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(E_11);
		E_11.setBounds(242, 293, 57, 23);
		panel.add(E_11);
		
		JCheckBox F = new JCheckBox("F1");
		F.setBackground(new Color(0, 153, 255));
		F.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==F) {
			String s= "F1";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(F);
		F.setBounds(301, 7, 45, 23);
		panel.add(F);
		
		JCheckBox F_1 = new JCheckBox("F2");
		F_1.setBackground(new Color(0, 153, 255));
		F_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==F_1) {
			String s= "F2";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(F_1);
		F_1.setBounds(301, 33, 45, 23);
		panel.add(F_1);
		
		JCheckBox F_2 = new JCheckBox("F3");
		F_2.setBackground(new Color(0, 153, 255));
		F_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==F_2) {
			String s= "F3";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(F_2);
		F_2.setBounds(301, 59, 45, 23);
		panel.add(F_2);
		
		JCheckBox F_3 = new JCheckBox("F4");
		F_3.setBackground(new Color(0, 153, 255));
		F_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==F_3) {
			String s= "F4";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(F_3);
		F_3.setBounds(301, 85, 45, 23);
		panel.add(F_3);
		
		JCheckBox F_4 = new JCheckBox("F5");
		F_4.setBackground(new Color(0, 153, 255));
		F_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==F_4) {
			String s= "F5";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(F_4);
		F_4.setBounds(301, 111, 45, 23);
		panel.add(F_4);
		
		JCheckBox F_5 = new JCheckBox("F6");
		F_5.setBackground(new Color(0, 153, 255));
		F_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==F_5) {
			String s= "F6";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(F_5);
		F_5.setBounds(301, 137, 45, 23);
		panel.add(F_5);
		
		JCheckBox F_6 = new JCheckBox("F7");
		F_6.setBackground(new Color(0, 153, 255));
		F_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==F_6) {
			String s= "F7";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(F_6);
		F_6.setBounds(301, 163, 45, 23);
		panel.add(F_6);
		
		JCheckBox F_7 = new JCheckBox("F8");
		F_7.setBackground(new Color(0, 153, 255));
		F_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==F_7) {
			String s= "F8";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(F_7);
		F_7.setBounds(301, 189, 45, 23);
		panel.add(F_7);
		
		JCheckBox F_8 = new JCheckBox("F9");
		F_8.setBackground(new Color(0, 153, 255));
		F_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==F_8) {
			String s= "F9";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(F_8);
		F_8.setBounds(301, 215, 45, 23);
		panel.add(F_8);
		
		JCheckBox F_9 = new JCheckBox("F10");
		F_9.setBackground(new Color(0, 153, 255));
		F_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==F_9) {
			String s= "F10";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(F_9);
		F_9.setBounds(301, 241, 45, 23);
		panel.add(F_9);
		
		JCheckBox F_10 = new JCheckBox("F11");
		F_10.setBackground(new Color(0, 153, 255));
		F_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==F_10) {
			String s= "F11";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(F_10);
		F_10.setBounds(301, 267, 45, 23);
		panel.add(F_10);
		
		JCheckBox F_11 = new JCheckBox("F12");
		F_11.setBackground(new Color(0, 153, 255));
		F_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==F_11) {
			String s= "F12";
			plcNmbr.setText(s);
			
		}
			}
		});
		buttonGroup.add(F_11);
		F_11.setBounds(301, 293, 45, 23);
		panel.add(F_11);
		
		JTextPane pnCarNmbr = new JTextPane();
		pnCarNmbr.setBackground(Color.BLACK);
		pnCarNmbr.setForeground(SystemColor.text);
		pnCarNmbr.setFont(new Font("Sitka Text", Font.BOLD, 11));
		pnCarNmbr.setText("CAR NUMBER:");
		pnCarNmbr.setBounds(386, 134, 89, 20);
		frmCarParking.getContentPane().add(pnCarNmbr);
		
		JTextPane pnName = new JTextPane();
		pnName.setBackground(Color.BLACK);
		pnName.setForeground(Color.WHITE);
		pnName.setFont(new Font("Sitka Text", Font.BOLD, 11));
		pnName.setText("NAME:");
		pnName.setBounds(386, 164, 46, 20);
		frmCarParking.getContentPane().add(pnName);
		
		JTextPane pnCellNmbr = new JTextPane();
		pnCellNmbr.setBackground(Color.BLACK);
		pnCellNmbr.setForeground(Color.WHITE);
		pnCellNmbr.setFont(new Font("Sitka Text", Font.BOLD, 11));
		pnCellNmbr.setText("MOBILE NUMBER");
		pnCellNmbr.setBounds(386, 194, 53, 20);
		frmCarParking.getContentPane().add(pnCellNmbr);
		
		JTextPane pnPlcNmbr = new JTextPane();
		pnPlcNmbr.setForeground(Color.WHITE);
		pnPlcNmbr.setBackground(Color.BLACK);
		pnPlcNmbr.setFont(new Font("Sitka Text", Font.BOLD, 11));
		pnPlcNmbr.setText("PLACE No:");
		pnPlcNmbr.setBounds(386, 224, 67, 20);
		frmCarParking.getContentPane().add(pnPlcNmbr);
		
		JTextPane pnTime = new JTextPane();
		pnTime.setBackground(Color.BLACK);
		pnTime.setForeground(Color.WHITE);
		pnTime.setFont(new Font("Sitka Text", Font.BOLD, 11));
		pnTime.setText("START TIME:");
		pnTime.setBounds(386, 254, 77, 20);
		frmCarParking.getContentPane().add(pnTime);
		
		JTextPane pnDate = new JTextPane();
		pnDate.setBackground(Color.BLACK);
		pnDate.setForeground(Color.WHITE);
		pnDate.setFont(new Font("Sitka Text", Font.BOLD, 11));
		pnDate.setText("DATE:");
		pnDate.setBounds(386, 314, 46, 20);
		frmCarParking.getContentPane().add(pnDate);
		
		JTextPane txtpnEndTime = new JTextPane();
		txtpnEndTime.setForeground(Color.WHITE);
		txtpnEndTime.setBackground(Color.BLACK);
		txtpnEndTime.setFont(new Font("Sitka Text", Font.BOLD, 11));
		txtpnEndTime.setText("DURATION:");
		txtpnEndTime.setBounds(386, 284, 73, 20);
		frmCarParking.getContentPane().add(txtpnEndTime);
		
		JTextPane txtpnTotalCost = new JTextPane();
		txtpnTotalCost.setForeground(Color.WHITE);
		txtpnTotalCost.setBackground(Color.BLACK);
		txtpnTotalCost.setFont(new Font("Sitka Text", Font.BOLD, 11));
		txtpnTotalCost.setText("COST:");
		txtpnTotalCost.setBounds(386, 344, 53, 20);
		frmCarParking.getContentPane().add(txtpnTotalCost);
		
		carNumber = new JTextField();
		carNumber.setBackground(SystemColor.inactiveCaptionBorder);
		carNumber.setColumns(10);
		carNumber.setBounds(500, 134, 178, 20);
		frmCarParking.getContentPane().add(carNumber);
		
		Name = new JTextField();
		Name.setBackground(SystemColor.inactiveCaptionBorder);
		Name.setBounds(500, 164, 178, 20);
		frmCarParking.getContentPane().add(Name);
		Name.setColumns(10);
		
		MobileNmbr = new JTextField();
		MobileNmbr.setBackground(SystemColor.inactiveCaptionBorder);
		MobileNmbr.setColumns(10);
		MobileNmbr.setBounds(500, 194, 178, 20);
		frmCarParking.getContentPane().add(MobileNmbr);
		
		plcNmbr = new JTextField();
		plcNmbr.setBackground(SystemColor.inactiveCaptionBorder);
		plcNmbr.setColumns(10);
		plcNmbr.setBounds(500, 224, 67, 20);
		frmCarParking.getContentPane().add(plcNmbr);
		
		TkPerHr = new JTextField();
		
		TkPerHr.setBackground(SystemColor.inactiveCaptionBorder);
		TkPerHr.setColumns(10);
		TkPerHr.setBounds(502, 344, 100, 20);
		frmCarParking.getContentPane().add(TkPerHr);
		
		JButton donebtn = new JButton("Done");
		donebtn.setForeground(new Color(255, 255, 255));
		donebtn.setBackground(new Color(0, 102, 204));
		donebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				Object obj = arg0.getSource();
				
				
				if(obj== donebtn) {
					carpark temp = new carpark(carNumber.getText(), Name.getText(),MobileNmbr.getText(),plcNmbr.getText(),Time.getText(),Duration.getText(),Date.getText());
					if (hm.get(temp)==null) {
						car.add(temp);
						hm.put(temp, true);
						carNumber.setText("");
						Name.setText("");
						MobileNmbr.setText("");
						plcNmbr.setText("");
						Time.setText("");
						Duration.setText("");
						Date.setText("");
					
					}  else {
						carNumber.setText("");
						Name.setText("");
						MobileNmbr.setText("");
						plcNmbr.setText("");
						Time.setText("");
						Duration.setText("");
						Date.setText("");
						
					}
					try {
						PrintWriter bw= new PrintWriter(new BufferedWriter(new FileWriter("carpark.txt",true)));
						for(int i=0; i<car.size();i++) {
							
							bw.println("Car Number: "+car.get(i).carnum);
							bw.println("Driver Name: "+car.get(i).name);
							bw.println("Cell no: "+car.get(i).cellno);
							bw.println("Place no: "+car.get(i).placeno);
							bw.println("Entry time: "+car.get(i).startTime);
							bw.println("Duration: "+car.get(i).duration);
							bw.println("Date: "+car.get(i).date);
							bw.println("--------------------------------------------------");
						}
						bw.close();
					} catch (Exception e) {
						
						e.printStackTrace();
					}
				}
				
				
			}
		});
		donebtn.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		donebtn.setBounds(534, 385, 89, 23);
		frmCarParking.getContentPane().add(donebtn);
		
		Time = new JTextField();
		Time.setBackground(SystemColor.inactiveCaptionBorder);
		Time.setForeground(SystemColor.desktop);
		Time.setBounds(500, 254, 106, 20);
		frmCarParking.getContentPane().add(Time);
		Time.setColumns(10);
		
		Duration = new JTextField();
		Duration.setBackground(SystemColor.inactiveCaptionBorder);
		Duration.setBounds(500, 284, 85, 20);
		frmCarParking.getContentPane().add(Duration);
		Duration.setColumns(10);
		
		Date = new JTextField();
		Date.setBackground(SystemColor.inactiveCaptionBorder);
		Date.setBounds(502, 314, 100, 20);
		frmCarParking.getContentPane().add(Date);
		Date.setColumns(10);
		
		JRadioButton rdobtn = new JRadioButton("");
		rdobtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==rdobtn) {
			DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			Date date = new Date();
			String b= dateFormat.format(date);
			Time.setText(b);
			
		}
			}
		});
		rdobtn.setBackground(SystemColor.activeCaptionText);
		rdobtn.setBounds(469, 251, 21, 23);
		frmCarParking.getContentPane().add(rdobtn);
		
		
		JRadioButton rdbtn1 = new JRadioButton("");
		rdbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==rdbtn1) {
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date();
			String b= dateFormat.format(date);
			Date.setText(b);
			
		}
			}
		});
		rdbtn1.setBackground(SystemColor.activeCaptionText);
		rdbtn1.setBounds(469, 311, 21, 23);
		frmCarParking.getContentPane().add(rdbtn1);
		
		JLabel lblNewLabel = new JLabel("ELementRix PARKING MANAGEMENT SYSTEM");
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 28));
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setBackground(new Color(0, 0, 205));
		lblNewLabel.setBounds(95, 10, 615, 49);
		frmCarParking.getContentPane().add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, -5, 720, 75);
		frmCarParking.getContentPane().add(panel_1);
	}
}
