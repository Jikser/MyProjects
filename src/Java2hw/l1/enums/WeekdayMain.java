package Java2hw.l1.enums;


public class WeekdayMain {
    static int workingWeekHours = 40;

    public static void main(String[] args) {
        for (Weekday day : Weekday.values()) {
            getHoursToWeekend(day);
        }
    }

    public static void getHoursToWeekend(Weekday day) {
        int hour = workingWeekHours - (day.ordinal() * day.getHours());
        if (day.ordinal() < 5) {
            System.out.println(day.getRusTitle() + " - часов до конца рабочей недели: " + hour);
        }else {
            System.out.println(day.getRusTitle() + " - выходной!");
        }
    }
}
