package S_Stack;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        Stack<String> s = new Stack<>();
        s.push("Bolzano");
        s.push("Caserta");
        System.out.println(s.pop());
        System.out.println(s);

        Stack<String> stack=new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci le stringhe:");
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            stack.push(input);
            input = scanner.nextLine();
        }
        scanner.close();

        writeReversedSentencesToFile(stack);
        System.out.println(stack);
    }
}    