public class ConverterTest {

public static void main(String[] args) {
    showWeekCalendar();
}

public static void showWeekCalendar(){
    for(int i=1; i<=7; i++){
        System.out.println(dayString(i));
    }
}

public static String dayString(int dayIndex){
    String dayName = CalandarConverter.convertDayToString(dayIndex);
    return dayIndex + " dzień tygodnia to " + dayName;
    }
}
