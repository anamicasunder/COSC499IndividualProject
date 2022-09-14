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

		public static int getMin(int[] num){
            int min = num[0];
            for(int x=1; x<num.length; x++){
              if(num[x] < min){
                min = num[x];
              }
            }
            return min;
          }
}