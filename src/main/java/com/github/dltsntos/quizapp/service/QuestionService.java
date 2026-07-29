package com.github.dltsntos.quizapp.service;

import com.github.dltsntos.quizapp.dao.QuestionDao;
import com.github.dltsntos.quizapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }


    public List<Question> getAllQuestionsByCategory(String category) {
        return  questionDao.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionDao.save(question);

        return "success";
    }
}
