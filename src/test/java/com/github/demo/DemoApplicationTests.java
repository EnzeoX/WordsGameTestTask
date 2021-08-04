package com.github.demo;

import com.github.service.WordService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.github.demo.MockData.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@ExtendWith(SpringExtension.class)
class DemoApplicationTests {

    @InjectMocks
    private WordService wordService;

    @Test
    void getResult() {

        assertAll(
                () -> assertArrayEquals(expectedListOne, wordService.readValues(listOne).toArray()),
                () -> assertArrayEquals(expectedListTwo, wordService.readValues(listTwo).toArray()),
                () -> assertArrayEquals(expectedListThree, wordService.readValues(listThree).toArray()),
                () -> assertArrayEquals(expectedListFour, wordService.readValues(listFour).toArray())
        );
    }

}
