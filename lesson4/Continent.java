package lesson4;

public enum Continent {
    Asia("Asia"), Africa("Africa"), NorthAmerica("NorthAmerica"), SouthAmerica("South America"),
    Europe("Europe");
//Asia, Africa, North America, South America, Antarctica, Europe, and Australia

    private String continent;

    Continent(String continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continent='" + continent + '\'' +
                '}';
    }
}
