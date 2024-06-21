package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    //사용자가 어떤 제품을 주문하는지 알기 위함
    //public은 이 생성자를 아무데서나 호출할 수 있도록 공개한다는 뜻
    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
