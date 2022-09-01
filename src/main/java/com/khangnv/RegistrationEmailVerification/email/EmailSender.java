package com.khangnv.RegistrationEmailVerification.email;

public interface EmailSender {
    void send(String to, String email);
}
