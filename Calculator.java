import java.util.Scanner;


public class Calculator
{
    private static final double RadiusZemli = 6378.01;
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите широту первой точки: ");
        double shirota1 = Math.toRadians(scanner.nextDouble());
        System.out.println("Введите долготу первой точки: ");
        double dolgota1 = Math.toRadians(scanner.nextDouble());
        System.out.println("Введите широту второй точки: ");
        double shirota2 = Math.toRadians(scanner.nextDouble());
        System.out.println("Введите долготу второой точки: ");
        double dolgota2 = Math.toRadians(scanner.nextDouble());

        double raznitsashirot = shirota2 - shirota1;
        double raznitsadolgotami = dolgota2 - dolgota1;
        double a = Math.pow(Math.sin(raznitsashirot / 2), 2) + Math.cos(shirota1) * Math.cos(shirota2) * Math.pow(Math.sin(raznitsadolgotami /2), 2);
        double c = 2 * Math.asin(Math.sqrt(a));
        double distance = RadiusZemli * c;

        System.out.println("Расстояние между двумя точками: " + distance + "км");

        scanner.close();
    }
}
