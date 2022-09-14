import java.util.Arrays;

class Project {
	public static void main(String args[])
	{
		int[] array = {3, 15, 4 , 9, 2};
		System.out.println("Array before sorting");
		for (int number : array) {
			System.out.print(number + " ");
		}
		Arrays.sort(array);
		System.out.println("\nThe sorted array is: ");
		for (int number : array) {
			System.out.print(number + " ");
		}
	}
}
