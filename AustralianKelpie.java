package prj;

public class AustralianKelpie extends dogs {
	@Override
	void DogAlive() {
		setBreed("Australian Kelpie");
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
		System.out.println("Dogs breed-Australian Kelpie");
		System.out.println("Origin- Australia");
		
	}

	private void WikiLink() {
		System.out.println("https://uk.wikipedia.org/wiki/%D0%90%D0%B2%D1%81%D1%82%D1%80%D0%B0%D0%BB%D1%96%D0%B9%D1%81%D1%8C%D0%BA%D0%B8%D0%B9_%D0%BA%D0%B5%D0%BB%D0%BF%D1%96");
		
	}
	@Override
	public void info()
	{
		Origin();
		WikiLink();
	}
}
