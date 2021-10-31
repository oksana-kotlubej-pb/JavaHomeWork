package com.pb.kotlubej.hw5;
public class Library {
    public static void main(String[] args) {
        Book [] books = new Book [] { new Book("Приключения ", "Иванов И.И.", 2000),
                new Book ("Словарь ", "Сидоров А.В.", 2005),
                new Book("Энциклопедия ", "Петров С.П.", 2010)};
        System.out.println("Все книги");
        for (int i = 0; i<books.length; i++)
        {
            System.out.println(books[i].getTitle()+ ", "+ books[i].getAuthor()+ ", "+ books[i].getYear());
        }
        Reader [] readers = new Reader[] { new Reader("Шевченко О.П. ", "GF123 ", "Enegy ",
                "01.02.2000 ", "380991234569"),
                new Reader("Сидоренко В.Р. ", "GF456 ", "FIT ",
                        "01.08.2001 ", "380671234569"),
                new Reader("Пархоменок С.М. ", "GF789 ", "Economy ",
                        "01.06.2002 ", "380951234569")};
        System.out.println("Все читатели");
        for (int i = 0; i<readers.length; i++)
        {
            System.out.println(readers[i].getName()+ ", "+readers[i].getTicket()+ ", "+readers[i].getCollege()+
                    ", "+ readers[i].getDate()+ ", "+readers[i].getPhone());
        }
        for (int i = 0; i<readers.length; i++)
        {
            readers[i].takeBook(books.length, readers[i].getName());
        }
        for (int i = 0; i<readers.length; i++)
        {
            String [] books_title = new String[books.length];
            for (int j = 0; j< books.length; j++){
                books_title[j]= books[j].getTitle();
                }
            readers[i].takeBook(books_title, readers[i].getName());
        }
        for (int i = 0; i<readers.length; i++)
        {
            readers[i].takeBook(books, readers[i].getName());
        }
        for (int i = 0; i<readers.length; i++)
        {
            readers[i].returnBook(books.length, readers[i].getName());
        }
        for (int i = 0; i<readers.length; i++)
        {
            String [] books_title = new String[books.length];
            for (int j = 0; j< books.length; j++){
                books_title[j]= books[j].getTitle();
            }
            readers[i].returnBook(books_title, readers[i].getName());
        }
        for (int i = 0; i<readers.length; i++)
        {
            readers[i].returnBook(books, readers[i].getName());
        }
    }

}

