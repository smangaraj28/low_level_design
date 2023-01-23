package lld.design.designPrinciple.KISS;

public class DayService implements IDayService {
    @Override
    public String getDayOfTheWeekV1(int day) {
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednsday";
            case 4 -> "Thrusday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            case 10 -> "bla";
            default -> throw new RuntimeException("day must be in range of 1 to 7");
        };
    }

    @Override
    public String getDayOfThWeekV2(int day) {
        if ((day < 1) || (day > 7)) {
            throw new RuntimeException("day must be in range of 1 to 7");
        }
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return days[day - 1];
    }

}
