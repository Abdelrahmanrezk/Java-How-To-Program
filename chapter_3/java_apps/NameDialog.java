// NameDialog.java
// Obtaining user input from a dialog
import javax.swing.JOptionPane;

public class NameDialog
{
	public static void main(String [] args)
	{
		// Prompt the message
		String name = JOptionPane.showInputDialog("What is Your Name ??");

		// Create the message
		String message = String.format("Welcome, %s to Java GUI !!!!!", name);

		// diesplay the name 
		JOptionPane.showMessageDialog(null, message);

	} // End of Main method
} // End of class NameDialog