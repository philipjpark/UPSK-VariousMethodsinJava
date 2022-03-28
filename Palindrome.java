import java.util.Scanner;
class Palindrome
{
    public static boolean palMethod(String s)
    {   
        if(s.length() == 0 || s.length() == 1)
            {return true;} 
        if(s.charAt(0) == s.charAt(s.length()-1))
            {return palMethod(s.substring(1, s.length()-1));}   
        else {return false;}
    }

    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = scanner.nextLine();
        
        if(palMethod(str))
            System.out.println(str + " is an example of a palindrome.");
        else
            System.out.println(str + " is not an example of a palindrome.");
            scanner.close();
    }
}