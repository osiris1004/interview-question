public class GrowthOfAPopulation {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int numberOfYear = 1;
        double pn = p0;
        boolean shouldIterate = true;

        while (shouldIterate) {
            double pPerYear = pn + pn * (percent / 100) + aug;
            if (pPerYear >= p) {
                shouldIterate = false;
            } else {
                pn = pPerYear;
                numberOfYear++;
            }
        }

        return numberOfYear;
    }

    public static void main(String[] args) {
        System.out.println(nbYear(1500, 5, 100, 5000));
        System.out.println(nbYear(1500000, 2.5, 10000, 2000000));
        System.out.println(nbYear(1500000, 0.25, 1000, 2000000));
        System.out.println(nbYear(1500000, 0.25, -1000, 2000000));
    }
    
}
