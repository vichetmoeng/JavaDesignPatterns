package com.vichet.patterns.behavioral.template;

public class WordFileProcessor extends FileProcessor{
    @Override
    public void writeFile() {
        System.out.println("Writing to a WORD file ...");
    }

    @Override
    public void readFile() {
        System.out.println("Reading to a WORD file ...");
    }
}
