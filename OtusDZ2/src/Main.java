import data.CommandsData;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Допустимые команды: ADD, LIST, EXIT");
            String commandStr = scanner.next();

            boolean isCommandExist = false;
            for (CommandsData commandsData : CommandsData.values()) {
                if (commandsData.name().equals(commandStr.toUpperCase(Locale.ROOT).trim())) {
                    isCommandExist = true;
                    break;
                }
            }
            if (!isCommandExist) {
                System.out.println("Неверная команда");
                continue;
        }
            System.out.println("Думаем");
        }
    }
}
