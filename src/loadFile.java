/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Formatter;
import java.util.Scanner;


/**
 *
 * @author KoltenSturgill
 */



public class loadFile{


    public Boolean load(){

        //Creates a file object

        File file = new File("text.csv");
        if(file.exists()){
            readFile(file);

        }

        else{
            //Seller.menu();
        }

        return true;
    }


    public static void readFile(File fileIn){
        //Reads and prints items in file

        ArrayList list = new ArrayList();




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
        }

        catch(IOException ex){
            System.out.printf("%s", "File not found!");
        }

        //System.out.print(list);
        //bones.createBone(list);
        //return strs;

    }


}



    

