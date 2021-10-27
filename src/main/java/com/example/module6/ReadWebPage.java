package com.example.module6;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class ReadWebPage {
    public void topWords () throws IOException {
        //get webpage
        URL url = new URL("https://www.gutenberg.org/files/1065/1065-h/1065-h.htm");

        //get content of webpage
        Scanner scanner = new Scanner(url.openStream());

        //result will be appended here
        StringBuffer sb = new StringBuffer();

        //iterate and append
        while (scanner.hasNext()){
            //scanner.next returns one word at a time
            sb.append(scanner.next()+" ");
        }

        //result containg website info
        String result = sb.toString();

        //replace &mdash and removes "" ! . ,
        String addDash = result.replaceAll("&mdash;", " ");
        String noPunct = addDash.replaceAll("[.“”!,?;]", "");

        //removed html tags
        String noTags = noPunct.replaceAll("<[^>]*>", "");

        //poem
        String poem = noTags.substring(1380, 7426);

        //iterate over poem and add to hashmap/hashtable
        Scanner poemScanner = new Scanner(poem);
        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();

        while(poemScanner.hasNext()){
            //does key exist in map?
            String key = poemScanner.next();

            if (wordCount.get(key) == null){
                //no: add key, value = 1
                wordCount.put(key, 1);
            } else if (wordCount.get(key) != null) {
                //yes: access key, add to value
                int value = wordCount.get(key);
                wordCount.replace(key, value + 1);
            }
        }

        //sort result
        //iterate through hashmap
        //if value > 0 (currentHighest) then this value is added to TreeMap?
        //do this 20 times

        TreeMap<Integer, String> sortedWords = new TreeMap<>(Collections.reverseOrder());

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());

            int currentHighest = 0;
            int currentValue = entry.getValue();

            if (currentValue > currentHighest){
                sortedWords.put(currentValue, entry.getKey());
                currentHighest = currentValue;
            }
        }

        //print top words
        System.out.println("Top Words: ");
        for (Map.Entry<Integer, String> entry : sortedWords.entrySet()) {
            System.out.println("Times used: " + entry.getKey() + " Word: " + entry.getValue());
        }

    }
}
