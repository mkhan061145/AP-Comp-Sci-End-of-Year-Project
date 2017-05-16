import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ClickListener implements ActionListener{
	public ClickListener(String buttonName){
		buttonN = buttonName;
	}
	public void actionPerformed(ActionEvent e){
		if(count % 2 == 0){
			System.out.println("You are now logged out.");
		}else{
			System.out.println("You are now logged in. Do not forget to logout when you leave.");
		}
		count++;
		System.out.println("Button " + buttonN + " was clicked " + count + " number of times.");
	}
	private int count;
	private String buttonN;
}
