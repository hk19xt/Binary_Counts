package Binary_Count;

/*This class is the implementation class. The input value is inserted by user in the main class.
  In order to count the number of 1 in the binary format of each array element, the & operation will be used.*/


public class Binary_Count {
  
  public int[] Binary_Count(int userInput){
    
    int[] output = new int[userInput+1];
    int initial = 0;
    output[0] = initial; // 0 is always 0 in the binary format.

    for(int position = initial + 1; position <= userInput; position++){
      
        //Each element is calculated based on & operation.
        //For example, when the element in the array is 1, then the number of 1 in the 1 in the binary format is 1.
        //Because, output[1] = output[1 & 0] + 1 => (01)&(00) = 0  + 1 => 1
        //In another example, when the element in the array is 2, the the number of 1 in the 2 in the binary format is 1.
        //Because, output[2] = output[2 & 1] +1 => (10)&(01) = 0 + 1 => 1
        output[position] = output[position & (position-1)] + 1; 
    }
    return output;
    }
}//Binary_Count
