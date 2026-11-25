package com.monolithic.quizapp.service;

import com.monolithic.quizapp.dao.QuestionDao;
import com.monolithic.quizapp.dao.QuizDao;
import com.monolithic.quizapp.model.Questions;
import com.monolithic.quizapp.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;
    @Autowired
    private QuestionDao questionDao;


    public ResponseEntity<String> createQuiz(String category, int numQ, String questionTitle) {

        List<Questions> questions = questionDao.findRandomQuestionsByCategory(category, numQ);

        Quiz quiz = new Quiz();
        quiz.setQuestionTitle(questionTitle);
        quiz.setQuestion(questions);
        quizDao.save(quiz);

        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }
}
