package week13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountingWords {
    private static final int CHUNK_SIZE = 300;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String filename = "Path";
        int totalWordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineCount = 0;
            StringBuilder chunkBuilder = new StringBuilder();

            while ((line = br.readLine()) != null) {
                lineCount++;
                chunkBuilder.append(line).append("\n");

                if (lineCount % CHUNK_SIZE == 0) {
                    String chunk = chunkBuilder.toString();
                    WordCountTask task = new WordCountTask(chunk);
                    totalWordCount += task.countWords();
                    chunkBuilder.setLength(0); // Clear the chunk builder
                }
            }

            if (chunkBuilder.length() > 0) {
                String chunk = chunkBuilder.toString();
                WordCountTask task = new WordCountTask(chunk);
                totalWordCount += task.countWords();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Total words in the file: " + totalWordCount);

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Time taken with multiple threads: " + duration + " milliseconds");
    }

    static class WordCountTask {
        private final String chunk;

        public WordCountTask(String chunk) {
            this.chunk = chunk;
        }

        public int countWords() {
            int wordCount = 0;
            String[] lines = chunk.split("\n");
            for (String line : lines) {
                String[] tokens = line.split("\\s+");
                for (String token : tokens) {
                    if (token.length() > 3) {
                        wordCount++;
                    }
                }
            }
            return wordCount;
        }
    }
}
