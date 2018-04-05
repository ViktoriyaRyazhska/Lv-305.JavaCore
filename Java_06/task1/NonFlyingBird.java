public class NonFlyingBird extends Bird {

    public NonFlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    void fly() {
        System.out.println("Not fly : ");

    }

}