import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.io.*;

public class Final extends JFrame {
    JPanel p1, p2, p3;
    JLabel rest, text;
    JTextField tf_rest;
    JButton bOk;
    
    Final(String title){
        super(title);
        AscultatorButon ab=new AscultatorButon();
        p1=new JPanel();
        rest=new JLabel("Rest");
        tf_rest=new JTextField();
        p1.add(rest);
        try{
            BufferedReader in=new BufferedReader(new FileReader("rest.txt"));
            String linie ;
                while ((linie=in.readLine())!=null){
                    tf_rest.setText(linie+" lei");
            }
            in.close();
        }catch(IOException e) {
            System.err.println(e.getMessage());
        }
        p1.add(tf_rest);
        tf_rest.setEditable(false);
        getContentPane().add(p1, BorderLayout.NORTH);
        
        p2=new JPanel();
        text=new JLabel("Alegeti spectacolul la care vreti sa mergeti...");
        p2.add(text);
        getContentPane().add(p2, BorderLayout.CENTER);
        
        p3=new JPanel();
        bOk=new JButton("Ok");
        p3.add(bOk);
        bOk.addActionListener(ab);
        getContentPane().add(p3, BorderLayout.SOUTH);
        
        pack();
        setLocationRelativeTo(null);
        setSize(300, 150);
        validate();
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
  class AscultatorButon implements ActionListener{
     public void actionPerformed(ActionEvent ev){
        if (ev.getSource()==bOk){
            try{
             PrintWriter writer = new PrintWriter("spectacol.txt");
             writer.print("");
             writer.close();
             }catch(IOException e){
                 System.out.println(e.getMessage());
             }
            try{
             PrintWriter writer = new PrintWriter("rezervare.txt");
             writer.print("");
             writer.close();
             }catch(IOException e){
                 System.out.println(e.getMessage());
             }
            try{
             PrintWriter writer = new PrintWriter("cost.txt");
             writer.print("");
             writer.close();
             }catch(IOException e){
                 System.out.println(e.getMessage());
             }
            try{
             PrintWriter writer = new PrintWriter("rest.txt");
             writer.print("");
             writer.close();
             }catch(IOException e){
                 System.out.println(e.getMessage());
             }
                dispose();
                new Spectacol("Terminal Bilete");
            }
        }
    }    
}
