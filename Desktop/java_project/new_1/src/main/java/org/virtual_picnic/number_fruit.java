package org.virtual_picnic;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class number_fruit {
    public static void main(String[] args) throws IOException {
        count_word();
        Long_word();
        word_frequency();
    }

    private static void count_word() throws IOException {
        String filePath = ("src/main/java/org/virtual_picnic/input.txt");
        HashMap<String, String> map = new HashMap<>();
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(" ", 2);

            if (parts.length >= 2) {
                String key = parts[0];
                String value = parts[1];
                map.put(key, value);
            } else {
                System.out.println("ignor line: " + line);
            }
        }
        for (String key : map.keySet())
            System.out.println(key + " " + map.get(key));


        Stream<String> lines = Files.lines(Paths.get(filePath));
        long count = lines
                .flatMap(s -> Stream.of(s.split(" "))
                        .filter(t -> !t.isEmpty()))
                .count();
        System.out.println("количество слов = " + count);
    }

    private static void Long_word() throws IOException {
        String longestWord = " ";
        String current;
        Scanner scan = new Scanner(new File("src/main/java/org/virtual_picnic/input.txt"));
        while (scan.hasNext()) {
            current = scan.next();
            if ((current.length() > longestWord.length()) && (!current.matches(".*\\d.*"))) {
                longestWord = current;
            }
        }
        System.out.println("Самое длинное слово это " + longestWord);
        longestWord.replaceAll("[^a-zA-Z ]", "").split("\\s+");

    }

    private static void word_frequency() throws FileNotFoundException {
        File file = new File("src/main/java/org/virtual_picnic/input.txt");
        Scanner scanner = new Scanner(file);
        String Words = " ";
        HashMap<String, Integer> wordFrequency = new HashMap<>();
        while (scanner.hasNext()) {
            String word = scanner.next();

            if (word.length() > Words.length()) {
                Words = word;
            }

            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
        System.out.println("Частота слов:");
        for (String word : wordFrequency.keySet()) {
            System.out.println(word + " = " + wordFrequency.get(word));
        }
        scanner.close();
    }
}












