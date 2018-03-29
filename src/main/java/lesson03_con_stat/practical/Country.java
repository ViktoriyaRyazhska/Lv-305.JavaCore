package lesson03_con_stat.practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;


public class Country {
    String getContinent(String country){
        Continent continent=null;
        for(Countries c: Countries.list){
            if(country.equals(c.getName())){
                continent=c.getContinent();
            }
        }
        if(continent==null) {return "Unknown";}
        return continent.name().substring(0,1)+continent.name().substring(1).toLowerCase().replace("_"," ");
    }
    public static void main(String[] args) throws IOException{
        Country c = new Country();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(c.getContinent(reader.readLine()));

    }
}

enum Continent {

    AFRICA, ANTARCTICA, ASIA, AUSTRALIA, EUROPE, NORTH_AMERICA, SOUTH_AMERICA,;
}
 enum Countries
{
    ALBANIA("Albania", Continent.EUROPE),
    AUSTRALIA("Australia", Continent.AUSTRALIA),
    BRAZIL("Brazil",Continent.SOUTH_AMERICA),
    CHINA("China",Continent.ASIA),
    MOROCCO("Morocco",Continent.AFRICA),
    UKRAINE("Ukraine", Continent.EUROPE),
    USA("United States",Continent.NORTH_AMERICA);


    private String name;
    private Continent continent;
    static List<Countries> list = Arrays.asList(Countries.values());

    Countries( String name, Continent continent)
    {
        this.name = name;
        this.continent = continent;
    }
   public String getName(){
        return name;
    }
    public Continent getContinent(){
        return continent;
}
}
