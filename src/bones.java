/**
 * @author KoltenSturgill
 *
 */

import java.util.Scanner;


public class Bones {

    int age, mapX, mapY, id;
    float price, length, width, height, weight, latitude, longitude;
    String condition, origin, prospector;
    Scanner input;

    public Bones() {
        input = new Scanner(System.in);
    }

    public Bones(String csv[]) {
        this.age = Integer.parseInt(csv[0]);
        this.price = Integer.parseInt(csv[1]);
        this.condition = csv[2];
        this.mapX = Integer.parseInt(csv[3]);
        this.mapY = Integer.parseInt(csv[4]);
        this.origin = csv[5].substring(1, csv[5].length() - 1);
        this.length = Float.parseFloat(csv[6]);
        this.width = Float.parseFloat(csv[7]);
        this.height = Float.parseFloat(csv[8]);
        this.weight = Float.parseFloat(csv[9]);
        this.prospector = csv[10].substring(1, csv[10].length() - 1);
    }

    public Bones(int age, int price, String condition, int mapX, int mapY,
                 String origin, float length, float width, float height, float weight, String prospector) {
        this.age = age;
        this.price = price;
        this.condition = condition;
        this.mapX = mapX;
        this.mapY = mapY;
        this.origin = origin;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.prospector = prospector;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMapX() {
        return mapX;
    }

    public void setMapX(int mapX) {
        this.mapX = mapX;
    }

    public int getMapY() {
        return mapY;
    }

    public void setMapY(int mapY) {
        this.mapY = mapY;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
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

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getProspector() {
        return prospector;
    }

    public void setProspector(String prospector) {
        this.prospector = prospector;
    }

    public void update(){
        System.out.print("Enter the new Latitude: ");
        latitude = input.nextFloat();
        System.out.print("Enter the new Longitude:");
        longitude = input.nextFloat();
        System.out.print("Enter the new Price: $");
        price = input.nextFloat();
    }
    public int getID(){
        return id;
    }

    public void create(){
        try{
            System.out.print("Enter the:\nLongitude of the bone: ");
            longitude = input.nextFloat();
            System.out.print("Latitude of the bone: ");
            latitude = input.nextFloat();
            System.out.print("Price of the bone: $");
            price = input.nextFloat();
            System.out.print("Identification number: ");
            id = input.nextInt();
            System.out.print("Age: ");
            age = input.nextInt();
            System.out.print("Dimensions of the bone with a space between each entry(length width height): ");
            length = input.nextFloat();
            width = input.nextFloat();
            height = input.nextFloat();
            System.out.print("Weight of the bone in kilograms: ");
            weight = input.nextFloat();
            System.out.print("Condition (Poor, Fair, Good, Excellent): ");
            condition = input.next();
            System.out.print("Country of Origin: ");
            origin = input.next();
            System.out.print("Prospector: ");
            prospector = input.next();
        }
        catch(Exception e){
            System.out.println("An error has occurred when submitting your bone.");
            System.out.println("Please try again");
            create();
        }

        //mapX = Coordinate.();
    }

    @Override
    public String toString() {
        return "Bones{" +
                "age=" + age +
                ", mapX=" + mapX +
                ", mapY=" + mapY +
                ", id=" + id +
                ", price=" + price +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", condition='" + condition + '\'' +
                ", origin='" + origin + '\'' +
                ", prospector='" + prospector + '\'' +
                '}';
    }
}
