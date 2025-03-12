package javaPrograms;

public class CountWordsInString {
    public static void main(String[] args) {
        String s = "you have done to many tasks";

        // Trim extra spaces and split words by spaces
        String[] words = s.split(" ");

        // Print the word count
        System.out.println("Number of words: " + words.length);
    }
}
