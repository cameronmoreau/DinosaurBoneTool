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
    ArrayList coordList = new ArrayList();

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
                displayMap();break;
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
        int BorS;
        Scanner in = new Scanner(System.in);
        System.out.println("Which tool would you like to use?:\n1.Buyer\n2.Seller");
        BorS = in.nextInt();
        in.nextLine();
        if(BorS==1){
            Seller Daniel = new Seller();
            Daniel.menu();
        }
        else{
            Buyer Daniel = new Buyer();
            Daniel.menu();
        }
    }
}