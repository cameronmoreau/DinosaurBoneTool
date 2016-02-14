/**
 * Daniel Delago    1/28/2016
 * Seller Program
 */
import java.io.File;
import java.io.IOException;
import java.util.*;


public class Seller {

    Scanner input;
    ArrayList coordList;
    ArrayList<Bones> boneList;

    LoadFile file;
    LoadFile list;

    /**
     * If i want to see if bones are loaded,
     * Check if boneList == null
     * */

    public Seller(){

        input = new Scanner(System.in);
        coordList = new ArrayList();
        boneList = new ArrayList<>();
        file = new LoadFile("text.csv");
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
            }

            switch (choice){
                case 1:
                    loadMap();break;
                case 2:
                    handleBone();break;
                case 3:
                    displayMap();break;
                case 4:
                    break;
                case 5:
                    boneList.addAll(file.loadBones());
                    for(Bones b : boneList) {
                        System.out.println(b.toString());
                    }
                    break;
                case 6:
                    running = false;
                    break;
            }
        }
    }

    public boolean isLoaded(){
        //load();


        //File not loaded
        if (boneList == null){
            System.out.print("No files found!\n");
            return false;
        }

        else if(boneList.size() == 0) {
            System.out.print("File is loaded but empty\n");
        }


        //File loaded
        else{
            System.out.print("File is loaded\n");
        }

        return true;
    }
    public void loadMap(){

        File mapFile = new File("Map.txt");

        try{
            Scanner fileIn = new Scanner(mapFile);
            while(fileIn.hasNext()){
                String tempLine = fileIn.nextLine();
                String coordData[] = tempLine.split(",");
                Coordinate newCoord = new Coordinate();
                newCoord.loadMap(coordData);
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
                Bones newBone = new Bones();
                newBone.create();
                boneList.add(newBone);
            }

            if(choice == 2){
                int id,i;
                System.out.print("Enter the ID of the bone: ");
                id = input.nextInt();
                for(i=0;i<boneList.size();i++){
                    Bones tempBone = (Bones)boneList.get(i);
                    if(tempBone.getID() != id)
                        continue;
                    tempBone.update();
                    boneList.set(i,tempBone);
                    break;
                }
            }

            if(choice == 3){
                int id,i;
                System.out.print("Enter the ID of the bone: ");
                id = input.nextInt();
                for(i=0;i<boneList.size();i++){
                    Bones tempBone = (Bones)boneList.get(i);
                    if(tempBone.getID() != id)
                        continue;
                    boneList.remove(i);
                    break;
                }
            }
        }
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
