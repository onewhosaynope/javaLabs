import java.util.Scanner;
import java.util.Stack;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = "Correct";
        boolean stat = true;
        Stack<Character> stack = new Stack<>();
        stack.push(' ');
        System.out.print("Enter string: ");
        StringBuilder str = new StringBuilder(scan.nextLine());

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '(':
                case '<':
                case '[':
                case '{':
                    stack.push(str.charAt(i));
                    break;
                case ')':
                    if ((stack.peek() != '(') || stack.empty()) {
                        stat = false;
                        break;
                    } else
                        stack.pop();
                    break;
                case ']':
                    if ((stack.peek() != '[') || stack.empty()) {
                        stat = false;
                        break;
                    } else
                        stack.pop();
                    break;
                case '}':
                    if ((stack.peek() != '{') || stack.empty()) {
                        stat = false;
                        break;
                    } else
                        stack.pop();
                    break;
                case '>':
                    if ((stack.peek() != '<') || stack.empty()) {
                        stat = false;
                        break;
                    } else
                        stack.pop();
                    break;
            }
            if (!stat) {
                result = "Incorrect";
                break;
            }
        }
        stack.pop();
        if (!stack.empty())
            result = "Incorrect";
        System.out.print(result);
        WriteString(result);
        scan.close();
    }

    public static void WriteString(String text) {
        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("filename.txt"), "utf-8"));
            writer.write(text);
        } catch (IOException ex) {
            // Report
        } finally {
            try {
                writer.close();
            } catch (Exception ex) {
                /* ignore */
            }
        }
    }
}