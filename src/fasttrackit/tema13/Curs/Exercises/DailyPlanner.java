package fasttrackit.tema13.Curs.Exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DailyPlanner {

    List<DaySchedule> dayScheduleList;

    public DailyPlanner() {
        this.dayScheduleList = new ArrayList<>();
    }

    public List<DaySchedule> getDayScheduleList() {
        return this.dayScheduleList;
    }

    class NoActivityException extends RuntimeException {
        public NoActivityException(String message) {
            super(message);
        }
    }
    class NoActivitiesForDayException extends RuntimeException {

        public NoActivitiesForDayException(String message) {
            super(message);
        }
    }

    public void addActivity(DaysOfWeek day, String activity) {

        if (activity == null) {
            throw new NoActivityException("Activity cannot be null.");
        }

        for (DaySchedule schedule : dayScheduleList) {
            if (schedule.getDays() == day) {
                 schedule.getActivity().add(activity);
                 return;
            }
        }

        List<String> activies = new ArrayList<>();
        activies.add(activity);
        DaySchedule newDaySchedule = new DaySchedule(day, activies);
        dayScheduleList.add(newDaySchedule);

    }

    public void removeActivity(DaysOfWeek day, String activity) {


        for (DaySchedule daySchedule : dayScheduleList) {
            if (daySchedule.getDays() == day) {
                  List<String> activies = daySchedule.getActivity();
                    if (!activies.contains(activity)) {
                        throw new NoActivityException("Activity not found for the given day.");
                    }
                    activies.remove(activity);
                    return;
                }
        }

        throw new NoActivityException("Day not found.");
    }



    public List<String> getActivities(DaysOfWeek day) {

        List<String> myList = new ArrayList<>();
        for (DaySchedule daySchedule : dayScheduleList) {
            if (daySchedule.getDays().equals(day)) {
               myList = daySchedule.getActivity();
               break;
            }
        }

        return myList;
    }

    public Map<DaysOfWeek, List<String>> endPlanning() throws NoActivitiesForDayException {

        Map<DaysOfWeek, List<String>> myMap = new HashMap<>();

        for (DaysOfWeek day : DaysOfWeek.values()) {

            List<String> myList = getActivities(day);
            if (myList == null) {
                throw new NoActivitiesForDayException("Sorry! No activities for this day!");
            }
            else {
                myMap.put(day, myList);
            }
        }

        return myMap;
    }

}
