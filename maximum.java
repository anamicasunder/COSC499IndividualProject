import java.util.Arrays;

public class maximum {
    public static void main(String args[])
	{
        int[] array = {3, 15, 4 , 9, 2};
		System.out.println("Array before sorting");
		for (int number : array) {
			System.out.print(number + " ");
		}
		
		System.out.println("\nThe max value is: " + getMax(array));

    }

    public static int getMax(int[] num){
        int maxValue = num[0];
        for(int x=1; x < num.length; x++){
          if(num[x] > maxValue){
            maxValue = num[x];
          }
        }
        return maxValue;
      }
}