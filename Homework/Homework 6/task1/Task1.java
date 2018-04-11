package task1;

public class Task1 {

	public static void main(String[] args) {
		Bird[] bird = new Bird[4];
		bird[0] = new Eagle("Eagle Feathers", 2);
		bird[1] = new Swallow("Swallow Feathers", 4);
        bird[2] = new Chicken("Chicken Feathers", 3);
        bird[3] = new Penguin("Penguin Feathers", 1);
        
        for(int i=0; i<bird.length; i++) {
        	System.out.println(bird[i].toString());
        	System.out.println(bird[i].fly());
        }
		
	}

}
