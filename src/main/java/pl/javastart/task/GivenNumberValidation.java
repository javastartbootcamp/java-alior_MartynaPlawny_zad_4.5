package pl.javastart.task;

import java.util.Scanner;

public class GivenNumberValidation {
    private int numberFromUser;
    private boolean isNumberFromUserValid = false;

    private boolean checkDataFromUser(int numberFromUser) {
        if (numberFromUser > 200) {
            System.out.println("Podana liczba jest za duża");
        } else if (numberFromUser < 100) {
            System.out.println("Podana liczba jest za mała");
        } else if (numberFromUser % 3 != 0) {
            System.out.println("Liczba nie jest podzielna przez 3");
        } else {
            System.out.println("Wprowadzona liczba jest ok");
            isNumberFromUserValid = true;
        }
        return isNumberFromUserValid;
    }

    public void fetchDataFromUser(Scanner scanner) {
        do {
            System.out.println("Podaj liczbę: ");
            numberFromUser = scanner.nextInt();
        } while (!checkDataFromUser(numberFromUser));
    }
}