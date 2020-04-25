import javax.xml.stream.events.StartDocument;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
        public static void main(String[] Args) throws InterruptedException
        {
         //   ChangeUnit p1 = new ChangeUnit();
          //  p1.start();

            EventQueue.invokeLater(new Runnable()
                                   {
                                       @Override
                                       public void run()
                                      {
                                          new MyFrame();
                                      }
                                   }
            );
        }

}
