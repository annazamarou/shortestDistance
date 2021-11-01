import java.util.Scanner;

public class ShortestDistance {
    public static void main(String[] args) {

        double x1, y1, x2, y2, p;
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){

            x1 = sc.nextDouble();
            if(x1==0){
                break;
            }
            y1 = sc.nextDouble();
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            p = sc.nextDouble();

            double x = Math.pow(Math.abs(x1-x2), p);
            double y = Math.pow(Math.abs(y1-y2), p);

            System.out.println(Math.pow((x+y), (1/p)));

        }
        sc.close();
    }
}

