import javax.swing.*;
import java.awt.*;
public class TEST{
    public JFrame f;
    public JPanel p;
    public JButton b1;
    public JLabel lab;

    public TEST()
    {
        gui();
    }
    public void gui()
    {
        f=new JFrame("hanzla king");
        f.setVisible(true);
        f.setSize(6000,2000);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p=new JPanel();
        p.setBackground(Color.red);
        b1=new JButton("test4");
        lab=new JLabel("hanzla is king");
        p.add(b1);
        p.add(lab);
        f.add(p);
    }
    
    public static void main(String[] args) {
        
       new TEST();
    }

  
}
