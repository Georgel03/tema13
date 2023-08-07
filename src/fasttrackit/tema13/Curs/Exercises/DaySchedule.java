package fasttrackit.tema13.Curs.Exercises;

import java.util.ArrayList;
import java.util.List;

public class DaySchedule {

    private DaysOfWeek days;

    private List<String> activity;

    public DaySchedule(DaysOfWeek days, List<String> activity) {
        this.days = days;
        this.activity = activity;
    }

    public DaysOfWeek getDays() {
        return this.days;
    }

    public List<String> getActivity() {
        return this.activity;
    }

}
