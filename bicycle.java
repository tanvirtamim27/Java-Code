public class bicycle {
    private int cadence= 0;
    private int speed= 0;
    private int gear= 1;

    public void changeCadence(int cadence) {
        this.cadence = cadence;
    }

    public void changeGear(int gear) {
        this.gear = gear;
    }
    public void speedUp(int speed) {
        this.speed = speed;
        speed += speed;
    }
    public void slowDown(int speed) {
        this.speed = speed;
        speed -= speed;
    }

    public void stop() {
        speed = 0;
    }
    public void printStstus(){
        System.out.println("cadence:"+cadence+" speed:"+speed+" gear:"+gear);
    }


}
