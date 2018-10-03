/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author HCT
 */
    import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
public class JLable {
    public static void main(String[] args){
        JFrame obj=new JFrame(); 
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
     obj.setTitle("Hanzla KING");
    Container a = obj.getContentPane();
     a.setBackground(Color.yellow);
     a.setLayout(null);
     
    JLable lbl=new JLable("log in");
    lbl.setBounds(100,20,300,300);
    a.add(lbl);
}
