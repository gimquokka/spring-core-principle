package inflearn.spring_core_principle_basic.order;

import inflearn.spring_core_principle_basic.member.Grade;
import inflearn.spring_core_principle_basic.member.Member;
import inflearn.spring_core_principle_basic.member.MemberService;
import inflearn.spring_core_principle_basic.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "김진영", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "떡볶이", 3000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
