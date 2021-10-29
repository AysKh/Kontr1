import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static boolean T1(int x, int y) throws InputMismatchException, IOException
    {
        if (x+y <= 20 && x+y >= 10)
        {
            return true;
        } else return false;
    }

    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            boolean ans = T1(x, y);
            System.out.println("task 1:");
            if (ans == true){
                System.out.println("True");
            } else System.out.println("False");
        } catch (IOException IOE){
            System.out.println("IOE");
        }
        catch (InputMismatchException IME){
            System.out.println("Incorrect");
        }
    }
}