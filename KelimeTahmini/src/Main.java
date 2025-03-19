import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        List<String> wordList = new ArrayList<>();

        try {
            File file = new File("D:\\dosya.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] wordsInLine = line.split("\\s+");

                for (int i = 0; i < wordsInLine.length; i++) {
                    wordList.add(wordsInLine[i]);
                }
            }

            fileScanner.close();

            if (wordList.size() == 0) {
                System.out.println("Dosyada hiçbir kelime bulunamadı.");
                return;
            }
        } catch (Exception e) {
            System.out.println("Dosya bulunamadı: " + e.getMessage());
            return;
        }

        // Rastgele bir kelime seçme
        int randomIndex = random.nextInt(wordList.size());
        String selectedWord = wordList.get(randomIndex).toLowerCase();

        int remainingLives = selectedWord.length();
        int[] guessedLetters = new int[selectedWord.length()];

        for (int i = 0; i < selectedWord.length(); i++) {
            guessedLetters[i] = 0;
        }

        while (remainingLives != 0) {
            System.out.println("");
            System.out.println("Bir harf tahmin edin");
            System.out.println(remainingLives + " canınız var");

            String guessedLetter = scanner.next();
            if (guessedLetter.length() != 1) {
                System.out.println("Lütfen sadece bir harf girin.");
                continue;
            }

            int correctGuessCount = 0;
            for (int i = 0; i < selectedWord.length(); i++) {
                char letter = selectedWord.charAt(i);
                if (guessedLetter.charAt(0) == letter) {
                    guessedLetters[i] = 1;
                    correctGuessCount++;
                }
            }

            for (int i = 0; i < selectedWord.length(); i++) {
                if (guessedLetters[i] == 0) System.out.print("* ");
                else System.out.print(selectedWord.charAt(i) + " ");
            }

            System.out.println(" ");

            if (correctGuessCount == 0) {
                remainingLives--;
                System.out.println("Yanlış tahmin ettiniz");
            }

            if (remainingLives == 0) {
                System.out.println("Oyun bitti. Kelime: " + selectedWord);
            }

            int guessedLetterCount = 0;
            for (int i = 0; i < selectedWord.length(); i++) {
                if (guessedLetters[i] == 1) guessedLetterCount++;
            }

            if (guessedLetterCount == selectedWord.length()) {
                System.out.println("Tebrikler tüm kelimeyi buldunuz: " + selectedWord);
                break;
            }
        }

        scanner.close();
    }
}
