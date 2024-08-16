package ustproblemss;

public class SecondHighestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int[] array = {12, 34, 56, 78, 90, 23, 45, 67, 20, 10};
		        int max = array[0];
		        int secondMax = Integer.MIN_VALUE;

		        for (int i = 1; i < array.length; i++) {
		            if (array[i] > max) {
		                secondMax = max;
		                max = array[i];
		            } else if (array[i] > secondMax && array[i] != max) {
		                secondMax = array[i];
		    }
		}

		        System.out.println("Second highest value in the array is: " + secondMax);
	}
}

	


