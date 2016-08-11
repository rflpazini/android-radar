package co.geeksters.radar;

/**
 * Created by Karam Ahkouk on 04/06/15.
 */
public class RadarPoint {
    double x;
    double y;
    int radius;

    String identifier;

    public RadarPoint(String identifier, double x, double y, int radius){
        this.identifier = identifier;
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public RadarPoint(String identifier, double x, double y){
        this.identifier = identifier;
        this.x = x;
        this.y = y;
    }
}
