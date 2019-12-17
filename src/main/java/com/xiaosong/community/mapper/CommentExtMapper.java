package com.xiaosong.community.mapper;

import com.xiaosong.community.model.Comment;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}
