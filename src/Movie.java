public class Movie {

    String name;
    String releaseDate;
    boolean plan;
    private double ratingCalc; // deixar variavel privada para não mexerem no código principal
    private int numberOfRatings;

    int getNumberOfRatings (){

        return numberOfRatings;
    }

    void rate(double nota){
        ratingCalc += nota;
        numberOfRatings++;
    }

    void showInfo (){
        
        System.out.println(String.format("Movie: %s", name));
        System.out.println(String.format("Release Date: %s", releaseDate));
        System.out.println(String.format("Rate: %.2f", ratingCalc));
        
    }

    double pegaMedia (){

        return ratingCalc/numberOfRatings;
    }
}
