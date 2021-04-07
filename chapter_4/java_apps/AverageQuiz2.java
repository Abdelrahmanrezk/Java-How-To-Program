/*
- Created By: Abdelrahman Rezk
Class Average Quiz 2 is a class that get the average of arbitrary students grades in such quiz,
and this is the different from Counter-Controlled: which need to define number of student will enter the grades to,
Sentinel-Controlled: which help you enter grades as you need and terminate when you enter flag. value


- Double Division:
    In average variable we have make (unary casting) for total (double) before the variable this is called explicit copy converttion
    to another data type, other one is implicit which happen to counter in the background of the program as we cannot divide
    by two different data type, so this happen as something called promotion.
- Floating-point are not always 100% precise.
    The computer is looking for fixed amount of space while floating either have infinite not repeated sequence, or repeated sequence.
    
*/

import java.util.Scanner;
public class AverageQuiz2{
    public static void main(String[] args){

        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        // Initialization Phase
        int total   = 0; // The variable will sum the grades in
        int counter = 0; // The counter that will flag the end of loop

        System.out.print("Enter grade or -1 to quit: "); // Prompt the user
        int grade = input.nextInt(); // Input grade

        // Process Phase use the Sentinel-controller
        
        while(grade != -1){ // What if we remove {} from while ????

            total   +=  grade; // Add grade to total 
            counter += 1;      // Increase the Sentinel-controller by 1

            System.out.print("Enter grade or -1 to quit: "); // Prompt the user
            grade = input.nextInt(); // Input grade

        }

        // Terminate Phase
        if(counter != 0){
               double average = (double)total / counter; // double division with casting cause double result
                System.out.printf("The total of the grades is: %d%n", total);
                System.out.printf("The Average of the quiz is: %.2f", average); // .2f% means print number to just 2 decimal point.

        }else System.out.println("No grades were entered !!");
     
    } // End of the main Method
} // End of the Class