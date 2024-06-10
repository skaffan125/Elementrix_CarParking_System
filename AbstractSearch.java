/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carparking2;


import javax.swing.JTextArea;

abstract class AbstractSearch {
    protected JTextArea textArea_1;

    public AbstractSearch(JTextArea textArea) {
        this.textArea_1 = textArea;
    }

    abstract void readCarParkInfo();
}

