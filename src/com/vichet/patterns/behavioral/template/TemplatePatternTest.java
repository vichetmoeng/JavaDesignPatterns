package com.vichet.patterns.behavioral.template;

public class TemplatePatternTest {
    public static void main(String[] args) {

        FileProcessor wordFileProcessor = new WordFileProcessor();
        wordFileProcessor.processFile(); // call template method

        System.out.println("************************************");

        FileProcessor pdfFileProcessor = new PdfFileProcessor();
        pdfFileProcessor.processFile(); // call template method
    }
}
