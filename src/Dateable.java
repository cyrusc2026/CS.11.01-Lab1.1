import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your age:");
            int age = scanner.nextInt();
                    int youngestage = age/2+7;
        System.out.println(age + "-year olds should date somebody who is at least " + youngestage + " years old.");


    }
}
