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
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LOGIN implements Logins {

    static void main(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private JFrame frmLogIn;
    private JTextField txtName;
    private JPasswordField txtPassword;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LOGIN window = new LOGIN();
                    window.frmLogIn.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public LOGIN() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmLogIn = new JFrame();
        frmLogIn.getContentPane().setBackground(new Color(19, 04, 80));
        frmLogIn.getContentPane().setFont(new Font("Sitka Text", Font.PLAIN, 16));

        frmLogIn.setType(Type.POPUP);
        frmLogIn.setTitle("LOG IN");
        frmLogIn.setBounds(100, 100, 761, 537);
        frmLogIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmLogIn.getContentPane().setLayout(null);

        JLabel UserNmae = new JLabel("NAME:");
        UserNmae.setBackground(new Color(0, 0, 0));
        UserNmae.setForeground(new Color(51, 204, 255));
        UserNmae.setFont(new Font("Sitka Text", Font.BOLD, 16));
        UserNmae.setBounds(369, 222, 79, 33);
        frmLogIn.getContentPane().add(UserNmae);

        txtName = new JTextField();
        txtName.setFont(new Font("Sitka Text", Font.PLAIN, 14));
        txtName.setBackground(new Color(255, 255, 255));
        txtName.setBounds(470, 222, 207, 26);
        frmLogIn.getContentPane().add(txtName);
        txtName.setColumns(10);

        JLabel Password = new JLabel("Password:");
        Password.setBackground(new Color(0, 0, 0));
        Password.setForeground(new Color(51, 204, 255));
        Password.setFont(new Font("Sitka Text", Font.BOLD, 16));
        Password.setBounds(369, 265, 97, 31);
        frmLogIn.getContentPane().add(Password);

        JButton btnLogIn = new JButton("");
        btnLogIn.setForeground(Color.WHITE);
        btnLogIn.setIcon(new ImageIcon("C:\\Users\\AFFAN\\Desktop\\CarPic\\lgon.png"));
        btnLogIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String userName = txtName.getText();
                String password = txtPassword.getText();

                if (validateCredentials(userName, password)) {
                    Home hm = new Home(); // calling home window will come.
                    Home.main(null);
                    frmLogIn.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid User Name or Password", "Create account first",
                            JOptionPane.ERROR_MESSAGE);
                    txtName.setText(null);
                    txtPassword.setText(null);
                }
            }
        });
        btnLogIn.setFont(new Font("Sitka Text", Font.BOLD, 16));
        btnLogIn.setBackground(Color.WHITE);
        btnLogIn.setBounds(463, 317, 113, 45);
        frmLogIn.getContentPane().add(btnLogIn);

        txtPassword = new JPasswordField();
        txtPassword.setFont(new Font("Sitka Text", Font.PLAIN, 14));
        txtPassword.setBackground(new Color(255, 255, 255));
        txtPassword.setBounds(470, 269, 207, 25);
        frmLogIn.getContentPane().add(txtPassword);

        JLabel lblNewLabel = new JLabel("ELementRix PARKING MANAGEMENT SYSTEM");
        lblNewLabel.setForeground(new Color(0, 255, 255));
        lblNewLabel.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 30));
        lblNewLabel.setBounds(85, 0, 652, 64);
        frmLogIn.getContentPane().add(lblNewLabel);


        JLabel CarIcon = new JLabel("");
        CarIcon.setIcon(new ImageIcon("C:\\Users\\AFFAN\\Desktop\\CarPic\\nsu.png"));
        CarIcon.setBounds(21, 0, 79, 78);
        frmLogIn.getContentPane().add(CarIcon);

        JLabel lblNewLabel_1 = new JLabel("WELCOME TO THE PARKING LOT");
        lblNewLabel_1.setForeground(new Color(102, 255, 204));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_1.setBounds(187, 64, 372, 25);
        frmLogIn.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\AFFAN\\Desktop\\CarPic\\Admin.png"));
        lblNewLabel_2.setBounds(439, 103,79, 70);
        frmLogIn.getContentPane().add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Admin Login");
        lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD, 24));
        lblNewLabel_3.setForeground(new Color(0, 204, 255));
        lblNewLabel_3.setBounds(408, 183, 168, 26);
        frmLogIn.getContentPane().add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon(
                "C:\\Users\\AFFAN\\Desktop\\CarPic\\ab416209011d8b56634cbf1c841efcf4.jpg"));
        lblNewLabel_4.setBounds(0, 0, 747, 500);
        frmLogIn.getContentPane().add(lblNewLabel_4);
    }

    // Implementing the validateCredentials method from the Login interface
    @Override
    public boolean validateCredentials(String username, String password) {
        String line;
        String[] values = null;

        File file = new File("C:\\Users\\AFFAN\\Documents\\NetBeansProjects\\CarParking2\\src\\main\\java\\com\\mycompany\\carparking2\\createAccount.txt");
        FileReader fr;
        BufferedReader br;

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                values = line.split(" ");
            }
            br.close(); // Closing the BufferedReader
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Checking if the username and password match the values read from the file
        return values != null && username.equals(values[0]) && password.equals(values[1]);
    }
}

