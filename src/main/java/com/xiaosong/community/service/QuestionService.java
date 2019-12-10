package com.xiaosong.community.service;

import com.xiaosong.community.dto.PaginationDTO;
import com.xiaosong.community.dto.QuestionDTO;
import com.xiaosong.community.mapper.QuestionMapper;
import com.xiaosong.community.mapper.UserMapper;
import com.xiaosong.community.model.Question;
import com.xiaosong.community.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private UserMapper userMapper;

    public PaginationDTO list(Integer page, Integer size) {
        PaginationDTO paginationDTO = new PaginationDTO();
        Integer totalCount = questionMapper.count();
        paginationDTO.setPagination(totalCount, page, size);

        if (page < 1) page = 1;

        if (page > paginationDTO.getTotalPage()) page = paginationDTO.getTotalPage();

        Integer offset = size * (page - 1);
        List<Question> questions = questionMapper.list(offset, size);
        List<QuestionDTO> questionDTOSList = new ArrayList<>();

        for(Question question: questions) {
            User user = userMapper.findById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question, questionDTO);
            questionDTO.setUser(user);
            questionDTOSList.add(questionDTO);
        }

        paginationDTO.setQuestions(questionDTOSList);
        return paginationDTO;
    }
}
