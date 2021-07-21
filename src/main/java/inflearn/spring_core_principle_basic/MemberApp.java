package inflearn.spring_core_principle_basic;

import inflearn.spring_core_principle_basic.member.Grade;
import inflearn.spring_core_principle_basic.member.Member;
import inflearn.spring_core_principle_basic.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "김진영", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(member.getId());
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());
        System.out.println(member == findMember);
    }
}
