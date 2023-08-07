package fasttrackit.tema13.Curs.Exercises;

import java.lang.reflect.Array;
import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MainExercises {

    public static void main(String[] args) {

        DailyPlanner dailyPlanner = new DailyPlanner();
        dailyPlanner.addActivity(DaysOfWeek.MONDAY, "Morning Walk");
        dailyPlanner.addActivity(DaysOfWeek.MONDAY, "Lunch with Friends");
        dailyPlanner.addActivity(DaysOfWeek.MONDAY, "Coding Practice");
        dailyPlanner.addActivity(DaysOfWeek.MONDAY, "Reading Book");
        dailyPlanner.addActivity(DaysOfWeek.MONDAY, "Movie Night");

        dailyPlanner.addActivity(DaysOfWeek.TUESDAY, "Workout");
        dailyPlanner.addActivity(DaysOfWeek.TUESDAY, "Shopping");
        dailyPlanner.addActivity(DaysOfWeek.TUESDAY, "Cooking Class");
        dailyPlanner.addActivity(DaysOfWeek.TUESDAY, "Gardening");
        dailyPlanner.addActivity(DaysOfWeek.TUESDAY, "Family Dinner");

        dailyPlanner.addActivity(DaysOfWeek.WEDNESDAY, "Study");
        dailyPlanner.addActivity(DaysOfWeek.WEDNESDAY, "Coding Challenge");
        dailyPlanner.addActivity(DaysOfWeek.WEDNESDAY, "Music Practice");
        dailyPlanner.addActivity(DaysOfWeek.WEDNESDAY, "Volunteer Work");
        dailyPlanner.addActivity(DaysOfWeek.WEDNESDAY, "Board Games");

        dailyPlanner.addActivity(DaysOfWeek.THURSDAY, "Yoga");
        dailyPlanner.addActivity(DaysOfWeek.THURSDAY, "Reading News");
        dailyPlanner.addActivity(DaysOfWeek.THURSDAY, "Art Workshop");
        dailyPlanner.addActivity(DaysOfWeek.THURSDAY, "Picnic");
        dailyPlanner.addActivity(DaysOfWeek.THURSDAY, "Movie Marathon");

        dailyPlanner.addActivity(DaysOfWeek.FRIDAY, "Swimming");
        dailyPlanner.addActivity(DaysOfWeek.FRIDAY, "Visit Museum");
        dailyPlanner.addActivity(DaysOfWeek.FRIDAY, "Cookout");
        dailyPlanner.addActivity(DaysOfWeek.FRIDAY, "Game Night");
        dailyPlanner.addActivity(DaysOfWeek.FRIDAY, "Date Night");

        dailyPlanner.addActivity(DaysOfWeek.SATURDAY, "Hiking");
        dailyPlanner.addActivity(DaysOfWeek.SATURDAY, "Shopping");
        dailyPlanner.addActivity(DaysOfWeek.SATURDAY, "Beach Day");
        dailyPlanner.addActivity(DaysOfWeek.SATURDAY, "Concert");
        dailyPlanner.addActivity(DaysOfWeek.SATURDAY, "Dinner Party");

        dailyPlanner.addActivity(DaysOfWeek.SUNDAY, "Relaxing");
        dailyPlanner.addActivity(DaysOfWeek.SUNDAY, "Gym Session");
        dailyPlanner.addActivity(DaysOfWeek.SUNDAY, "Reading Novel");
        dailyPlanner.addActivity(DaysOfWeek.SUNDAY, "Baking");
        dailyPlanner.addActivity(DaysOfWeek.SUNDAY, "Family Time");

        System.out.println(dailyPlanner.getActivities(DaysOfWeek.SUNDAY));
        dailyPlanner.addActivity(DaysOfWeek.SUNDAY, "Iesim la date");
        System.out.println(dailyPlanner.getActivities(DaysOfWeek.SUNDAY));
        dailyPlanner.removeActivity(DaysOfWeek.SUNDAY, "Iesim la date");
        System.out.println(dailyPlanner.getActivities(DaysOfWeek.SUNDAY));

        Map<DaysOfWeek, List<String>> daysMap = dailyPlanner.endPlanning();
        System.out.println(daysMap);


    }
}
