// This code is riddled with errors.
// Please find and fix all of the errors without changing the intended purpose of the code.

public class Errors{
  public static void main(String[] args){
    String name = "Alan";
    String animal = "duck";
    System.out.println("My name is " + name + " and I am a " + animal + ".");

    int weight = 90;
    int volume = 8;
    double density = (double)weight/volume; // Should be the correct precise value.

    System.out.println("I am a heavy " + animal + " because I have a density of " + density + " kilograms per cubic centimeter.");

    System.out.println("It was nice meeting you!");
  }
}
