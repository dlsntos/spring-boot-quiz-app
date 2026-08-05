package com.github.dltsntos.quizapp.dao;

import com.github.dltsntos.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
