import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();
        if (StringUtils.isNumeric(userInput)){
            System.out.printf("%s is a number!%n",userInput);
        } else {
            System.out.printf("%s is not a number!%n",userInput);
            System.out.printf("Flipped case: %s%n",StringUtils.swapCase(userInput));
            System.out.printf("Reversed: %s%n",StringUtils.reverse(userInput));
        }
    }
}
