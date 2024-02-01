public class SumOfNumbers1  
{  
public static void main(String args[])   
{  
int var = 100;

System.out.println(var);
//regular-int

System.out.println(Integer.toBinaryString(var));
//binary

System.out.println(Integer.toString(var,8));
//oct

System.out.println(Integer.toString(var,16));
//hex

float var2 = 100.5f;

System.out.printf("%.2f", var2);
//2 dec places
System.out.println();
System.out.printf("%.2e", var2);
//floating-point in scientific notation

}  
}
