public class CalandarConverter {

    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY= 6;
    public static final int SUNDAY = 7;

    public static String convertDayToString(int dayNumber){
        switch(dayNumber){
            case MONDAY:
                return "Poniedziałek";
            case TUESDAY:
                return "Wtorek";
            case WEDNESDAY:
                return "Sroda";
            case THURSDAY:
                return "Czwartek";
            case FRIDAY:
                return "Piątek";
            case SATURDAY:
                return "Sobota";
            case SUNDAY:
                return "Niedziela";
            default:
                return "Nieprawidłowy dzień";
        }
    }
}

