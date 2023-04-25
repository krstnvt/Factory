/* Write the code for the chicken factory.
The factory has chickens from 4 different countries, each country has its own number of eggs per month.
The getHen method must be implemented in the HenFactory class and return the chicken type for the country passed to it.
 */

public class Solution {
    public static void main(String[] args)
    {
        Hen hen = HenFactory.getHen(Country.NETHERLANDS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory
    {

        static Hen getHen(String country) {
            Hen hen = null;

            switch (country)
            {
                case Country.NETHERLANDS:
                    hen = new DutchHen();
                    break;
                case Country.LATVIA:
                    hen = new LatvianHen();
                    break;
                case Country.ESTONIA:
                    hen = new EstonianHen();
                    break;
                case Country.POLAND:
                    hen = new PolishHen();
                    break;
            }
            return hen;
        }
    }
}
