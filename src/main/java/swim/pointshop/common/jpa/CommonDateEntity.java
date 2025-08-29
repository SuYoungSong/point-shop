package swim.pointshop.common.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@MappedSuperclass
public class CommonDateEntity {
    @CreatedDate
    @Column(updatable = false, columnDefinition = "DATETIME")
    private LocalDateTime createdDate;

    @LastModifiedDate
    @Column(columnDefinition = "DATETIME")
    private LocalDateTime updateDate;
}
