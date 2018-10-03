/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/*
 *
 * @author HCT
 */
import java.awt.*;
import javax.swing.*;
public class MyClass {
    public static void main(String[] args){
        JFrame obj=new JFrame(); 
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setBounds(10,50,333,457);
        
     obj.setTitle("Hanzla KING");
    Container a = obj.getContentPane();
     a.setBackground(Color.yellow);
     obj.setResizable(false);
    JLable lbl=new JLable("log in");
    a.add(lbl);
    }
    
}
