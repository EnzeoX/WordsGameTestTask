package com.github.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WordService {

    public List<String> readValues(String[] data) {
        ArrayList<String> listOfAcceptedWords = new ArrayList<>();
        if (data.length == 1 && !(data[0].isBlank() || data[0].isEmpty())) {
            listOfAcceptedWords.add(data[0]);
            return listOfAcceptedWords;
        }
        for (int i = 0; i < data.length - 1; i++) {
            String nextWord = data[i + 1];
            int listSize = listOfAcceptedWords.size();
            if (listOfAcceptedWords.isEmpty()) {
                String word = data[i];
                if (word.isBlank() || word.isEmpty()) {
                    return listOfAcceptedWords;
                } else {
                    listOfAcceptedWords.add(word);
                }
            }
            if (nextWord.isBlank() || nextWord.isEmpty()) {
                return listOfAcceptedWords;
            } else {
                int listSizeModifier = 1;
                if (listSize == 0) listSizeModifier = 0;
                if (listOfAcceptedWords.get(listSize - listSizeModifier).endsWith(String.valueOf(nextWord.charAt(0)))) {
                    listOfAcceptedWords.add(nextWord);
                } else {
                    return listOfAcceptedWords;
                }
            }
        }
        return listOfAcceptedWords;
    }
}
