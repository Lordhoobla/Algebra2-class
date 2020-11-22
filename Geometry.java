import java.lang.Math
package m;
//m.Geometry;
public class Geometry{
    /*finds midpoint between two points
     *x1/y1 are the coordinates of the first point
     *x2/y2 are the coordinates of the second point
     *returns a double array that contains the x and y coordinate of the midpoint [x,y]
    */
    public double[] midpoint(double x1,double y1,double x2,double y2){
      double[] x={((x1+x2)/2),((y1+y2)/2)};
      return x;
    }
    /*finds the distance between two points
     *x1/y1 are the coordinates of the first point
     *x2/y2 are the coordinates of the second point
     *returns a double that is the distance
    */
    public double distance(double x1,double y1,double x2,double y2){
      return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    
}
