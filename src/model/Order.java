package model;

import java.util.Objects;

public class Order {
    private Long userId;
    private Long productId;

    public Order(Long productId, Long userId) {
        this.productId = productId;
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(userId, order.userId) && Objects.equals(productId, order.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, productId);
    }


}
