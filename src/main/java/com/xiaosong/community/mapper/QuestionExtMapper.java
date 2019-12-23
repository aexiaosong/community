package com.xiaosong.community.mapper;

import com.xiaosong.community.dto.QuestionQueryDTO;
import com.xiaosong.community.model.Question;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionExtMapper {
    int incView(Question record);
    int incCommentCount(Question record);
    List<Question> selectRelated(Question question);
    Integer countBySearch(QuestionQueryDTO questionQueryDTO);
    List<Question> selectBySearch(QuestionQueryDTO questionQueryDTO);
}