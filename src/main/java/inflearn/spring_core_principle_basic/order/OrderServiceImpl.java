package inflearn.spring_core_principle_basic.order;

import inflearn.spring_core_principle_basic.discount.DiscountPolicy;
import inflearn.spring_core_principle_basic.member.Member;
import inflearn.spring_core_principle_basic.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private MemoryMemberRepository memberRepository;
    private DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemoryMemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
