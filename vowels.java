import java.util.*;
public class vowels
{
	public static void main(String ar[])
	{
	Scanner ch=new Scanner(System.in);
	char n=ch.next().charAt(0);
	
 if( (n>='a' && n<='z') || (n>='A' && n<='Z'))
 {
 if(n=='a'||n =='A'||n=='e'||n=='E'||n=='i'||n =='I'||n=='o'||n=='O'||n=='u'||n=='U')
 {
	 System.out.println("Vowel");
 }
 else
 {
	 System.out.println("consonant");
 }
 }
 else
 {
	 System.out.println("invalid");
 }
	}
}
