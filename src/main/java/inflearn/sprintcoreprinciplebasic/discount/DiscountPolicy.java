package inflearn.sprintcoreprinciplebasic.discount;

import inflearn.sprintcoreprinciplebasic.member.Member;

public interface DiscountPolicy {

    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
