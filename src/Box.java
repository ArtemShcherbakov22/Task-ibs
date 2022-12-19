import java.util.ArrayList;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Box implements IBox{
    private ArrayList<Candies> candies=new ArrayList<>();
    @Override
    public void addCandy(Candies candy) {
        candies.add(candy);
    }

    @Override
    public void deleteLastCandy() {
        candies.remove(candies.size()-1);

    }
    @Override
    public void deleteCandyByIndex(Integer index) {
        candies.remove(index);

    }
    @Override
    public int getWeight() {
        int result=0;
        for (Candies sweets:candies
        ) {
            result+=sweets.getWeight();
        }
        return result;
    }

    @Override
    public double getPrice() {
        double result=0;
        for (Candies sweets:candies
        ) {
            result+=sweets.getPrice();
        }
        return result;
    }

    @Override
    public String getInfo() {
        StringBuilder result=new StringBuilder();
        for (Candies sweets:candies
        ) {
            result.append(sweets).append("\n");
        }
        return result.toString();
    }
    @Override
    public double getAllPrice() {
        int totalPrice = 0;
        for (Candies de : candies) {
            totalPrice += de.getPrice();
        }
        return totalPrice;
    }
        @Override
        public int getAllWeight() {
            int totalWeight = 0;
            for (Candies temp: candies) {
                totalWeight += temp.getWeight();
            }
            return totalWeight;
        }
    @Override
    public void reducePrice(double price) {
        int count = 0;
        double min = Double.MAX_VALUE;
        Candies minSweet = null;
        while (getAllPrice()>price) {
            for (Candies se : candies
            ) {
                if (se.getPrice()<min) {
                    min = se.getPrice();

                    minSweet = se;
                }
            }
            System.out.println("min price sweetness in gift: " + min);
            candies.remove(minSweet);
            min = Double.MAX_VALUE;
            if (minSweet != null) {
                System.out.println("sweetness removed: "+minSweet.getName());
            }
            count++;
        }
        System.out.println("Gift optimization completed successfully. removed  "+count+" sweets");

    }
    @Override
    public void reduceWeight(double weight) {
        int count = 0;
        double min = Double.MAX_VALUE;
        Candies minSweet = null;
        while (getAllWeight()>weight) {
            for (Candies de : candies
            ) {
                if (de.getWeight()<min) {
                    min = de.getWeight();

                    minSweet = de;
                }
            }
            System.out.println("min weight sweetness in gift: " + min);
            candies.remove(minSweet);
            min = Double.MAX_VALUE;
            if (minSweet != null) {
                System.out.println("sweetness removed: "+minSweet.getName());
            }
            count++;
        }

        System.out.println("Gift optimization completed successfully. removed  "+count+" sweets");
    }
}