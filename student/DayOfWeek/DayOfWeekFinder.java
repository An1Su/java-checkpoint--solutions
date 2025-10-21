package DayOfWeek;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;



public class DayOfWeekFinder {
    public String findNextDayOfWeek(String startDate, String dayOfWeek){
       try {
           LocalDate date = LocalDate.parse(startDate);
           DayOfWeek targetDay = DayOfWeek.valueOf(dayOfWeek.toUpperCase());
           DayOfWeek currentDay = date.getDayOfWeek();
           int daysToAdd = (targetDay.getValue() - currentDay.getValue() + 7)%7;
           daysToAdd = daysToAdd == 0? 7: daysToAdd;
           LocalDate targetDate =  date.plusDays(daysToAdd);
           return targetDate.toString();
       } catch (DateTimeParseException e){
           return "Error";
       }
    }
}
