package com.allyhyeseongkim.core.member;

import com.allyhyeseongkim.core.AppConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        this.memberService = appConfig.memberService();
    }

    @Test
    void join() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        this.memberService.join(member);
        Member findMember = this.memberService.findMember(1L);

        //then
        assertThat(member).isEqualTo(findMember);
    }
}
