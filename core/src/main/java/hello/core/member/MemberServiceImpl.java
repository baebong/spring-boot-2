package hello.core.member;

public class MemberServiceImpl implements MemberService {

    // Service가 회원을 찾기 위해 MemberRepository를 살펴보고 메소드를 불러옴
    // 그런데 MemberRepository는 역할만 담당하고 구현할 기능은 없음
    // 따라서 구현체인 MemoryMemberRepository() 객체가 타입을 MemberRepository 받아 생성됨
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
