package swim.pointshop.member.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import swim.pointshop.member.domain.Member;

import static org.assertj.core.api.Assertions.*;

@Transactional
@SpringBootTest
class MemberRepositoryTest {
    @Autowired
    private MemberRepository memberRepository;

    @BeforeEach
    public void init() {
        memberRepository.deleteAll();
    }

    @Test
    public void 멤버_저장_및_찾기() {
        // given
        Member memberA = memberRepository.save(new Member("memberA"));

        // when
        Member findMember = memberRepository.findById(memberA.getId())
                .orElseThrow(() -> new AssertionError("Member 찾을 수 없음"));

        // then
        assertThat(findMember).isEqualTo(memberA);
    }
}