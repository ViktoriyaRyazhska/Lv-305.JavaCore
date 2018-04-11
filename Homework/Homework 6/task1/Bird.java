package task1;

public abstract class Bird {
String feathers;
int leyEggs;

public abstract String fly();

public Bird(String feathers, int leyEggs) {
	
	this.feathers = feathers;
	this.leyEggs = leyEggs;
}

@Override
public String toString() {
	return (feathers +" "+ leyEggs + " eggs");
	
}
	
	
}
