package com.allyhyeseongkim.core.order;

import com.allyhyeseongkim.core.member.Grade;
import com.allyhyeseongkim.core.member.Member;
import com.allyhyeseongkim.core.member.MemberService;
import com.allyhyeseongkim.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        this.memberService.join(member);

        Order order = this.orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
