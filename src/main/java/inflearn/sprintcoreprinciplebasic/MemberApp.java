package inflearn.sprintcoreprinciplebasic;

import inflearn.sprintcoreprinciplebasic.member.Grade;
import inflearn.sprintcoreprinciplebasic.member.Member;
import inflearn.sprintcoreprinciplebasic.member.MemberService;
import inflearn.sprintcoreprinciplebasic.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();

        Member member = new Member(1L, "김진영", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(member.getId());
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());
        System.out.println(member == findMember);

    }
}
