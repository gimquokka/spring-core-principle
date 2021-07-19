package inflearn.sprintcoreprinciplebasic;

import inflearn.sprintcoreprinciplebasic.member.Grade;
import inflearn.sprintcoreprinciplebasic.member.Member;
import inflearn.sprintcoreprinciplebasic.member.MemberService;
import inflearn.sprintcoreprinciplebasic.member.MemberServiceImpl;
import inflearn.sprintcoreprinciplebasic.order.Order;
import inflearn.sprintcoreprinciplebasic.order.OrderService;
import inflearn.sprintcoreprinciplebasic.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "김진영", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "떡볶이", 3000);

        System.out.println(order);


    }
}
