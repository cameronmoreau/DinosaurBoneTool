/**
 * Created by daniel on 2/5/16.
 */
public class Coordinate {
    int longitudeMap, latitudeMap, landOrWaterMap;
    double longitudeGlobe, latitudeGlobe, landOrWaterGlobe;
    String mapType, globe;

    public Coordinate(String newCoordData []){
        longitudeMap = Integer.parseInt(newCoordData[0]);
        latitudeMap = Integer.parseInt(newCoordData[1]);
        landOrWaterMap = Integer.parseInt(newCoordData[2]);
        System.out.println(longitudeMap+ " " + latitudeMap + " " + landOrWaterMap);
    }





}