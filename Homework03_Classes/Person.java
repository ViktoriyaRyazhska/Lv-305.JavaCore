import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;


public class Person {
    private String name;
    private int bithYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBithYear() {
        return bithYear;
    }

    public void setBithYear(int bithYear) {
        this.bithYear = bithYear;
    }

    public Person(){
    }

    public Person(String name, int bithYear){
        this.name = name;
        this.bithYear = bithYear;
    }

    public int age (){
        return LocalDateTime.now().getYear() - this.bithYear;
    }

    public void input()  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name:");
        String name = br.readLine();
        this.name = name;
        System.out.println("What is your year of bith:");
        int bithYear = Integer.parseInt(br.readLine());
        this.bithYear = bithYear;
    }

    public void output(){
        System.out.println(this.name + " " + age());
    }

    public void changeName(String name){
      setName(name);
    }

}

