package com.monolithic.quizapp.service;

import com.monolithic.quizapp.dao.QuestionDao;
import com.monolithic.quizapp.model.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Questions> getQuestion() {
        return questionDao.findAll();
    }
}
