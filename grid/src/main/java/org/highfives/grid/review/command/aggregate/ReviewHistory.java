package org.highfives.grid.review.command.aggregate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="member_review_history")
@Getter
@RequiredArgsConstructor
@ToString
public class ReviewHistory {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "content",length = 511, nullable = false)
    private String content;

    @Column(name = "review_status", nullable = false)
    private String reviewStatus;

    @Column(name = "write_time", nullable = false)
    private String writeTime;

    @Column(name = "year", nullable = false)
    private int year;

    @Column(name = "quarter", nullable = false)
    private int quarter;

    @Column(name = "reviewer_id", nullable = false)
    private int reviewerId;

    @Column(name = "reviewee_id", nullable = false)
    private int revieweeId;

}
