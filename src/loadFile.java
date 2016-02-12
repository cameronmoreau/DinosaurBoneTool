/**
 * @author KoltenSturgill
 *
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class loadFile{


    static int readCount = 0;
    ArrayList list;
    File file;
    bones bone;


    public loadFile(){
        list = new ArrayList();
        file = new File("text.csv");
        //bone = new bones();
    }


    public int load(){

        //Creates a file object

        //File file = new File("text.csv");
        if(file.exists()){
            readFile(file);

            readCount++;

        }

        return readCount;
    }

/*    public boolean isLoaded(){
        //load();

        if (readCount >= 1){
            System.out.print("File is loaded\n");
            bone.createBone();

        }

        else{
            System.out.print("No files found!\n");
        }

        return false;
    }*/


    public ArrayList readFile(File fileIn){
        //Reads and prints items in file

        //ArrayList list = new ArrayList();


        try{
            Scanner input = new Scanner(fileIn);
            //input.useDelimiter(",");

            while(input.hasNext()){
                //bones bone = new bones(input.nextLine());
                if(input.hasNextInt()){
                    list.add(input.nextInt());
                }

                if(input.hasNextFloat()){
                    list.add(input.nextFloat());
                }

                if(input.hasNext()){
                    list.add(input.next());
                }

            }
            input.close();
            System.out.print("Finished loading...\n");
        }

        catch(IOException ex){
            System.out.printf("%s", "File not found!");
        }

        //System.out.print(list);
        //createBone(list);
        return list;

    }

    public ArrayList getList() {
        //readFile(file);
        return list;
    }
}



    

