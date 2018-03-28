package lesson03_con_stat.practical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class WeekDay {
    BufferedReader reader=null;
    void printDay(){
        if (reader == null) {
            reader = new BufferedReader(new InputStreamReader(System.in));
        }
        try {
            String s = reader.readLine();
            if (!s.matches("\\d+")) {System.out.println("Invalid data");return;}
            int i = Integer.parseInt(s);
            if(i<1||i>7){
                System.out.println("Not a day of the week"); return;
            }
                System.out.println(DaysEN.getDay(i));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
public static void main(String[] args) {
    WeekDay weekDay = new WeekDay();
    weekDay.printDay();
}
}

enum DaysEN {

    MONDAY("Monday, Понеділок, Montag"), TUESDAY("Tuesday, Вівторок, Dienstag"), WEDNESDAY("Wednesday, Середа, Mittwoch"),
    THURSDAY("Thursday, Четвер, Donnerstag"), FRIDAY("Friday, П'ятниця, Freitag"),
    SATURDAY("Saturday, Субота, Samstag"), SUNDAY("Sunday, Неділя, Sonntag"),;
    final String s;

    DaysEN(String name) {
        this.s = name;
    }

    private static final List<DaysEN> list = Arrays.asList(DaysEN.values());

    public static String getDay(int i) {
        return list.get(i - 1).s;
    }
}
