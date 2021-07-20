package inflearn.spring_core_principle_basic.discount;

import inflearn.spring_core_principle_basic.member.Grade;
import inflearn.spring_core_principle_basic.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private double discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            System.out.println(discountPercent);
            return (int) (price * (discountPercent / 100D));
        } else {
        }
        return 0;
    }
}