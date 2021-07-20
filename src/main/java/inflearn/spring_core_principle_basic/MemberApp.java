package inflearn.spring_core_principle_basic;

import inflearn.spring_core_principle_basic.member.Grade;
import inflearn.spring_core_principle_basic.member.Member;
import inflearn.spring_core_principle_basic.member.MemberService;

public class MemberApp {
    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();

        Member member = new Member(1L, "김진영", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(member.getId());
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());
        System.out.println(member == findMember);
    }
}
