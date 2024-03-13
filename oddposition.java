public class oddposition {
    public static void main(String[] args) {
        String text = "type here to search";
        printOddPositionChars(text);
    }

    public static void printOddPositionChars(String text) {
        for (int i = 0; i < text.length(); i++) {
            // Skip white spaces
            if (text.charAt(i) == ' ') {
                continue;
            }
            // Check if the position is odd
            if (i % 2 != 0) {
                System.out.print(text.charAt(i));
            }
        }
    }
}