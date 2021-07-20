package inflearn.spring_core_principle_basic;

import inflearn.spring_core_principle_basic.member.Grade;
import inflearn.spring_core_principle_basic.member.Member;
import inflearn.spring_core_principle_basic.member.MemberService;
import inflearn.spring_core_principle_basic.order.Order;
import inflearn.spring_core_principle_basic.order.OrderService;

public class OrderApp {
    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "김진영", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "떡볶이", 3000);

        System.out.println(order);


    }
}
