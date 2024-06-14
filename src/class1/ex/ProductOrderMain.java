package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder productOrder1 = new ProductOrder();
        ProductOrder productOrder2 = new ProductOrder();
        ProductOrder productOrder3 = new ProductOrder();

        //여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrders = {productOrder1, productOrder2, productOrder3};
        //ProductOrder[] productOrders = new ProductOrder[3];
        // 상품 주문 정보를 `ProductOrder` 타입의 변수로 받아 저장
        productOrder1.productName = "두부";
        //productOrders[0].productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;

        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;

        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;

        int sum = 0;
        for (ProductOrder po : productOrders) {
            System.out.println("상품명: " + po.productName + ", 가격: " + po.price +
                    ", 수량: " + po.quantity);
            sum += (po.price * po.quantity);
        }
        System.out.println("총 결제 금액: " + sum);
    }
}
