package fasttrackit.tema13.Curs.Exercises;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class CommLineApp {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;
        int day;
        String activity = new String();

        DailyPlanner dailyPlanner = new DailyPlanner();


        do {
                Menu();
                choice = scanner.nextInt();
                System.out.println();

                switch (choice) {

                    case 1 : {
                        System.out.print("activity: ");
                        System.out.println(scanner.nextLine());
                        activity = scanner.nextLine();
                        System.out.print("day: ");
                        day = scanner.nextInt();
                        dailyPlanner.addActivity(getDay(day), activity);
                        break;
                    }

                    case 2 : {

                        System.out.print("activity: ");
                        System.out.println(scanner.nextLine());
                        activity = scanner.nextLine();
                        System.out.println("day: ");
                        day = scanner.nextInt();
                        dailyPlanner.removeActivity(getDay(day), activity);
                        break;
                    }

                    case 3 : {

                        System.out.println(dailyPlanner.getActivities(DaysOfWeek.MONDAY));
                        System.out.println(dailyPlanner.getActivities(DaysOfWeek.TUESDAY));
                        System.out.println(dailyPlanner.getActivities(DaysOfWeek.WEDNESDAY));
                        System.out.println(dailyPlanner.getActivities(DaysOfWeek.THURSDAY));
                        System.out.println(dailyPlanner.getActivities(DaysOfWeek.FRIDAY));
                        System.out.println(dailyPlanner.getActivities(DaysOfWeek.SUNDAY));
                        System.out.println(dailyPlanner.getActivities(DaysOfWeek.SATURDAY));
                        break;
                    }

                    case 4 : {

                        Map<DaysOfWeek, List<String>> daysMap = dailyPlanner.endPlanning();
                        System.out.println(daysMap);
                    }

                    case 5 : {

                        System.out.println("Good Bye!");
                        break;
                    }

                    default: {

                        System.out.println("Invalid choice!");
                    }
                }

        } while (choice != 5);

    }

    public static void Menu() {

        System.out.println("1) Add Activity");
        System.out.println("2) Remove Activity");
        System.out.println("3) List All Activities");
        System.out.println("4) End Planning");
        System.out.println("5) Quit");
        System.out.print("Your choice: ");
    }

    public static DaysOfWeek getDay(int day) {

        switch (day) {

            case 1 : {
                return DaysOfWeek.MONDAY;

            }

            case 2 : {
                return DaysOfWeek.TUESDAY;

            }

            case 3 : {
                return DaysOfWeek.WEDNESDAY;

            }
            case 4 : {
                return DaysOfWeek.THURSDAY;
            }
            case 5 : {
                return DaysOfWeek.FRIDAY;

            }
            case 6 : {
                return DaysOfWeek.SUNDAY;

            }
            case 7 : {
                return DaysOfWeek.SATURDAY;

            }
            default : {
                return null;
            }
        }
    }
}
