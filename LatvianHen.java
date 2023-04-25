public class LatvianHen extends Hen {

    String getDescription()
    {
        return super.getDescription() + String.format("My country is %s. My capacity is %d eggs per month.",
                Country.LATVIA,
                getCountOfEggsPerMonth());
    }
    @Override
    int getCountOfEggsPerMonth()
    {
        return 298;
    }
}
