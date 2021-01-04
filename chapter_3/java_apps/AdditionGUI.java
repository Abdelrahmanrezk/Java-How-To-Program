// AdditionGUI.java
// AdditionGUI program that inputs two numbers and displays their sum.
import javax.swing.JOptionPane;


public class AdditionGUI
{
    // Main method ebgins execution of the program
    public static void main(String[] args)
    {
        // Prompt for input numbers
        
        int number1 = Integer.parseInt(JOptionPane.showInputDialog("Please Input number 1")); // first number to add
        int number2 = Integer.parseInt(JOptionPane.showInputDialog("Please Input number 2 ")); // second number to add
        int sum = number1 + number2; // sum of number1 and number2
        
        // Format the string for displaying
        String message = String.format("The sum of %d and %d is: %d", number1, number2, sum);
        
        // The Dialog Message
        JOptionPane.showMessageDialog(null, message);
        
    } // End of main method
} // End of class AdditionGUI