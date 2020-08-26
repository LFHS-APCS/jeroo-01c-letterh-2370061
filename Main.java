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
  betty.plant();
  betty.hop();
  betty.plant();
  betty.hop();
  betty.plant();
  betty.hop();
  betty.plant();
  betty.hop();
  betty.plant();
  betty.turn(LEFT);
  betty.hop();
  betty.turn(LEFT);
  betty.hop();
  betty.hop();
  betty.turn(LEFT);
  betty.turn(LEFT);
  betty.turn(LEFT);
  betty.plant();
  betty.hop();
  betty.plant();
  betty.hop();
  betty.plant();
  betty.turn(LEFT);
  betty.hop();
  betty.plant();
  betty.hop();
  betty.plant();
  betty.turn(LEFT);
  betty.turn(LEFT);
  betty.hop();
  betty.hop();
  betty.hop();
  betty.plant();
  betty.hop();
  betty.plant();
  betty.hop();
    
    }

}
