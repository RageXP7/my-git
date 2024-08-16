package ustproblemss;

public class ReverseString {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        String str = "i love programming very much";
        char[] charArray = str.toCharArray();
        int n = charArray.length;
        reverse(charArray, 0, n - 1);

        int start = 0;
        for (int i = 0; i <= n; i++) {
            if (i == n || charArray[i] == ' ') {
                reverse(charArray, start, i - 1);
                start = i + 1;
            }
        }

        for (char c : charArray) {
            System.out.print(c);
        }
    }

    public static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
