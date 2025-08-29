package swim.pointshop.member.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MemberTest {

    @Test
    public void 멤버_이름_테스트() {
        // given
        Member member = new Member("memberA");

        // when
        String newName = "memberB";
        member.changeName(newName);

        // then
        assertThat(member.getName()).isEqualTo(newName);
    }

}