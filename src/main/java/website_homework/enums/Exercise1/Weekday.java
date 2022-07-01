package website_homework.enums.Exercise1;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    boolean isWeekDay(){
        boolean result = switch (Weekday.this){
            case SATURDAY -> result = false;
            case SUNDAY -> result = false;
            default -> result = true;
        };
        return result;
    }

    boolean isHoliday(){
        boolean result = switch (Weekday.this){
            case SATURDAY -> result = true;
            case SUNDAY -> result = true;
            default -> result = false;
        };
        return result;
    }

    boolean whichIsGreater(Weekday day){
        return this.compareTo(day) > 0;
    }
}
