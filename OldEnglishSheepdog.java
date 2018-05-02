package prj;

public class OldEnglishSheepdog extends dogs {

@Override
void DogAlive() {
	setBreed("Old English Sheepdog");
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
	System.out.println("Dogs breed-Old English Sheepdog");
	System.out.println("Origin- Great Britain");
	
}

private void WikiLink() {
	System.out.println("https://uk.wikipedia.org/wiki/%D0%A1%D1%82%D0%B0%D1%80%D0%BE%D0%B0%D0%BD%D0%B3%D0%BB%D1%96%D0%B9%D1%81%D1%8C%D0%BA%D0%B0_%D0%B2%D1%96%D0%B2%D1%87%D0%B0%D1%80%D0%BA%D0%B0");
	
}
@Override
public void info()
{
	Origin();
	WikiLink();
}
}
