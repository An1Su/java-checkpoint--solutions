package MonthlyPeriod;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class MonthlyPeriod {
    public String calculatePeriod(String startDate, String endDate) {
        try {
            LocalDate start = LocalDate.parse(startDate);
            LocalDate end = LocalDate.parse(endDate);
            Period period = Period.between(start, end);

            int years = Math.abs(period.getYears());
            int months = Math.abs(period.getMonths());

            if (years == 0 && months == 0) {
                return "";
            }

            StringBuilder result = new StringBuilder();

            if (years > 0) {
                result.append(years).append(" ").append(years == 1 ? "year" : "years");
            }

            if (months > 0) {
                if (years > 0) result.append(" and ");
                result.append(months).append(" ").append(months == 1 ? "month" : "months");
            }

            return result.toString();
        } catch (DateTimeParseException | NullPointerException e) {
            return "Error";
        }
    }
}