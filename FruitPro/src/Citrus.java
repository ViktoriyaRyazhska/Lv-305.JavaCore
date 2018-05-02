/*

2) Утворити похідний від нього клас Цитрус, який має:
         - поле - вміст вітаміну С в грамах,
        - конструктор з параметрами,
        - властивість,
        - перевизначені методи input() та print().
*/

public class Citrus extends Fruit{
    public int vitaminC = 0 ;
//////////////////////constructor

    public Citrus(int vitaminC) {
        this.vitaminC = vitaminC;
    }

    public Citrus(String name, String   color, int vitaminC) {
        super(name, color);
        this.vitaminC = vitaminC;
    }
////////////////getter setter

    public int getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(int vitaminC) {
        this.vitaminC = vitaminC;
    }

    @Override
    public String toString() {
        return super.toString()+ " Vitamin C " + vitaminC;
    }

    @Override
    public void input() {
        super.input();
    }

    @Override
    public void print() {
        super.print();
    }

}


