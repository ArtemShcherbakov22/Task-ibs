public interface IBox {
    void addCandy(Candies candy);
    void deleteLastCandy();
    void deleteCandyByIndex(Integer index);
    int getWeight();
    double getPrice();
    String getInfo();

}
