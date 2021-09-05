package com.syntax.class25;

public abstract class File {
    public abstract void open();
    public void edit(){
        System.out.println("Edit the file");
    }
    public void close(){
        System.out.println("Close the file");
    }
}
class JavaFile extends File {
    @Override
    public void open() {
        System.out.println("To open .java file Notepad++ is needed");
    }
}
class WordFile extends File {
    @Override
    public void open() {
        System.out.println("To open .doc file Microsoft Word is needed");
    }
}
class PdfFile extends File {
    @Override
    public void open() {
        System.out.println("To open .pdf file Adobe Reader is needed");
    }
}
