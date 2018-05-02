package prj;

public class Sheltie extends dogs {
	
	@Override
	void DogAlive() {
		setBreed("Sheltie");
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
		System.out.println("Dogs breed-Sheltie");
		System.out.println("Origin- Scotland");
		
	}

	private void WikiLink() {
		System.out.println("https://uk.wikipedia.org/wiki/%D0%A8%D0%B5%D0%BB%D1%82%D1%96");
		
	}

	@Override
	public void info()
	{
		Origin();
		WikiLink();
	}
}
