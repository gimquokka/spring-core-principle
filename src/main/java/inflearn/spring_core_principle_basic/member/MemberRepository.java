package inflearn.spring_core_principle_basic.member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);
}
