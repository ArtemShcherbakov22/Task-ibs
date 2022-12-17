import java.util.ArrayList;

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
    void optimizedByPrice(double bound){
        if ( getPrice()<bound ){
            return;
        }
        while ((candies.size()>0)||(getPrice()>bound)){
            Candies temp = candies.get(0);
            for (Candies de:candies
                 ) {
                if (de.getPrice()<temp.getPrice()){
                    temp=de;
                }
            }
            candies.remove(temp);
        }
    }
    void optimizedByWeight(double bound) {
        if (getWeight() < bound) {
            return;
        }
        while ((candies.size() > 0) || (getWeight() > bound)) {
            Candies temp = candies.get(0);
            for (Candies de : candies
            ) {
                if (de.getWeight() < temp.getWeight()) {
                    temp = de;
                }
            }
            candies.remove(temp);
        }
    }

}