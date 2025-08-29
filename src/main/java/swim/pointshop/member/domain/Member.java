package swim.pointshop.member.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import swim.pointshop.common.jpa.CommonDateEntity;

@Getter
@Entity
@NoArgsConstructor
public class Member extends CommonDateEntity {

    @Id @GeneratedValue
    private long id;
    private String name;

    public Member(String name) {
        this.name = name;
    }

    public void changeName(String name) {
        this.name = name;
    }
}
