import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int command;

        do {
            System.out.println("Добро пожаловать в игру. Сделайте свой выбор нажав необходимую цифру:");
            System.out.println("1: Старт игры");
            System.out.println("2: Опции");
            System.out.println("3: Создатель");
            System.out.println("4: Выход из игры");

            command = scanner.nextInt();
            switch (command) {
                case 1:
                    startNeGame();
                    break;
                case 2:
                    openOptionsMenu();
                    break;
                case 3:
                    showCreateds();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Команда не распознана. Нажмите необходимую кнопку.");

            }


        } while (command != 4);
    }

    private static void showCreateds() {
        System.out.println("\nСоздал Сергей Костенко \n" +
                "version 1.0\n" +
                "от 16.02.2022\n");
    }

    private static void openOptionsMenu() {
    }

    private static void startNeGame() {
    }
}
