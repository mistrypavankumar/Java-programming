package tasks;

public class FindVolume {
    double volume;

    FindVolume(double radius){
        volume = 1.333333 *3.14 * Math.pow(radius, 3);
    }

    FindVolume(double length, double width, double height){
        volume = length * width * height;
    }

    public void displayVolume(String shapeName){
        System.out.println("Volume of " + shapeName + " is: " + volume);
    }

    public static void main(String[] args) {
        new FindVolume(5).displayVolume("Sphere");
        new FindVolume(10,5,5).displayVolume("Cuboid");
    }
}
