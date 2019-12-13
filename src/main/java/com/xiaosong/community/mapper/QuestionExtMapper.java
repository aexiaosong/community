package com.xiaosong.community.mapper;

import com.xiaosong.community.model.Question;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionExtMapper {
    void incView(Question record);
}