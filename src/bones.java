/**
 * @author KoltenSturgill
 *
 */

import java.util.Scanner;


public class bones {

    int age, mapX, mapY, id;
    float price, length, width, height, weight, latitude, longitude;
    String condition, origin, prospector;
    Scanner input;

    public bones() {
        input = new Scanner(System.in);

    }

    public void create(){
        try{
            System.out.print("Enter the:\nLongitude of the bone: ");
            longitude = input.nextFloat();
            System.out.print("Latitude of the bone: ");
            latitude = input.nextFloat();
            System.out.print("Price of the bone: $");
            price = input.nextFloat();
            System.out.print("Identification number: ");
            id = input.nextInt();
            System.out.print("Age: ");
            age = input.nextInt();
            System.out.print("Dimensions of the bone with a space between each entry(length width height): ");
            length = input.nextFloat();
            width = input.nextFloat();
            height = input.nextFloat();
            System.out.print("Weight of the bone in kilograms: ");
            weight = input.nextFloat();
            System.out.print("Condition (Poor, Fair, Good, Excellent): ");
            condition = input.next();
            System.out.print("Country of Origin: ");
            origin = input.next();
            System.out.print("Prospector: ");
            prospector = input.next();
        }
        catch(Exception e){
            System.out.println("An error has occurred when submitting your bone.");
            System.out.println("Please try again");
            create();
        }

        //mapX = Coordinate
    }

    public void update(){
        System.out.print("Enter the new Latitude: ");
        latitude = input.nextFloat();
        System.out.print("Enter the new Longitude:");
        longitude = input.nextFloat();
        System.out.print("Enter the new Price: $");
        price = input.nextFloat();
    }

    public int getID(){
        return id;
    }
}
