import javax.swing.JFrame;
import java.awt.*;

public class Frame extends JFrame {

	public Frame() {
		Panel panel = new Panel();
		
		
		this.setContentPane(panel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.pack();
	}
	
}
