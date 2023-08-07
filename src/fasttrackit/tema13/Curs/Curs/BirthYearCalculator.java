package fasttrackit.tema13.Curs.Curs;

import java.time.Year;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BirthYearCalculator {

    private int age;

    public static Scanner console = new Scanner(System.in);

    public BirthYearCalculator(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public static int calculateDateOfBirth(int age) {

        int year = Year.now().getValue();
        int yearOfBirth = 0;

        try {
            while (age < 0) {
                System.out.print("Valoare imposibila! Reincearca:");
                age = console.nextInt();
            }
            yearOfBirth = year - age;

        } catch (InputMismatchException exception) {
            String message = "Valoare invalida!";
            throw new InputMismatchException(message);
        }

        return yearOfBirth;
    }

}
