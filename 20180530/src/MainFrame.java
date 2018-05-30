import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton    B1  = new JButton("解密");
    private JButton    B2  = new JButton("加密");
    private JButton    B3  = new JButton("Exit");
    private JLabel     L1  = new JLabel ("密碼");
    private JTextField TF  = new JTextField();
    private JTextArea  TA1 = new JTextArea ();
    private JTextArea  TA2 = new JTextArea ();
    private JPanel     P1  = new JPanel    ();
    private Container cp ;
    public MainFrame(){
        this.init();
    }
    public void init(){
        cp = this.getContentPane();
        this.setLayout(null);
        this.add(L1);
        this.add(B1);
        this.add(B2);
        this.add(B3);
        this.add(TF);
        L1.setBounds(385,0,100,100);
        TF.setBounds(350,80,100,100);
        B1.setBounds(350,180,100,100);
        B2.setBounds(350,280,100,100);
        B3.setBounds(350,380,100,100);
        this.setBounds(80, 60, 800, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //////////////////////////////////////////////////////////////
        B3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
