public abstract class Candies {
    private String name;
    private int weight;
    private double price;
    private String unique_parameter;

    @Override
    public String toString() {
        return "Candies{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", unique_parameter='" + unique_parameter + '\'' +
                '}';
    }

    public Candies () {
    this ("no name",0,0.0,"without unique");
}
    public Candies(String name, int weight, double price, String unique_parameter) {
    this.name=name;
    this.weight=weight;
    this.price=price;
    this.unique_parameter=unique_parameter;
    }
    public String getName (){
    return name;
    }

    public int getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getUnique_parameter() {
        return unique_parameter;
    }

}
