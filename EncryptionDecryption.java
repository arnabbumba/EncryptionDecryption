import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EncryptionDecryption {
    public static void main(String[] args) throws IOException {
        String option;
        do {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            option = getInputMessage("\nPress e/E for Encryption , d/D for Decryption and x/X for exit:", br);

            switch (option) {
                case "e" -> {
                    String message = getInputMessage("Enter your message:", br);
                    System.out.println("Encryption selected");
                    encryption(message);
                }
                case "d" -> {
                    String message = getInputMessage("Enter your message:", br);
                    System.out.println("Decryption selected");
                    decryption(message);
                }
                case "x" -> {
                    System.exit(0);
                }
                default -> System.out.println("Invalid option");
            }
        } while (true);
    }

    private static String getInputMessage(String s, BufferedReader br) throws IOException {
        System.out.print(s);
        String message = br.readLine().toLowerCase();
        return message;
    }

    private static void encryption(String message) {
        String[] words = message.split("\\s+");
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (i == 0 && Character.isLetterOrDigit(ch)) {
                    System.out.print(ch + "itt");
                } else {
                    System.out.print(ch);
                }
            }
            System.out.print(" ");
        }
    }

    private static void decryption(String message) {
        String[] words = message.split("\\s+");
        for (String word : words) {
            word = word.replaceFirst("itt", "");
            System.out.print(word);
            System.out.print(" ");
        }
    }
}