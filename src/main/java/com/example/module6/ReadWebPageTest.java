package com.example.module6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * <h1>Tests the functionality of ReadWebPage</h1>
 *
 * @author Diana Alcantara
 * @since 2021-11-18
 */

class ReadWebPageTest {

    ReadWebPage reader = new ReadWebPage();

    /**
     *This test returns true if topWords runs successfully
     */
    @Test
    public void topWordsTestSuccess() throws IOException {
        //assertions
        //returns true upon success
        Assertions.assertTrue(reader.topWords());
    }

}