package inflearn.sprintcoreprinciplebasic.order;

import inflearn.sprintcoreprinciplebasic.discount.DiscountPolicy;
import inflearn.sprintcoreprinciplebasic.discount.FixDiscountPolicy;
import inflearn.sprintcoreprinciplebasic.member.Member;
import inflearn.sprintcoreprinciplebasic.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private MemoryMemberRepository memberRepository = new MemoryMemberRepository();
    private DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
