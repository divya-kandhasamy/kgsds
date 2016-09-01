import java.io.*;
class rev
{
public static void main(String args[])
{
System.out.println("Enter the string");
Scanner s=new Scanner(System.in);
String str=s.nextLine();
StringBuffer buff=new StringBuffer(str);
System.out.println(buff.reverse());
}
}
