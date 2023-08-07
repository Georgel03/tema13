package fasttrackit.tema13.Curs.Curs;
import fasttrackit.tema13.Curs.Curs.BirthYearCalculator;
import fasttrackit.tema13.Curs.Curs.IntTools;

import static fasttrackit.tema13.Curs.Curs.BirthYearCalculator.calculateDateOfBirth;

public class Main {
    public static void main(String[] args) throws Exception {


        BirthYearCalculator date = new BirthYearCalculator(0);
        System.out.println("Data ta de nastere este: " + calculateDateOfBirth(date.getAge()));

        System.out.println("------------------------------------------");
        IntTools number = new IntTools();
        number.setNumber(58832);
        System.out.println(number.digitAt(0));

    }
}