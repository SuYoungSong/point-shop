package swim.pointshop.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swim.pointshop.member.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
