/**
 * @author KoltenSturgill
 *
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;


public class bones {

    int age;
    float price;
    String condition;
    int coordX;
    int coordY;
    String origin;
    float length;
    float width;
    float height;
    float weight;
    String prospector;

    loadFile file;
    bones bone;

    Formatter out;
    Scanner in;

    public bones() {

        this.age = age;
        this.price = price;
        this.condition = condition;
        this.coordX = coordX;
        this.coordY = coordY;
        this.origin = origin;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.prospector = prospector;

        file = new loadFile();

        out = new Formatter(System.out);
        in = new Scanner(System.in);


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getProspector() {
        return prospector;
    }

    public void setProspector(String prospector) {
        this.prospector = prospector;
    }

    public void menu(){

        Boolean running = true;

        while(running){

            int choice;

            System.out.println("1. Create a dinosaur bone");
            System.out.println("2. Quit");

            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            switch(choice){
                case 1:
                    //Check if loadFile function has been completed

                    createBone();
                    running = false;
                    break;

                case 2:
                    //Seller.menu();
                    running = false;
                    break;
            }

        }
    }


    public boolean isLoaded(){
        //load();

        if (loadFile.readCount >= 1){
            System.out.print("File is loaded\n");
            //createBone();
        }

        else{
            System.out.print("No files found!\n");
        }

        return true;
    }


    public void createBone(){
        //This will create the bones AFTER a CSV file is loaded
        //Parse items in ArrayLists as Objects to constructor?
        //System.out.println("createBone function executed.\n");

        if(isLoaded()){
            System.out.print("Loaded...");

            //Create bone object here
            bones bone = new bones();
            out.format("Enter the age of the bone:");
            String strAge = in.next();
            int parsed = Integer.parseInt(strAge);
            bone.setAge(age);
        }

        else{

        }



    }

}
