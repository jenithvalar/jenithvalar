import java.util.Scanner;
import java.util.Random;

class AtRandomNumber
{
    public static void main(String[] args)
    {
        int maxRange;

        //create objects
        Scanner SC = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Now you can find your numbers random number: ");
        maxRange=SC.nextInt();

        for(int loop=1; loop<=maxRange; loop++)
        {
            System.out.println(rand.nextInt(maxRange));
        }
    }
}
