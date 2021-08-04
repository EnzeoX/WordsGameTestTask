package com.github.controller;

import com.github.entity.WordsEntity;
import com.github.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WordsController {

    private final WordService wordService;

    @Autowired
    public WordsController(WordService wordService) {
        this.wordService = wordService;
    }

    @PostMapping(value = "/getresult")
    public List<String> returnResult(@NonNull @RequestBody WordsEntity data) {
        if (data.getWord().length == 0)
            return new ArrayList<>();
        return wordService.readValues(data.getWord());
    }

    @ExceptionHandler
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Incorrect data to work with")
    public void logError() {
    }
}
