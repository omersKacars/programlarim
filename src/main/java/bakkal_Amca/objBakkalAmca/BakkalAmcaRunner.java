package bakkal_Amca.objBakkalAmca;

import java.util.Arrays;

public class BakkalAmcaRunner {
    public static void main(String[] args) {
    BakkalAmca bakkalAmcaEsenler =new BakkalAmca();

        bakkalAmcaEsenler.dailyProFit = bakkalAmcaEsenler.addProfit();

        bakkalAmcaEsenler.avarage =bakkalAmcaEsenler.calculateAvarage(bakkalAmcaEsenler.dailyProFit);

        bakkalAmcaEsenler.aboveAvarage = bakkalAmcaEsenler.aboveAvarage(bakkalAmcaEsenler.dailyProFit);
        bakkalAmcaEsenler.belowAvarage = bakkalAmcaEsenler.belowAvarage(bakkalAmcaEsenler.dailyProFit);





    }
}
