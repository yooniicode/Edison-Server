package com.edison.project.domain.artletter.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class LSResultDto {
    private int likes;      // 해당 아트레터의 좋아요 총 개수
    private boolean isLiked; // 사용자가 해당 아트레터 좋아요 여부
}

