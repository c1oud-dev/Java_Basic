package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    //TODO 나머지 코드를 완성해라.
    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //이름과 합계를 반환해야 하기 때문에 아래와 같이 만들어야 함
    public String getName() {
        return name;
    }
    public int getTotalPrice() {
        return price * quantity;
    }
}
