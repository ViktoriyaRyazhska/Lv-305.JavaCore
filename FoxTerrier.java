package prj;

public class FoxTerrier extends dogs {
public FoxTerrier( ) {}

@Override
void DogAlive() {
	setBreed("Fox Terrier");
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
	System.out.println("Dogs breed-Fox Terrier");
	System.out.println("Origin- Great Britain");
	
}

private void WikiLink() {
	System.out.println("https://uk.wikipedia.org/wiki/%D0%92%D0%B5%D0%BB%D0%B8%D0%BA%D0%B0_%D0%91%D1%80%D0%B8%D1%82%D0%B0%D0%BD%D1%96%D1%8F");
	
}
@Override
public void info()
{
	Origin();
	WikiLink();
}
}
