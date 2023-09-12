package view;

import controller.Counter_Controller;
import model.Counter_Model;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your content: ");
        String content = scanner.nextLine();

        Counter_Model model = new Counter_Model();
        Counter_Controller controller = new Counter_Controller(model);

        controller.analyzeContent(content);

        displayResults(model.getCharCounter(), model.getWordCounter());
    }

    public static void displayResults(Map<Character, Integer> charCounter, Map<String, Integer> wordCounter) {
        System.out.println(wordCounter);
        System.out.println(charCounter);
       
    }
}