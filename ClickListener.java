import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ClickListener implements ActionListener{
	public ClickListener(String buttonName){
		buttonN = buttonName;
	}
	public void actionPerformed(ActionEvent e){
		System.out.println("I was clicked!");
		count++;
		System.out.println("Button " + buttonN + " was clicked " + count + " number of times.");
	}
	private int count;
	private String buttonN;
}
