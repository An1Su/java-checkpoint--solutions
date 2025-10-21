package AgeFinder;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class AgeFinder {
    public int calculateAge(String date) {
       try {
           LocalDate dateOfBirth = LocalDate.parse(date);
           if (dateOfBirth.isAfter(LocalDate.now())) return -1;
           Period age = Period.between(dateOfBirth, LocalDate.now());

           return age.getYears();
       } catch (DateTimeParseException e) {
           return -1;
       }
    }
}
