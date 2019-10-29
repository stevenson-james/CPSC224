import java.util.Random;

public class Quintiles {
    public static void main(String[] args) {
        Random rand = new Random();
        double number = rand.nextDouble();
        if (number < .2)
            System.out.print("The number " + number + " is in the first quintile");
        else if (number < .4)
                System.out.print("The number " + number + " is in the second quintile");
            else if (number < .6)
                    System.out.print("The number " + number + " is in the third quintile");
                else if (number < .8)
                        System.out.print("The number " + number + " is in the fourth quintile");
                    else
                        System.out.print("The number " + number + " is in the fifth quintile");
    }
}
