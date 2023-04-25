public class PolishHen extends Hen {

    String getDescription()
    {
        return super.getDescription() + String.format("My country is %s. My capacity is %d eggs per month.",
                Country.POLAND,
                getCountOfEggsPerMonth());
    }
    @Override
    int getCountOfEggsPerMonth()
    {
        return 400;
    }
}
