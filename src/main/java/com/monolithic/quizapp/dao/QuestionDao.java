package com.monolithic.quizapp.dao;

import com.monolithic.quizapp.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends JpaRepository<Questions, Integer> {
}
