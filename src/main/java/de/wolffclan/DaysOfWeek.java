package de.wolffclan;

public enum DaysOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static String pruefeWochentag(DaysOfWeek day) {
        switch (day) {
            case MONDAY:
                return "Montag";
            case TUESDAY:
                return "Dienstag";
            case WEDNESDAY:
                return "Mittwoch";
            case THURSDAY:
                return "Donnerstag";
            case FRIDAY:
                return "Freitag";
            case SATURDAY:
            case SUNDAY:
                return "Wochenende";
            default:
                return "";
        }
    }
}

