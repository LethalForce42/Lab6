/**
 * @author Adil Qumar
 * 
 * This program basically is a grade calculator. The program asks the user to manually
 * input scores of all the assignments and then display the currents students grade.
 * A scanner is used to scan in user input into 8 different arrays. A raw score and
 * the total score is scanned in into the appropriate arrays. Furthermore, four different
 * for loops are used to place numbers into their respective array. The four assignments
 * mentioned in the program are Practice Problems, Labs, Midterms, and Final Exam.
 * If the user enter 999 during the for loop, this indicates to the program that
 * the student has not received a score on the remaining assignments and therefore 
 * should be totaled separately. After all user data is entered, the program will
 * display 1 of 2 messages. If there aren't any remaining assignments, the final grade
 * will be displayed. On the other hand, if there are assignments remaining, the program
 * will display the total amount of points remaining for each assignment section and then
 * display the students current grade in the class. All input and output is done
 * through the System.out output.
 */
package lab6;

import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args) {
        
        double ppScore[] = new double[8];
        double ppTotal[] = new double[8];
        double labScore[] = new double[7];
        double labTotal[] = new double[7];
        double midtermScore[] = new double[7];
        double midtermTotal[] = new double[7];
        double finalexamScore[] = new double[1];
        double finalexamTotal[] = new double[1];
        int i;
        double temp = 0;
        double incTotal1 = 0, incTotal2 = 0, incTotal3 = 0, incTotal4 = 0, incTotal5 = 0;
        double Score1 = 0, Total1 = 0, Percentage = 0;
        double Score2 = 0, Total2 = 0;
        double Score3 = 0, Total3 = 0;
        double Score4 = 0, Total4 = 0;
        double finalScore = 0, finalTotal = 0;
        
        //User is asked to input scores
        //A for loop is used to input the scores into arrays
        //An if/else statement helps in determing what to do with remaining assignments
        Scanner scanner = new Scanner(System.in);                       
        System.out.print("Enter Practice Problem Score and the Total Points Possible (Example: 2 4)\n");
        System.out.print("Enter 999 if the next assignments haven't been taken/scored yet!\n");
        for(i = 0; i < 8; i++) {
            System.out.print("Practice Problem " + (i + 1)+" : ");
            temp = scanner.nextDouble();
            if(temp != 999){
                ppScore[i] = temp;
                ppTotal[i] = scanner.nextDouble();
                Score1 = Score1 + ppScore[i];
                Total1 = Total1 + ppTotal[i];
            }
            else{
                incTotal1 = (8 - i) * 6;
                break;
            }
        }        
        Percentage = Score1 / Total1 * 100;
        System.out.printf("Practice Problems: " + Score1 + "/" + Total1 + " = %.2f\n\n", Percentage);
       
        //User is asked to input scores
        //A for loop is used to input the scores into arrays
        //An if/else statement helps in determing what to do with remaining assignments
        temp = 0;
        Percentage = 0;
        System.out.print("Enter Lab Score and the Total Points Possible (Example: 2 4)\n");
        System.out.print("Enter 999 if the next assignments haven't been taken/scored yet!\n");
        for(i = 0; i < 7; i++) {
            System.out.print("Lab " + (i + 1)+" : ");
            temp = scanner.nextDouble();
            if(temp != 999){
                labScore[i] = temp;
                labTotal[i] = scanner.nextDouble();
                Score2 = Score2 + labScore[i];
                Total2 = Total2 + labTotal[i];
            }
            else{
                incTotal2 = (6 - i) * 2 + 4;
                break;
            }
        }
        Percentage = Score2 / Total2 * 100;
        System.out.printf("Labs: " + Score2 + "/" + Total2 + " = %.2f\n\n", Percentage);
        
        //User is asked to input scores
        //A for loop is used to input the scores into arrays
        //An if/else statement helps in determing what to do with remaining assignments
        temp = 0;
        Percentage = 0;
        System.out.print("Enter Midterm Score and the Total Points Possible (Example: 2 4)\n");
        System.out.print("Enter 999 if the next assignments haven't been taken/scored yet!\n");
        for(i = 0; i < 2; i++) {
            System.out.print("Midterm " + (i + 1)+" : ");
            temp = scanner.nextDouble();
            if(temp != 999){
                midtermScore[i] = temp;
                midtermTotal[i] = scanner.nextDouble();
                Score3 = Score3 + midtermScore[i];
                Total3 = Total3 + midtermTotal[i];
            }
            else{
                incTotal3 = (2 - i) * 10;
                break;
            }
        }
        Percentage = Score3 / Total3 * 100;
        System.out.printf("Midterms: " + Score3 + "/" + Total3 + " = %.2f\n\n", Percentage);
     
        //User is asked to input scores
        //A for loop is used to input the scores into arrays
        //An if/else statement helps in determing what to do with remaining assignments
        temp = 0;
        Percentage = 0;
        System.out.print("Enter Final Exam Score and the Total Points Possible (Example: 2 4)\n");
        System.out.print("Enter 999 if the next assignments haven't been taken/scored yet!\n");
        for(i = 0; i < 1; i++) {
            System.out.print("Final Exam " + (i + 1)+" : ");
            temp = scanner.nextDouble();
            if(temp != 999){
                finalexamScore[i] = temp;
                finalexamTotal[i] = scanner.nextDouble();
                Score4 = Score4 + finalexamScore[i];
                Total4 = Total4 + finalexamTotal[i];
            }
            else{
                incTotal4 = 20;
            }
        }
        Percentage = Score4 / Total4 * 100;
        System.out.printf("Final Exam: " + Score4 + "/" + Total4 + " = %.2f\n\n", Percentage);
        
        //Final Score is calculated by the program
        //Possible remaining assignment points are listed if available
        finalScore = Score1 + Score2 + Score3 + Score4;
        finalTotal = Total1 + Total2 + Total3 + Total4;
        Percentage = finalScore / finalTotal * 100;
        incTotal5 = incTotal1 + incTotal2 + incTotal3 + incTotal4;
        if(incTotal5 == 0){
            System.out.printf("Your Final Grade is: " + finalScore + "/" + finalTotal + " = %.2f\n", Percentage);
        }
        else{
            System.out.println("You still have upcoming assignments! (Remaining Assignments Point Breakdown Below)");
            System.out.println("Practice Problems: " + incTotal1 + " remaining possible points");
            System.out.println("Labs: " + incTotal2 + " remaining possible points");
            System.out.println("Midterms: " + incTotal3 + " remaining possible points");
            System.out.println("Final Exam: " + incTotal4 + " remaining possible points\n");
            System.out.println("You have a total of " + incTotal5 + " points remaining!\n");
            System.out.printf("Your Current Grade is: " + finalScore + "/" + finalTotal + " = %.2f\n\n", Percentage);
        }
        
        //Class Grade is listed
        if(finalScore>=90){
            System.out.print("Your Final Class Grade is: A\n");
        }
        else if(finalScore>=80 && finalScore<=89){
            System.out.print("Your Final Class Grade is: B\n");
        } 
        else if(finalScore>=70 && finalScore<=79){
            System.out.print("Your Final Class Grade is: C\n");
        }
        else if(finalScore>=60 && finalScore<=69){
            System.out.print("Your Final Class Grade is: D\n");
        }
        else{
            System.out.print("Your Final Class Grade is: F\n");
        }
    }
}
