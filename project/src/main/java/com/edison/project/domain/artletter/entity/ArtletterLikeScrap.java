package com.edison.project.domain.artletter.entity;

import com.edison.project.domain.member.entity.Member;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ArtletterLikes", uniqueConstraints = {
        @UniqueConstraint(name = "uq_artletter_member", columnNames = {"artletter_id", "member_id"})
}, indexes = {
        @Index(name = "idx_artletter_likes_artletter_id", columnList = "artletter_id"),
        @Index(name = "idx_artletter_likes_member_id", columnList = "member_id")
})
public class ArtletterLikeScrap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artletter_likes_id")
    private Long artletterLikesId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "artletter_id", nullable = false)
    private Artletter artletter;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Column(name = "is_liked", nullable = false)
    private Boolean isLiked; // true: 좋아요, false: 좋아요 취소

    @Column(name = "is_scrapped", nullable = false)
    private Boolean isScrapped; // true: 좋아요, false: 좋아요 취소
}
