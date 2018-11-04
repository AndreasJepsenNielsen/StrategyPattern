public class Animal {


    public Flys flying;


    public String tryToFly(){
        return flying.fly();
    }


    public void setFlying(Flys flying) {
        this.flying = flying;
    }
}
