import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class Bilet extends JFrame {
    JTextArea info=new JTextArea(20, 35);
    JPanel  p2, p3;
    JButton bOk, bPrint;
    
    Bilet(String title){
        super(title);
        AscultatorButon ab=new AscultatorButon();
        p2=new JPanel();
        info.setLineWrap(true);
        info.setWrapStyleWord(true);
        info.setEditable(false);
        p2.add(info);
        getContentPane().add(p2, BorderLayout.CENTER);
         try{
             BufferedReader in=new BufferedReader(new FileReader("spectacol.txt"));
             String linie ;
             while ((linie=in.readLine())!=null){
                info.append(linie+"\r\n");
             }
            in.close();    
        }catch(IOException e) {
           System.err.println(e.getMessage());
        }
        
        p3=new JPanel();
        bOk=new JButton("Ok");
        bOk.addActionListener(ab);
        bPrint=new JButton("Print");
        AscultatorB a=new AscultatorB();
        bPrint.addActionListener(a);
        p3.add(bOk);
        p3.add(bPrint);
        getContentPane().add(p3, BorderLayout.SOUTH);
                
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    class AscultatorButon implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            if (ev.getSource()==bOk){
                dispose();
                new Final(" ");
            }
        }
    }
    
    class AscultatorB  implements ActionListener{
        public void actionPerformed(ActionEvent ev) {
            if (ev.getSource()==bPrint){
                PrinterJob job = PrinterJob.getPrinterJob();
                job.setJobName("Print Data");
                job.setPrintable(new Printable(){
                    public int print(Graphics pg,PageFormat pf, int pageNum){
                        pf.setOrientation(PageFormat.LANDSCAPE);
                        if(pageNum>0){
                        return Printable.NO_SUCH_PAGE;
                     }
                     Graphics2D g2 = (Graphics2D)pg;
                     g2.translate(pf.getImageableX(), pf.getImageableY());
                     g2.scale(0.24,0.24);
                     p2.paint(g2);
                     return Printable.PAGE_EXISTS; 
                    }
                });
                boolean ok = job.printDialog();
                if(ok){
                try{
                    job.print();
                }
                catch (PrinterException ex){}
                }
            }
        }
    }
}
