package inflearn.spring_core_principle_basic;

import inflearn.spring_core_principle_basic.discount.DiscountPolicy;
import inflearn.spring_core_principle_basic.discount.FixDiscountPolicy;
import inflearn.spring_core_principle_basic.member.MemberRepository;
import inflearn.spring_core_principle_basic.member.MemberService;
import inflearn.spring_core_principle_basic.member.MemberServiceImpl;
import inflearn.spring_core_principle_basic.member.MemoryMemberRepository;
import inflearn.spring_core_principle_basic.order.OrderService;
import inflearn.spring_core_principle_basic.order.OrderServiceImpl;

public class AppConfig {

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }

}
