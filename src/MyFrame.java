import javax.swing.*;
import javax.swing.text.FlowView;
import java.awt.*;

public class MyFrame extends JFrame
{
    public MyFrame()
    {
        super("Unit Converter #000");
        int widthFrame = 150;
        int heightFrame = 400;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Centruje Ramke
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width-widthFrame)/2,(Toolkit.getDefaultToolkit().getScreenSize().height-heightFrame)/2);
        setSize(widthFrame,heightFrame);
        setLayout(new FlowLayout(FlowView.TOP));

        add(new JButton("CM  TO  M"));
        add(new JButton("M   TO  CM"));
        add(new JButton("MM  TO  CM"));
        add(new JButton("CM  TO  MM"));
        add(new JButton("MIL TO  KM"));
        add(new JButton("KM  TO  MIL"));
        add(new JButton("'C  TO  'F"));
        add(new JButton("'F  TO  'C"));
        add(new JButton("M   TO  KM"));
        add(new JButton("KM  TO  M"));
        add(new JButton("END"));

        setVisible(true);
    }
}
