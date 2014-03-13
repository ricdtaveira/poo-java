package br.ifce.poo.aula10.enumeration.ex03;

public enum Book {

    // declare constants of enum type
    JHTP6("Java How to Program 6e", "2005"),
    CHTP4("C How to Program 4e", "2004"),
    IW3HTP3("Internet & World Wide Web How to Program 3e", "2004"),
    CPPHTP4("C++ How to Program 4e", "2003"),
    VBHTP2("Visual Basic .NET How to Program 2e", "2002"),
    CSHARPHTP("C# How to Program", "2002");
    // instance fields
    private  final String title; // book title
    private  final String copyrightYear; // copyright year

    // enum constructor
    Book(String bookTitle, String year) {
        title = bookTitle;
        copyrightYear = year;
    } // end enum Book constructor

    // accessor for field title
    public String getTitle() {
        return title;
    } // end method getTitle

    // accessor for field copyrightYear
    public String getCopyrightYear() {
        return copyrightYear;
    } // end method getCopyrightYear
} // end enum Book

