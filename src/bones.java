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
        Scanner input = new Scanner(System.in);

    }

    public bones create(){
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
        this.file = file;
        this.bone = bone;

        in = new Scanner(System.in);
        out = new Formatter(System.out);
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    }

    public static void menu(){

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



}
