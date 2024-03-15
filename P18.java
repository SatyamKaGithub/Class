/* Question - 1 Create an interface “CART” containing method “RUN” and variable as speed.
Create another interface based on the “CART” named “CAR” which has method “STOP”, “BOOST”.
Design another class “Toyota” which implement them.
* */
// Define the CART interface
interface CART {
    void RUN();
    int getSpeed(); // Getter method for speed
}

// Define the CAR interface based on CART
interface CAR extends CART {
    void STOP();
    void BOOST();
}

// Implementing class Toyota
class Toyota implements CAR {
    private int speed = 0; // Speed variable

    @Override
    public void RUN() {
        System.out.println("Toyota is running at speed: " + getSpeed());
    }

    @Override
    public void STOP() {
        System.out.println("Toyota has stopped.");
    }

    @Override
    public void BOOST() {
        speed += 10;
        System.out.println("Toyota has boosted its speed. New speed: " + getSpeed());
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}

// Main class for testing
public class P18 {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        toyota.RUN(); // Initially, speed is 0
        toyota.BOOST(); // Increase speed by 10
        toyota.RUN();
        toyota.STOP();
    }
}

