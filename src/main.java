
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    static ArrayList<String> drinkList = new ArrayList<String>();

    static Coffee espresso;
    static Coffee doubleEspresso;
    static Coffee cappuccino;
    static Coffee caffeLatte;
    static Coffee mocha;
    static Coffee americano;
    static Coffee hotWater;

    public static void main(String[] args) {
        setDrinks();
        setDrinkList();
        showDrinkList();

        int selectedDrinkId = getSelectedDrinkIdFromUser();
        showDrinkInfo(selectedDrinkId);
    }

    public static void showDrinkInfo(int selectedDrinkId) {

        if (selectedDrinkId == espresso.getCoffeeId()) {
            getEspressoInfo();

        } else if (selectedDrinkId == doubleEspresso.getCoffeeId()) {
            getDoubleEspressoInfo();

        } else if (selectedDrinkId == cappuccino.getCoffeeId()) {
            getCappuccinoInfo();

        } else if (selectedDrinkId == caffeLatte.getCoffeeId()) {
            getCaffeLatteInfo();

        } else if (selectedDrinkId == mocha.getCoffeeId()) {
            getMochaInfo();

        } else if (selectedDrinkId == americano.getCoffeeId()) {
            getAnmericanoInfo();

        } else if (selectedDrinkId == hotWater.getCoffeeId()) {
            getHotWaterInfo();
        }
    }

    public static void setDrinks() {

        espresso = new Coffee(1, "Espresso", 1,
                0, 0, 0, 0, 7);
        doubleEspresso = new Coffee(2, "Doube Espresso", 2,
                0, 0, 0, 0, 12);
        cappuccino = new Coffee(3, "Cappuccino", 1,
                0, 2, 2, 0, 12);
        caffeLatte = new Coffee(4, "Caffe Latte", 1,
                0, 3, 1, 0, 12);
        mocha = new Coffee(5, "Mocha", 1,
                0, 1, 1, 2, 13);
        americano = new Coffee(6, "Americano", 1,
                4, 0, 0, 0, 10);
        hotWater = new Coffee(7, "Hot Water", 0,
                1, 0, 0, 0, 3);
    }

    public static void setDrinkList() {

        drinkList.add(espresso.getCoffeeId() + ". "
                + espresso.getCoffeeName() + "(" + espresso.getCoffeePrice() + "₺)");
        drinkList.add(doubleEspresso.getCoffeeId() + ". "
                + doubleEspresso.getCoffeeName() + "(" + doubleEspresso.getCoffeePrice() + "₺)");
        drinkList.add(cappuccino.getCoffeeId() + ". "
                + cappuccino.getCoffeeName() + "(" + cappuccino.getCoffeePrice() + "₺)");
        drinkList.add(caffeLatte.getCoffeeId() + ". "
                + caffeLatte.getCoffeeName() + "(" + caffeLatte.getCoffeePrice() + "₺)");
        drinkList.add(mocha.getCoffeeId() + ". "
                + mocha.getCoffeeName() + "(" + mocha.getCoffeePrice() + "₺)");
        drinkList.add(americano.getCoffeeId() + ". "
                + americano.getCoffeeName() + "(" + americano.getCoffeePrice() + "₺)");
        drinkList.add(hotWater.getCoffeeId() + ". "
                + hotWater.getCoffeeName() + "(" + hotWater.getCoffeePrice() + "₺)");
    }

    public static void showDrinkList() {

        for (String s : drinkList) {
            System.out.println(s);
        }
        //for(int coffeeIndex = 0; coffeeIndex < drinkList.size(); coffeeIndex++) {
        //    System.out.println(drinkList.get(coffeeIndex));
        //}
    }

    public static int getSelectedDrinkIdFromUser() {

        System.out.print("Seçiminiz: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static void getEspressoInfo() {

        System.out.println(espresso.getCoffeeName() + " seçtiniz. Bu içeceğimiz " +
                espresso.getEspressoAmount() + " doz espresso içermektedir.");
    }

    public static void getDoubleEspressoInfo() {

        System.out.println(doubleEspresso.getCoffeeName() + " seçtiniz. Bu içeceğimiz " +
                doubleEspresso.getEspressoAmount() + " doz espresso içermektedir.");
    }

    public static void getCappuccinoInfo() {

        System.out.println(cappuccino.getCoffeeName() + " seçtiniz. Bu içeceğimiz " +
                cappuccino.getEspressoAmount() + " doz espresso, " +
                cappuccino.getSteamedMilkAmount() + " doz Steamed Milk ve " +
                cappuccino.getMilkFoamAmount() + " doz Milk Foam içermektedir.");
    }

    public static void getCaffeLatteInfo() {

        System.out.println(caffeLatte.getCoffeeName() + " seçtiniz. Bu içeceğimiz " +
                caffeLatte.getEspressoAmount() + " doz espresso, " +
                caffeLatte.getSteamedMilkAmount() + " doz Steamed Milk ve " +
                caffeLatte.getMilkFoamAmount() + " doz Milk Foam içermektedir.");
    }

    public static void getMochaInfo() {

        System.out.println(mocha.getCoffeeName() + " seçtiniz. Bu içeceğimiz " +
                mocha.getEspressoAmount() + " doz espresso, " +
                mocha.getSteamedMilkAmount() + " doz Steamed Milk, " +
                mocha.getMilkFoamAmount() + " doz Milk Foam, ve " +
                mocha.getHotChocolateAmount() + " doz Hot Chocolate içermektedir.");
    }

    public static void getAnmericanoInfo() {

        System.out.println(americano.getCoffeeName() + " seçtiniz. Bu içeceğimiz " +
                americano.getHotWaterAmount() + " doz sıcak su ve " +
                americano.getEspressoAmount() + " doz espresso içermektedir.");
    }

    public static void getHotWaterInfo() {

        System.out.println(hotWater.getCoffeeName() + " seçtiniz. Bu içeceğimiz " +
                hotWater.getHotWaterAmount() + " doz sıcak su içermektedir.");
    }
}
