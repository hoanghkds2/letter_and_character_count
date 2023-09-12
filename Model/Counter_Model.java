// Package "model"
package model;

import java.util.HashMap;
import java.util.Map;

public class Counter_Model {

    private Map<Character, Integer> charCounter = new HashMap<>();
    private Map<String, Integer> wordCounter = new HashMap<>();

    public void analyze(String content) {
        for (char ch : content.toCharArray()) {
            if (Character.isSpaceChar(ch)) continue;
            charCounter.put(ch, charCounter.getOrDefault(ch, 0) + 1);
        }
        
        String[] words = content.split("\\s+");
        for (String word : words) {
            wordCounter.put(word, wordCounter.getOrDefault(word, 0) + 1);
        }
    }

    public Map<Character, Integer> getCharCounter() {
        return charCounter;
    }

    public Map<String, Integer> getWordCounter() {
        return wordCounter;
    }
}