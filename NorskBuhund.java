package prj;

public class NorskBuhund  extends dogs {

@Override
void DogAlive() {
	setBreed("Norsk Buhund");
	System.out.println("Dogs breed- ");
	Origin();
	WikiLink();
	
}
@Override
public void setBreed(String Breed) {
	// TODO Auto-generated method stub
	super.setBreed(Breed);
}


public void Origin() {
	System.out.println("Dogs breed-Norsk Buhund");
	System.out.println("Origin- Norway");
	
}

private void WikiLink() {
	System.out.println("https://uk.wikipedia.org/wiki/%D0%9D%D0%BE%D1%80%D0%B2%D0%B5%D0%B7%D1%8C%D0%BA%D0%B8%D0%B9_%D0%B1%D1%83%D1%85%D1%83%D0%BD%D0%B4");
	
}
@Override
public void info()
{
	Origin();
	WikiLink();
}
}
