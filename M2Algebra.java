import java.lang.Math;
import java.util.ArrayList;
package m;
//m.Algebra2;
public class Algebra2{
  /*
   *checks if the int given is a prime number
  */
  public boolean isPrime(int n){
    if(n<=1){
      return false;}
    for(int i=2;i<Math.sqrt(n);i++){
      if(n%i==0){return false;}
    }
    return true;}
   /*simplifies square roots of a number given the square root
    *xy will be the number that is being simplified
    *this will return an integer array
    *int[0] being what it's multiplied by
    *int[1] being what the square root is
   */
   public int[] rsqrt(double xy){
    int x=(int)xy;
    ArrayList<Integer> figure=new ArrayList<Integer>();
    ArrayList<Integer> figure2=new ArrayList<Integer>();
    int y=x;
    x=Math.abs(x);
    int x2=0;
    do{x2=2;while(x%x2!=0){x2++;}x/=x2;System.out.println(x+" "+x2);figure.add(x2);if(x2==0||x==0||x==1||x2==1){break;}}while(!(isPrime(x)));
    figure.add(x);
    System.out.println(figure);
    for(int z=0;z<figure.size();z++){
      for(int i=0;i<figure.size();i++){
        if(i==z){break;}
        if(figure.get(z)==figure.get(i)){
          figure2.add(figure.get(i));
          figure.remove(i);
          figure.remove(i);
          break;}}}
    System.out.println(figure+"\n"+figure2);
    int ans1=1;
    int ans2=1;
    for(int j=0;j<figure2.size();j++){
      ans1*=figure2.get(j);}
    for(int e=0;e<figure.size();e++){
      ans2*=figure.get(e);}
    int[] xz={ans1,ans2}; 
    return xz;
  }
  /*This will factor a three part equation (EX: ax^2+bx+c)
   *(EX: 8,13,-6 will return 2, -3)
  */
  public double[] factorx(double x,double y,double z){
    double a1=x,b1=y,c1=z;
    a1*=c1;
    for(int i=0;i!=a1/2;i++){
      if(a1%i==0&&a1/i+i==b1){x_one=i;x_two=a1/i;break;}
      i*=-1;
      if(a1%i==0&&a1/i+i==b1){x_one=i;x_two=a1/i;break;}
      a1*=-1;
      if(a1%i==0&&a1/i+i==b1){x_one=i;x_two=a1/i;break;}
      i*=-1;
      if(a1%i==0&&a1/i+i==b1){x_one=i;x_two=a1/i;break;}
      a1*=-1;
      System.out.println(a1+" "+i);
    }
    if(x_one%x==0){x_one/=x;}
    if(x_two%x==0){x_two/=x;}
    System.out.printf("%.2f %.2f",x_one,x_two);
    double[] d={x_one,x_two};
    return d;
  }
  /*calculates the Nth root of A
   *A being the number to be rooted
   *N being the exponent of the root
  */
  public static double nthRoot(double A,int N){
    double xPre=Math.random()%10,eps=0.001,delX=Integer.MAX_VALUE,xK=0;
    while(delX>eps){xK=((N-1.0)*xPre+(double)A/Math.pow(xPre,N-1))/(double)N;
    delX=Math.abs(xK-xPre);
    xPre=xK;}
    return xK;
  }
  /*given a two coordinates, this finds 'a' in the quadratic formula
   *h is h
   *k is k
   *x_one is the x-coordinate of the point
   *y_one is the y-coordinate of the point
   *this will return a double that will correspond to the following: "y=<vap_solve()>(x-h)^2+k"
  */
  public double vap_solve(double h,double k,double x_one,double y_one) {
    return k-(y_one/Math.pow(x_one-h,2));
  }
}
