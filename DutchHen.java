public class DutchHen extends Hen {

    String getDescription()
    {
        return super.getDescription() + String.format("My country is %s. My capacity is %d eggs per month.",
                Country.NETHERLANDS,
                getCountOfEggsPerMonth());
    }
    @Override
    int getCountOfEggsPerMonth()
    {
        return 455;
    }
}
