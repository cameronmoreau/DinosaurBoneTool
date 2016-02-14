/**
 * Created by daniel on 2/5/16.
 */
public class Coordinate {

    int longitudeMap, latitudeMap, landOrWaterMap;
    double longitudeGlobe, latitudeGlobe;

    public void loadMap(String newCoordData []){
        longitudeMap = Integer.parseInt(newCoordData[0]);
        latitudeMap = Integer.parseInt(newCoordData[1]);
        landOrWaterMap = Integer.parseInt(newCoordData[2]);
    }

    public static int[] getVals(Coordinate temp){
        int[] coord = {temp.longitudeMap, temp.latitudeMap, temp.landOrWaterMap};
        return coord;
    }

    public int toMapIndex(float latOrlong){


        return 0;

    }

}