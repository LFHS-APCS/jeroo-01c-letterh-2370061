/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {
    // Put any methods here
public void plantHop(){
  this.plant();
  this.hop();
}
  public void plantStraight5(){
    this.plantHop();
    this.plantHop();
    this.plantHop();
    this.plantHop();
    this.plant();
  }
  public void leftHop(){
    this.turn(LEFT);
    this.hop();
  }
  public void turnRight(){
    this.turn(LEFT);
    this.turn(LEFT);
    this.turn(LEFT);
  }
  public void plantStraight3(){
    this.plantHop();
    this.plantHop();
    this.plant();
  }
  public void plantStraight2(){
    this.plantHop();
    this.plant();
  }
  public void switchDirection(){
    this.turnRight();
    this.turnRight();
  }
  public void hop3(){
    this.hop();
    this.hop();
    this.hop();
  }
  public void plantHop2(){
    this.plantHop();
    this.plantHop();
  }
  public void leftHop2(){
    this.leftHop();
    this.leftHop();
  }
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
