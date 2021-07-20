package inflearn.spring_core_principle_basic.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
