package hello.core.member;

public class MemberServiceImpl implements MemberService {

    // 어떤 구현 객체가 주입될지는 AppConfig에서 정해짐
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
