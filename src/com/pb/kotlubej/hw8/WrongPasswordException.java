package com.pb.kotlubej.hw8;

public class WrongPasswordException extends Throwable {
    private final String password;
    public WrongPasswordException(String password)
        {
            this.password = password;
        }
        public String getPassword() {
            return password;
        }
    }

