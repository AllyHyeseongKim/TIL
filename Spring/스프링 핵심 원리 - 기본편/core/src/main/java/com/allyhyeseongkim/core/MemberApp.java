package com.allyhyeseongkim.core;

import com.allyhyeseongkim.core.member.Grade;
import com.allyhyeseongkim.core.member.Member;
import com.allyhyeseongkim.core.member.MemberService;
import com.allyhyeseongkim.core.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());
    }
}
