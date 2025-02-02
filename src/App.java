import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        Movie movie1 = new Movie();
        movie1.name = "Marcus Marques";
        movie1.releaseDate = "25/09/2001";

        
        movie1.rate(2);
        movie1.rate(6);
        movie1.rate(2);

        movie1.showInfo();
        System.out.println("Rate Number: " + movie1.getNumberOfRatings());
    }
}