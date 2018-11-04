public class AnimalRun {
    public static void main(String[] args) {

        Animal Stinky = new Skunk();
        Animal LongLifeSpanAlbatross = new Albatross();

        System.out.println("Skunk: " + Stinky.tryToFly());

        System.out.println("Albatross: " + LongLifeSpanAlbatross.tryToFly());


        //Ændre dynamisk så Skunk kan flyve

        Stinky.setFlying(new ItFlys());

        System.out.println("Skunk: " + Stinky.tryToFly());

        LongLifeSpanAlbatross.setFlying(new CantFly());

        System.out.println("Albatross: " + LongLifeSpanAlbatross.tryToFly());


    }
}
