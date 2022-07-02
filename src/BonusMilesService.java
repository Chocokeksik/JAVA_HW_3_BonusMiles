public class BonusMilesService {

    public int calculate(int price) {

        int spend = 20; //рублей за милю

        int miles = price / spend;

        return miles;
    }

}
