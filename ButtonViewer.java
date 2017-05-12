/**
 * @(#)ButtonViewer.java
 *
 * ButtonViewer application
 *
 * @Mariam Khan
 * @version 1.00 2017/1/31
 */
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
   This program demonstrates how to install an action listener.
*/
public class ButtonViewer
{  
   public static void main(String[] args)
   {  
      JFrame frame = new JFrame();
      JPanel panel = new JPanel();
      JButton buttonA = new JButton("Button A");
      JButton buttonB = new JButton("Button B");
      panel.add(buttonA);
      panel.add(buttonB);
      frame.add(panel);
      
      ActionListener listenerA = new ClickListener("A");
      ActionListener listenerB = new ClickListener("B");
      buttonA.addActionListener(listenerA);
      buttonB.addActionListener(listenerB);

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
   private static final int FRAME_WIDTH = 150;
   private static final int FRAME_HEIGHT = 100;
}

