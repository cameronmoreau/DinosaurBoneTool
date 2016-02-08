/**
 * Daniel Delago    1/28/2016
 * Buyer Program
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Buyer {

    Scanner input = new Scanner(System.in);
    ArrayList coordList = new ArrayList();

    public void menu(){
        int choice=0;
        Boolean running = true;
        while(running){
            System.out.println("Bone Buyer Menu:");
            System.out.println("1.Load Map\n2.Display Map\n3.Buy a Bone\n4.Save Files\n5.Load Files\n6.Quit");

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
}

