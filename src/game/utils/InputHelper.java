package game.utils;

import game.exception.InvalidUserInputException;
import game.exception.UserExitException;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputHelper {

    private Pattern pattern = Pattern.compile("\\d+\\.\\d+");

    public int[] getUserInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Input coordinates >>>");

                String input = scanner.next();
                validateInput(input);
                int x = Integer.parseInt(input.split("\\.")[0]);
                int y = Integer.parseInt(input.split("\\.")[0]);
                return new int[]{x, y};
            } catch (InvalidUserInputException ex) {
                System.out.println("Coordinates must be like x.y format");
            } catch (UserExitException ex) {
                throw new RuntimeException("STOP THE GAME");
            }
        }
    }

    private void validateInput(String userInput) {
        if (userInput.equals("exit")) {
            throw new UserExitException("exit game");
        }

        if (!pattern.matcher(userInput).matches()) {
            throw new InvalidUserInputException(userInput);
        }
        System.out.println("Input is OK");
    }
}
