package com.xiaosong.community.dto;

import com.xiaosong.community.model.User;
import lombok.Data;

@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private Long creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private User user;
}
