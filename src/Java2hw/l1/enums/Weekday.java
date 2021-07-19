package Java2hw.l1.enums;

public enum Weekday {
    Monday("Понедельник", 8),
    Tuesday("Вторник", 8),
    Wednesday("Среда", 8),
    Thursday("Четверг", 8),
    Friday("Пятница", 8),
    Saturday("Суббота", 0),
    Sunday("Воскресенье", 0);

    private String rusTitle;
    private int workHours;

    Weekday(String rusTitle, int workHours) {
        this.rusTitle = rusTitle;
        this.workHours = workHours;
    }

    public String getRusTitle() {
        return rusTitle;
    }

    public int getHours() {
        return workHours;
    }
}
