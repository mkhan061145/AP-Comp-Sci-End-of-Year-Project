/**
 * @(#)PayrollProject.java
 *
 * PayrollProject application
 *
 * @author Mariam Khan
 * @author Sahana Iyer
 * @author Justin Anderson
 * @version 1.00 2017/5/8
 */
 
public class PayrollProject {
    
    public static void main(String[] args) {
    	
     JFrame frame = new JFrame("JFrame Example");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
       JLabel label = new JLabel("This is a label!");
        JButton button = new JButton();
        button.setText("Press me");
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
