/**
 * Daniel Delago    1/28/2016
 * Seller Program
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Seller {

    Scanner input = new Scanner(System.in);

    public void menu(){
        int choice=0;
        Boolean running = true;
        while(running){
            System.out.println("Bone Seller Menu:");
            System.out.println("1.Load Map\n2.Handle a bone\n3.Display Map\n4.Save Files\n5.Load Files\n6.Quit");

            choice =input.nextInt();
            if(choice<1 || choice>6){
                System.out.println("That is not a valid input.\n");
                continue;
            }
            running = false;
        }
        switch (choice){
            case 1:
                loadMap();break;
            case 2:
                System.out.println("Input is 2\n");break;
            case 3:
                System.out.println("Input is 3\n");break;
            case 4:
                System.out.println("Input is 4\n");break;
            case 5:
                System.out.println("Input is 5\n");break;
            case 6:
                System.out.println("Input is 6\n");break;
        }
    }

    public void loadMap(){
        ArrayList coordList = new ArrayList();
        File mapFile = new File("Map.txt");
        try{
            Scanner fileIn = new Scanner(mapFile);
            while(fileIn.hasNext()){
                String tempLine = fileIn.nextLine();
                String coordData[] = tempLine.split(",");
                Coordinate newCoord = new Coordinate(coordData);
                coordList.add(newCoord);
            }
            fileIn.close();
        }
        catch (IOException e){
            System.out.println("File not Found");
        }
        System.out.println("Map Loaded\n");
        menu();
    }


    public static void main(String args[]){
        Seller Daniel = new Seller();
        Daniel.menu();
    }
}