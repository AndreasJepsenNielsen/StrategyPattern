public class Albatross extends Animal {

    private void sleepFly(){
        System.out.println("Im sleeping and flying at the same time!");
    }

    public Albatross(){
        super();

        flying = new ItFlys();
    }

}
