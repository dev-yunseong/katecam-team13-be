package com.b4f2.pting.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record KakaoUserInfoResponse(

    @JsonProperty("id")
    Long id
) {

}
