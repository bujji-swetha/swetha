class large
{
public static void main(String a[])
{
int x=Integer.parseInt(a[0]);
int y=Integer.parseInt(a[1]);
int z=Integer.parseInt(a[2]);
if(x>y&&x>z)
{
System.out.println("Biggest No:"+x);
}
else if(y>x&&y>z)
{
System.out.println("Biggest No:"+y);
}
else
System.out.println("Biggest No:"+z);
}
}


