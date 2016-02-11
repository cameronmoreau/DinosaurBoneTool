/**
 * Daniel Delago    1/28/2016
 * Seller Program
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Seller {

    Scanner input;
    ArrayList coordList;
    bones bone;
    loadFile file;


    public Seller(){

        input = new Scanner(System.in);
        coordList = new ArrayList();
        bone = new bones();
        file = new loadFile();
    }

    public void menu(){
        int choice=0;
        Boolean running = true;
        while(running) {
            System.out.println("Bone Seller Menu:");
            System.out.println("1.Load Map\n2.Handle a bone\n3.Display Map\n4.Save Files\n5.Load Files\n6.Quit");

            choice = input.nextInt();
            /*if (choice < 1 || choice > 6) {
                System.out.println("That is not a valid input.\n");
                continue;
            }*/
            //running = false;

            switch (choice) {
                case 1:
                    loadMap();
                    break;
                case 2:
                    bone.menu();
                    break;
                case 3:
                    displayMap();
                    break;
                case 4:
                    //Save file
                    break;
                case 5:
                    file.load();
                    break;
                case 6:
                    //Exits
                    running = false;
                    break;
            }
            continue;
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

    public void displayMap(){
        try {
            int sum=0;
            for(int i=0; i<20;i++){
                for(int j=0;j<60;j++){
                    Coordinate tempCoord = (Coordinate)coordList.get(sum);
                    int[] coordVals = Coordinate.getVals(tempCoord);
                    if(coordVals[2]==0)
                        System.out.print(".");
                    else if(coordVals[2]==1)
                        System.out.print("*");
                    sum+=1;
                }
                System.out.println("");
            }
        }
        catch(Exception e){
            System.out.println("Please Load a Map First.\n");
        }
        System.out.println("");
        menu();
    }


    public static void main(String args[]){
        Seller Daniel = new Seller();
        Daniel.menu();
    }
}