/*
  Design a class named Fan to represent a fan. The class contains:

  - Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
    denote the fan speed.
  - A private int data field named speed that specifies the speed of the fan
    (the default is SLOW).
  - A private boolean data field named on that specifies whether the fan is on
    (the default is false).
  - A private double data field named radius that specifies the radius of the
    fan (the default is 5).
  - A string data field named color that specifies the color of the fan (the
    default is blue).
  - The accessor and mutator methods for all four data fields.
  - A no-arg constructor that creates a default fan.
  - A method named toString() that returns a string description for the fan. If
    the fan is on, the method returns the fan speed, color, and radius in one
    combined string. If the fan is not on, the method returns the fan color and
    radius along with the string "fan is off" in one combined string.

  Write a test program that creates two Fan objects. Assign maximum speed,
  radius 10, color yellow, and turn it on to the first object. Assign medium
  speed, radius 5, color blue, and turn it off to the second object. Display
  the objects by invoking their toString method.
*/

public class E9_08 {
  public static void main(String[] args) {
    Fan a = new Fan();
    Fan b = new Fan();

    a.setSpeed(Fan.FAST);
    a.setRadius(10.0);
    a.setColor("yellow");
    a.setOn(true);

    b.setSpeed(Fan.MEDIUM);

    System.out.println("Fan A");
    System.out.println(a);

    System.out.println("Fan B");
    System.out.println(b);
  }

  private static class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan() {
      speed = SLOW;
      on = false;
      radius = 5.0;
      color = "blue";
    }

    // getters
    int getSpeed() {
      return speed;
    }

    boolean isOn() {
      return on;
    }

    double getRadius() {
      return radius;
    }

    String getColor() {
      return color;
    }

    // setters
    void setSpeed(int speed) {
      this.speed = speed;
    }

    void setOn(boolean on) {
      this.on = on;
    }

    void setRadius(double radius) {
      this.radius = radius;
    }

    void setColor(String color) {
      this.color = color;
    }

    // instance methods
    public String toString() {
      return "speed: " + getSpeed() + "\n" +
             "color: " + getColor() + "\n" +
             "radius: " + getRadius() + "\n" +
             (isOn() ? "" : "fan is off");
    }
  }
}