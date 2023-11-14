package pl.javastart.task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GivenNumberValidation fetchDataFromUser = new GivenNumberValidation();
        Scanner scanner = new Scanner(System.in);

        fetchDataFromUser.fetchDataFromUser(scanner);
    }
}
