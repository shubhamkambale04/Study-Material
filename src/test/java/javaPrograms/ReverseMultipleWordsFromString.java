package javaPrograms;

import java.util.ArrayList;
import java.util.List;

public class ReverseMultipleWordsFromString {
    public static void main(String[] args) {
        String s = "shubham kambale from pune maharashtra";
        // Split the sentence into words
        String[] words = s.split(" ");
        // Words to be reversed
        List<String> wordsToReverse = new ArrayList<>();
        wordsToReverse.add("kambale");
        wordsToReverse.add("maharashtra");
        
        // Approach 1
        
        // Store reversed words in a List
        List<String> reversedWords = new ArrayList<>();
        
        // Reverse the words and store them
        for (String word : wordsToReverse) {
            String rev = "";
            for (int i = 0; i < word.length(); i++) {
                rev = word.charAt(i) + rev;
            }
            System.out.println(rev);
            reversedWords.add(rev); // Store reversed word
        }
        
        // Replace the words in the sentence
        for (int i = 0; i < words.length; i++) {
            if (wordsToReverse.contains(words[i])) {
                int index = wordsToReverse.indexOf(words[i]);
                words[i] = reversedWords.get(index); // Replace with reversed version
            }
        }
        
        // Approach 2
        
        // Replace the words in the sentence by reversing them directly
        for (int i = 0; i < words.length; i++) {
            if (wordsToReverse.contains(words[i])) {
                words[i] = new StringBuilder(words[i]).reverse().toString(); // Reverse and replace
            }
        }
        // Join words back into a sentence
        String result = String.join(" ", words);
        
        // Print the final output
        System.out.println(result);
    }
}
