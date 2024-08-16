package ustproblemss;

public class Lastrepeatingchar {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        String str = "language";
        char[] charArray = str.toCharArray();
        char result = '\0';

        for (int i = charArray.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (charArray[i] == charArray[j]) {
                    result = charArray[i];
                    break;
                }
            }
            if (result != '\0') {
                break;
            }
        }

        if (result != '\0') {
            System.out.println(result);
        } else {
            System.out.println("No repeating character found.");
        }
    }
}
