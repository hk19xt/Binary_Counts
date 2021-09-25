package Binary_Count;

/*This class is the main class. The user can change the input value in the hardcoded line.
 After compiling the program, the output of the array will be seen in the console. 
 The implementation is explained in the Binary_Count class.
 
 Author: Hyejin Kim
 Date: 9/24/2021 */

public class Main {
    public static void main(String[] args){
         Binary_Count BC = new Binary_Count();
         int userInput = 2; //The user can change the input value here.
         System.out.println("The output array will be: " + Arrays.toString(BC.Binary_Count(userInput)));

    }
}//Main
