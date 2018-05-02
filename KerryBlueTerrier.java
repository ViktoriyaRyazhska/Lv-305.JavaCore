package prj;

public class KerryBlueTerrier extends dogs {

@Override
void DogAlive() {
	setBreed("Kerry Blue Terrier");
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
	System.out.println("Dogs breed-Kerry Blue Terrier");
	System.out.println("Origin- Irland");
	
}

private void WikiLink() {
	System.out.println("https://uk.wikipedia.org/wiki/%D0%9A%D0%B5%D1%80%D1%80%D1%96_%D0%B1%D0%BB%D1%8E_%D1%82%D0%B5%D1%80%27%D1%94%D1%80");
	
}
@Override
public void info()
{
	Origin();
	WikiLink();
}
}
