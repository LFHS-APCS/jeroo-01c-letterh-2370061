/**
 * Make the letter H as described in the Readme.md
 * IMPORTANT:  You can only use:
 *      hop()
 *      plant()
 *      turn(LEFT)
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
        new JerooGUI();
        runJerooCode();
    }

    /**
     * Put your main Jeroo code here.
     */
    public static void runJerooCode() {
       // Write code here to make a letter here
       Jeroo betty = new Jeroo(1,1, SOUTH, 12);
  betty.plantStraight5
  betty.leftHop2();
  betty.hop();
  betty.turnRight();
  betty.plantStraight3();
  betty.leftHop();
  betty.plantStraight2();
  betty.switchDirection();
  betty.hop3();
  betty.plantHop2();
    
    }

}
