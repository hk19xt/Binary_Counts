package Binary_Count;

public class Binary_Count {
  public int[] Binary_Count(int userInput){
    int[] output = new int[userInput+1];
    int initial = 0;
    output[0] = initial;

    for(int position = initial + 1; position <= userInput; position++){
        output[position] = output[position & (position-1)] + 1;
    }
    return output;
    }
}
