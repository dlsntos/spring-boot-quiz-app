package com.github.dltsntos.quizapp.service;

import com.github.dltsntos.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

}
