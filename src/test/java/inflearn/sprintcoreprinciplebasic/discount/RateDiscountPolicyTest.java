package inflearn.sprintcoreprinciplebasic.discount;

import inflearn.sprintcoreprinciplebasic.member.Grade;
import inflearn.sprintcoreprinciplebasic.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RateDiscountPolicyTest {

    DiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다.")
    void vip_o() {
        // Given
        Member member = new Member(1L, "김진영", Grade.VIP);

        // When
        int discount = discountPolicy.discount(member, 10000);

        // Then
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("일반인은 10% 할인이 적용되면 안된다")
    void vip_x() {
        // Given
        Member member = new Member(2L, "이은지", Grade.BASIC);

        // When
        int discount = discountPolicy.discount(member, 10000);

        // Then
        assertThat(discount).isNotEqualTo(1000);
    }
}