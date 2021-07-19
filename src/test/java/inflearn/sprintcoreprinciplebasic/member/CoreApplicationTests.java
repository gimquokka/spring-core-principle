package inflearn.sprintcoreprinciplebasic.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoreApplicationTests {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        //given
        Member member = new Member(1L, "김진영", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(member.getId());

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
