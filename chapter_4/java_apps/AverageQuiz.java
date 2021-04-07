/*
- Created By: Abdelrahman Rezk
Class AverageQuiz is a class that get the average of ten students grades in such quiz,
frade should be in (0>= grade <= 100).
  
Local Variables:
    total, counter, grade, average. 
    Remember that local variables can be used only in the body of the method 
    from the line they declared to the end of body brace } right brace, as well as grade variable,
    is only used inside the while body.
Program are divided into 3 phases

- Initialization Phase:
    These are the variables will be used later.

- Process Phase:
    While is still true which counter <= 10 
    So, for each time the condition is true reade grade, then add grade to total, 
    then increase counter by 1 to terminate the loop from infinite iterations.

- Terminate Phase:
    Once we have done our process we need to represent the result and end the program.

- Integer Division:
    From the expression below, when we divide total by 10, it seems logical error, 
    as we know that the result maybe contain floating value, if total was 784 by 10 !
    The result from integer by integer is integer and the after decimal point is **truncated**
    Later will see Another Algorithm to solve the problem.

- Arithmetic Overflow:
    Take care if you have to add a lot of numbers together,
    so you need to know Maximum and Minimum of your data type if it can fit the summation in.

- Receiving User Input:
    We should ask if user:
        input another data type ?
        input characters, double, value greater than 100 or less than 0 ?
*/

import java.util.Scanner;
public class AverageQuiz{
    public static void main(String[] args){

        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        // Initialization Phase
        int total   = 0; // The variable will sum the grades in
        int counter = 1; // The counter that will flag the end of loop

        // Process Phase use the counter-controller
        while(counter <= 10){
            System.out.print("Enter Grade: "); // Prompt the user
            int grade = input.nextInt();
            total   +=  grade; // Add grade to total
            counter += 1;      // Increase the counter-controller by 1
        }
        // Terminate Phase
        int average = total / 10; // Integer division will cause integer result
        System.out.printf("The total of the grades is: %d%n", total);
        System.out.printf("The Average of the quiz is: %d", average);
    } // End of the main Method
} // End of the Class