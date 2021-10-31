package com.pb.kotlubej.hw5;
import java.util.Arrays;
import java.util.stream.Collectors;
public class Reader {
    private String name;
    private String ticket;
    private String college;
    private String date;
    private String phone;
    public Reader (String name, String ticket, String college, String date, String phone) {
        this.name = name;
        this.ticket = ticket;
        this.college = college;
        this.date = date;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public String getTicket() {
        return ticket;
    }
    public String getCollege() {
        return college;
    }
    public String getDate() {
        return date;
    }
    public String getPhone() {
        return phone;
    }
    public void takeBook (int length, String name){
        System.out.println(name + "взял " + length + " книги");
    }
    public void takeBook (String [] title, String name){
        String titles = Arrays.stream(title).collect(Collectors.joining(","));
        System.out.println(name + "взял книги: " + titles);
    }
    public void takeBook (Book [] books_data, String reader_name){
        System.out.print(reader_name + "взял книги: ");
        for (int i = 0; i<books_data.length; i++)
        {
            System.out.print(books_data[i].getTitle()+ "("+ books_data[i].getAuthor()+ ", "+ books_data[i].getYear()+ "),");
        }
        System.out.print("\n");
    }
    public void returnBook (int length, String name){
        System.out.println(name + "вернул " + length + " книги");
    }
    public void returnBook (String [] title, String name){
        String titles = Arrays.stream(title).collect(Collectors.joining(","));
        System.out.println(name + "вернул книги: " + titles);
    }
    public void returnBook (Book [] books_data, String reader_name){
        System.out.print(reader_name + "вернул книги: ");
        for (int i = 0; i<books_data.length; i++)
        {
            System.out.print(books_data[i].getTitle()+ "("+ books_data[i].getAuthor()+ ", "+ books_data[i].getYear()+ "),");
        }
        System.out.print("\n");
    }
}
