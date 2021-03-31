import java.lang.math.*;
class Distance{
public static void main(String args[])
{
int x1,y1,y2;
double dis;
Scanner sc=new Scanner(System.in);
System.out.println("enter X1 point");
x1=sc.nextInt();
System.out.println("enter Y1 point");
y1=sc.nextInt();
System.out.println("enter X2 point");
x2=sc.nextInt();
System.out.println("enter Y2 point");
y2=sc.nextInt();
dis= math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
System.out.println("distance"+"("+x1+","+y1+","+"("+x2+","+y2+")="+dis);
}
}
