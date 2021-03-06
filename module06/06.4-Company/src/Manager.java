public class Manager extends AbstractEmployee {

    private final static double LOWEST_MANAGER_SALARY = 74000;
    private final static double MAX_MANAGER_SALARY = 140000;

    private final static double MAX_EARN_MONEY = 200000.; //тут надо регулировать
    private final static double MANAGER_BONUS_PERCENT = .05;
    double earnedMoney;

    Manager(String name) {
        super(name);
        earnedMoney = Math.random() * MAX_EARN_MONEY; //сколько прибыли принёс
        setFixedSalary(LOWEST_MANAGER_SALARY, MAX_MANAGER_SALARY);
    }

    public static Manager createRandom(String name) {
        return new Manager(name);
    }

    @Override
    public double getMonthSalary() {
        return getFixedSalary() + earnedMoney * MANAGER_BONUS_PERCENT;
    }

}
