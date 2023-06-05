package bakkal_Amca.objBakkalAmca;

import java.util.Arrays;
import java.util.Scanner;

public class BakkalAmca {

    String[] days = {"sunday", "monday", "tuesday", "wedwesday", "thurday", "friday", "saturday"};

    double[] dailyProFit = new double[days.length];

    int low;

    @Override
    public String toString() {
        return "BakkalAmca{" +
                "dailyProFit=" + Arrays.toString(dailyProFit) +
                '}';
    }

    int[] lowProFit = new int[low];

    int high;
    int[] highProFit = new int[high];

    int lowDaysLenght;
    String lowdaysArray[] = new String[lowDaysLenght];

    int highDaysLenght;
    String highDaysArray[] = new String[highDaysLenght];

    Scanner input = new Scanner(System.in);
    double profit;
    double avarage;


    public double[] addProfit() {
        int i = 0;
        for (double w : dailyProFit) {
            System.out.println("Add " + days[i] + " profit");
            w = input.nextInt();
            dailyProFit[i] = w;
            i++;

        }
        return dailyProFit;
    }

    public double calculateAvarage(double[] arr) {
        int toplam = 0;
        for (double w : arr) {
            toplam += w;
        }
        return toplam / arr.length;
    }

int aboveAvarage;
    public int aboveAvarage(double[] arr) {
        int abovedays = 0;
        for (double w : arr) {
            if (w > avarage) {
                abovedays++;
            }

        }

        return abovedays;
    }
int belowAvarage;
    public int belowAvarage(double[] arr) {
        int belowDays=0;
        for (double w : arr) {
            if (w < avarage) {
                belowDays++;
            }

        }

        return belowDays;
    }

    //public String[] upperAvaregeDays(int count,String days , double  )



}





