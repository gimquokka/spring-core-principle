package inflearn.spring_core_principle_basic.member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId);
}
