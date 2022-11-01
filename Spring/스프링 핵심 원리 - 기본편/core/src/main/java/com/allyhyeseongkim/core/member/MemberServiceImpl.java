package com.allyhyeseongkim.core.member;

public class MemberServiceImpl implements MemberService {

    // MemberServiceImpl은 추상화(MemberRepository)에도 의존하고, 구현체(MemoryMemberRepository)에도 의존한다.
    // -> OCP, DIP 위반
    // private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        this.memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return this.memberRepository.findById(memberId);
    }
}
