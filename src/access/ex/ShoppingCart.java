package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    //TODO 나머지 코드를 완성해라.
    public void addItem(Item item) { //Item 클래스의 데이터들을 써야함
        //Item배열에 등록 필요, itemCount 처리
        //10개 초과 등록시 "장바구니가 가득 찼습니다." 출력

        if (itemCount >= items.length) {
            System.out.println("장바구니 가득 찼습니다.");
            return;
        }
        items[itemCount] = item; //인자로 들어온 값을 배열에 itemCount와 같은 인덱스로 저장
        itemCount++; //호출할 때마다 카운트
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) { //배열만큼 돌면 안 됨, null이 들어가있어서
            Item item = items[i];
            System.out.println("상품명 : " + item.getName() + ", 합계 : " +
                    item.getTotalPrice());
            //어떻게 호출할 때마다 그에 맞는 이름과 가격이 나올까 했는데,
            //for문 안에서 객체를 생성하기 때문이다. 즉 각각의 참조값이 계속 생성되는 것
            //마늘 정보가 담긴 건 주소가 x001, 상추 정보가 담긴 건 주소가 x002 이런식으로.
        }
        System.out.println("전체 가격 합 : " + calculateTotalPrice());
    }
    //합계 계산 메소드를 왜 따로 뽑아놨을까?
    //displayItems() 메소드에서 해도 되지만, 캡슐화의 특성을 고려한 것이다.
    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
