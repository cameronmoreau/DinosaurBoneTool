/**
 * @author KoltenSturgill
 *
 */

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



    public bones() {
        Scanner input = new Scanner(System.in);

    }

    public bones create(){




    }

    public static void menu(){

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


                    running = false;
                    break;

                case 2:
                    //Seller.menu();
                    running = false;
                    break;
            }

        }
    }


    public static ArrayList createBone(ArrayList list){
        //This will create the bones AFTER a CSV file is loaded
        //Parse ArrayLists as Objects to constructor?
        System.out.println("createBone function executed.\n");

        return list;


    }

}
