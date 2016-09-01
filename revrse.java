import java.io.*;
class reverse
{
public static void main(String args[])
{
System.out.println("Enter the string");
Scanner s=new Scanner(System.in);
String str=s.nextLine();
StringBuffer a=new StringBuffer(str);
System.out.println(a.reverse());
}
}
