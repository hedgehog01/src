import java.util.*;
/**
 * Class with solution to binary decimal number converter problem - Karan project github
 * 
 * https://github.com/karan/Projects
 * 
 * Binary to Decimal and Back Converter - Develop a converter to convert a decimal number to binary or a binary number to its decimal equivalent.
 * 
 * @author Hedgehog01 
 * @version 15.07.2014
 */
public class BinaryDecimalConverter
{
    /**
     * method that converts binary number to decimal number
     * @param num the number to be converted from binary to decimal
     * @return the decimal number
     */
    public static int binaryToDecimal (String num)
    {
        int number = 0;
        for (int i=0;i<num.length();i++)
        {
            if (num.charAt(i)=='1')
                number += (int)Math.pow (2,num.length()- 1 - i);
        }
        return number;
    }
    
    public static String decimalToBinary (int num)
    {
        String binary = "";
        
        while (num >= 1)
        {
            if (num%2 == 0)
            {
                num = num /2;
                binary += "0";              
            }
            else
            {
                num = num /2;
                binary += "1"; 
            }
        }
        String tmp = "";
        //reverse the binary number
        for (int i=binary.length()-1;i>=0;i--)
        {
            tmp += binary.charAt(i);
        }
        
        binary = tmp;
        
        return binary;
    }
    
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter binary number to convert to decimal:");
        String binary = scan.next();
        System.out.println ("The decimal number: " + binaryToDecimal(binary));
        
        System.out.println ("Enter decimal (integer) number to convert to binary:");
        int decimal = scan.nextInt();
        System.out.println ("The binary number: " + decimalToBinary(decimal));
    }
}
