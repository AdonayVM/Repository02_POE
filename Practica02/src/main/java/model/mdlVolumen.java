package model;

/**
 *
 * @author myslf
 */
public class mdlVolumen {
    public static float volumen(float radio){
        float pi = (float) Math.PI;
        float volumen = (float) (4/3*pi*Math.pow(radio, 3));
        return volumen;
    }
    
    public static float area(float radio){
        float pi = (float) Math.PI;
        float area = (float) (4*pi*Math.pow(radio, 2));
        return area;
    }
}
