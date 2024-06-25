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

    public String getName() { //상품명을 반환해야 한다. 상품명도 출력해야 하기 때문
        return name; //ShoppingCart 클래스에 호출
    }

    public int getTotalPrice() { //이름과 마찬가지로 합계도 출력해야 함
        return price * quantity; //ShoppingCart 클래스에서 호출
    }
}
