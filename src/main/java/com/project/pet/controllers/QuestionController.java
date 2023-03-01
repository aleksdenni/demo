/*
package com.project.pet.controllers;

import com.project.pet.model.Question;
import com.project.pet.repo.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionController {
    private QuestionRepository questionRepository;

    @Autowired
    public QuestionController(QuestionRepository questionRepository){
        this.questionRepository = questionRepository;
    }

    @GetMapping("/question/all")
    public List<Question> allQuestions(){
        return questionRepository.findAll();
    }
}
*/
