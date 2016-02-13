/**
 * Daniel Delago    1/28/2016
 * Seller Program
 */
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;


public class Seller {

    Scanner input;
    ArrayList coordList;
    ArrayList boneList;

    Formatter out;
    bones bone;
    loadFile file;
    loadFile list;

    public Seller(){

        out = new Formatter(System.out);
        input = new Scanner(System.in);
        coordList = new ArrayList();
        boneList = new ArrayList();
        bone = new bones();
        file = new loadFile();
    }

    public void menu(){
        int choice=0;
        Boolean running = true;
        while(running) {
            System.out.println("Bone Seller Menu:");
            System.out.println("1. Load Map\n2. Handle a bone\n3. Display Map\n4. Save Files\n5. Load Files\n6. Quit");

            choice = input.nextInt();
            if (choice < 1 || choice > 6) {
                System.out.println("That is not a valid input.\n");
                continue;
            }
            running = false;
         }
        switch (choice) {
            case 1:
                loadMap();break;
            case 2:
                handleBone();break;
            case 3:
                displayMap();break;
            case 4:
                break;
            case 5:
                file.load();break;
            case 6:
                break;
        }
    }

    public boolean isLoaded(){
        //load();

        if (loadFile.readCount >= 1){
            //System.out.print("File is loaded\n");
            //createBone();
        }

        else{
            System.out.print("No files found!\n");
        }

        return true;
    }


    public void createBone(){
        //This will create the bones AFTER a CSV file is loaded
        //Parse items in ArrayLists as to constructor?
        //System.out.println("createBone function executed.\n");

        if(isLoaded()){

            List theList = file.getList();
            out.format("theList: " + String.valueOf(theList) + "\n");


        }

        else{

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

    public void handleBone(){
        int choice=0;
        while(choice != 4){
            System.out.println("Would you like to:\n1.Create a bone\n2.Update a bone\n3.Remove a bone\n4.Quit to main menu");
            choice = input.nextInt();

            if(choice == 1){
                bones newBone = new bones();
                newBone.create();
                boneList.add(newBone);
            }

            if(choice == 2){


            }

            if(choice == 3){


            }

        }

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