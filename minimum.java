import java.util.Arrays;

public class minimum {
    public static void main(String args[])
	{
        int[] array = {3, 15, 4 , 9, 2};
		System.out.println("Array before sorting");
		for (int number : array) {
			System.out.print(number + " ");
		}
		
		System.out.println("\nThe min value is: " + getMin(array));

    }

		public static int getMin(int[] numbers){
            int min = numbers[0];
            for(int x=1; x<numbers.length; x++){
              if(numbers[x] < min){
                min = numbers[x];
              }
            }
            return min;
          }
}