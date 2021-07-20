package inflearn.spring_core_principle_basic.discount;

import inflearn.spring_core_principle_basic.member.Member;

public interface DiscountPolicy {

    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
