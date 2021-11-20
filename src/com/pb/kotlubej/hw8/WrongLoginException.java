package com.pb.kotlubej.hw8;

public class WrongLoginException extends Throwable {
    private String login;
    public WrongLoginException(String login)
    {
        this.login = login;
    }
    public String getLogin() {
        return login;
    }

}
