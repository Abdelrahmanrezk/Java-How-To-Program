// Dialog1.java
// Using JOptionPane to display Multiple lines in a dialog box.
import javax.swing.JOptionPane;

public class Dialog1
{
	public static void main(String [] args)
	{
		/*
			Instead of using terminal to represent result we use GUI to represent your message in.
			Java provide swing library with its JOptionPane class to help us represent this GUI.
			Dialog box is just like the Gmail you use to write your e-mail and send to some one,
			also its looks like the window of Firefox and other programs.
		*/
		// Display a dialog with message
		JOptionPane.showMessageDialog(null, "Welcome To Java GUI");
	} // End of Main method
} // End of Dialog Class