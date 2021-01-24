import java.lang.Math
package m;
//m.Geometry;
public class Geometry{
    /*finds midpoint between two points
     *x1/y1 are the coordinates of the first point
     *x2/y2 are the coordinates of the second point
     *returns a double array that contains the x and y coordinate of the midpoint [x,y]
    */
    public static double[] midpoint(double x1,double y1,double x2,double y2){
      double[] x={((x1+x2)/2),((y1+y2)/2)};
      return x;
    }
    /*finds the distance between two points
     *x1/y1 are the coordinates of the first point
     *x2/y2 are the coordinates of the second point
     *returns a double that is the distance
    */
    public static double distance(double x1,double y1,double x2,double y2){
      return Math.hypot(x2-x1,y2-y1);
    }
    /*completes a CAH method
     *c is the cosine factor
     *a is the adjacent side
     *h is the hypotenuse
     *NOTE: PUT 0 IF THAT IS THE ONE YOU ARE LOOKING FOR
     *x is the type of calculation(-1 finds adjacent, 0 finds hypotenuse, 1 is cosine factor)
     *returns the missing number
    */
    public static double cah(double c,double a,double h,int x){
        switch(x){
            case -1:return h*Math.cos(c);break;
            case 0:return a/Math.cos(c);break;
            default:return Math.acos(a/h);
        }
    }
    /*completes a TOA method
     *c is the tangent factor
     *a is the adjacent side
     *o is the opposite
     *NOTE: PUT 0 IF THAT IS THE ONE YOU ARE LOOKING FOR
     *x is the type of calculation(-1 finds adjacent, 0 finds opposite, 1 is tangent factor)
     *returns the missing number
    */
    public static double toa(double t,double o,double a,int x){
        switch(x){
            case -1:return o*Math.tan(t);break;
            case 0:return a/Math.tan(t);break;
            default:return Math.atan(o/a);
        }
    }
    /*completes a SOH method
     *s is the sine factor
     *o is the opposite side
     *h is the hypotenuse
     *NOTE: PUT 0 IF THAT IS THE ONE YOU ARE LOOKING FOR
     *x is the type of calculation(-1 finds opposite, 0 finds hypotenuse, 1 is sine factor)
     *returns the missing number
    */
    public static double soh(double s,double o,double h,int x){
        switch(x){
            case -1:return h*Math.sin(s);break;
            case 0:return o/Math.sin(s);break;
            default:return Math.asin(o/h);
        }
    }
}
