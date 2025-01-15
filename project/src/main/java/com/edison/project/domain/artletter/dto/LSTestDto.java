package com.edison.project.domain.artletter.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class LSTestDto<T> {
    private boolean isSuccess; // 성공 여부
    private int code;          // 상태 코드
    private String message;    // 메시지
    private T result;          // 결과 데이터 (제네릭)
}
