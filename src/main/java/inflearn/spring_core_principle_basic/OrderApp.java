package inflearn.spring_core_principle_basic;

import inflearn.spring_core_principle_basic.member.Grade;
import inflearn.spring_core_principle_basic.member.Member;
import inflearn.spring_core_principle_basic.member.MemberService;
import inflearn.spring_core_principle_basic.order.Order;
import inflearn.spring_core_principle_basic.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Long memberId = 1L;
        Member member = new Member(memberId, "김진영", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "떡볶이", 20000);

        System.out.println(order);


    }
}
