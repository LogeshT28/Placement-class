package MarqueeTraining;

import java.util.Scanner;

public class WorkerBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pagesFirstBook = scanner.nextInt();
        int linesPerPageFirstBook = scanner.nextInt();
        int pagesSecondBook = scanner.nextInt();
        int linesPerPageSecondBook = scanner.nextInt();
        int readingSpeed = scanner.nextInt();
        int writingSpeed = scanner.nextInt();
        int timeInSeconds = scanner.nextInt();

        int totalLinesFirstBook = pagesFirstBook * linesPerPageFirstBook;
        int totalLinesSecondBook = pagesSecondBook * linesPerPageSecondBook;

        if (timeInSeconds * readingSpeed < totalLinesFirstBook) {
            int linesRead = timeInSeconds * readingSpeed;
            int currentPage = linesRead / linesPerPageFirstBook;
            int currentLine = linesRead % linesPerPageFirstBook;
            System.out.println("Read " + currentPage + " " + currentLine);
        } else {
            int remainingTime = timeInSeconds - (totalLinesFirstBook + readingSpeed - 1) / readingSpeed;
            int linesWritten = remainingTime * writingSpeed;
            int currentPage = linesWritten / linesPerPageSecondBook ;
            int currentLine = linesWritten % linesPerPageSecondBook;
            System.out.println("Write " + currentPage + " " + currentLine);
        }


    }
}
