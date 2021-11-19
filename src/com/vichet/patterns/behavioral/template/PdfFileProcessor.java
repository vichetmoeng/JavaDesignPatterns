package com.vichet.patterns.behavioral.template;

public class PdfFileProcessor extends FileProcessor{
    @Override
    public void writeFile() {
        System.out.println("Writing to a PDF file ...");
    }

    @Override
    public void readFile() {
        System.out.println("Reading to a PDF file ...");
    }
}
