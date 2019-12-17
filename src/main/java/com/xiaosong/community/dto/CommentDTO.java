package com.xiaosong.community.dto;

import com.xiaosong.community.model.User;
import lombok.Data;

@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private String content;
    private Integer commentCount;
    private Long likeCount;
    private Long gmtCreate;
    private Long gmtModified;
    private User user;
}
