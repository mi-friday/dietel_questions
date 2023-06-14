package chapterTwo;

public class IntegerValueOfACharacter {
    public static void main(String[] args) {
        char[] characters = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/', ' '};

        for (char c : characters) {
            int intValue = (int) c;
            System.out.println("Character: " + c + ", Integer Value: " + intValue);
        }
    }
}
