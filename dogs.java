package prj;

public abstract class dogs extends Appl {
	private String Breed;
	
	public String getBreed() {
		return Breed;
	}
public void setBreed(String Breed) {
	this.Breed=Breed;
}
abstract void DogAlive();
}
