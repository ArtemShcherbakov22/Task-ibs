public interface IBox {
    void addCandy(Candies candy);
    void deleteLastCandy();
    void deleteCandyByIndex(Integer index);
    int getWeight();
    double getPrice();
    String getInfo();
    void reduceWeight(double weight);
    void reducePrice(double price);
    //void prepareGift();
    int getAllWeight();
    double getAllPrice();
}
