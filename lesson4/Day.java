package lesson4;

public enum Day {
    MONDAY("Понеділок", "Monday", "Понедельник"), TUESDAY("Вівторок", "Tuesday", "Вторник"),
    WEDNESDAY("Середа", "Wednesday", "Среда"), THURSDAY("Червер", "Thursday", "Четверг"),
    FRIDAY("П'ятниця", "Friday", "Пятница"), SATURDAY("Субота", "Saturday", "Суббота"),
    SUNDAY("Неділя", "Sunday", "Воскресение");

    private String uk;
    private String en;
    private String ru;

    Day(String uk, String en, String ru) {
        this.uk = uk;
        this.en = en;
        this.ru = ru;
    }

    public String getUk() {
        return uk;
    }

    public String getEn() {
        return en;
    }

    public String getRu() {
        return ru;
    }

    @Override
    public String toString() {
        return "Day{" +
                "uk='" + uk + '\'' +
                ", en='" + en + '\'' +
                ", ru='" + ru + '\'' +
                '}';
    }
}