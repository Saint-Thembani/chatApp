/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;
/**
 *
 * @author rethe
 */
public class MessageData {

    String messageID;
    String recipient;
    String message;
    String messageHash;

    public MessageData(String messageID,
                       String recipient,
                       String message,
                       String messageHash) {

        this.messageID = messageID;
        this.recipient = recipient;
        this.message = message;
        this.messageHash = messageHash;
    }
}