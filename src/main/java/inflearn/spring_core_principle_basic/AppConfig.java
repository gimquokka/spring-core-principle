package inflearn.spring_core_principle_basic;

import inflearn.spring_core_principle_basic.discount.DiscountPolicy;
import inflearn.spring_core_principle_basic.discount.FixDiscountPolicy;
import inflearn.spring_core_principle_basic.member.MemberRepository;
import inflearn.spring_core_principle_basic.member.MemberService;
import inflearn.spring_core_principle_basic.member.MemberServiceImpl;
import inflearn.spring_core_principle_basic.member.MemoryMemberRepository;
import inflearn.spring_core_principle_basic.order.OrderService;
import inflearn.spring_core_principle_basic.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
//        return new RateDiscountPolicy();
    }

}
