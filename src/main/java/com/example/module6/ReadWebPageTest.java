package com.example.module6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class ReadWebPageTest {

    ReadWebPage reader = new ReadWebPage();

    @Test
    public void topWordsTestSuccess() throws IOException {
        //assertions
        //returns true upon success
        Assertions.assertTrue(reader.topWords());
    }

}