package ustproblemss;

public class HighestFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr  = {3,4,5,2,3,4,6,7,8,5,3,6,7,7,8,3};
		int maxFrequency = 0;
		int mostFrequentElement = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					}
				}
			if (maxFrequency < count) {
				maxFrequency = count;
				mostFrequentElement = arr[i];
				}
		}
		System.out.println(mostFrequentElement);
	}

}
