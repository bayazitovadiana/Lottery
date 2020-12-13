package com.diana_bayazitova;

import java.util.Date;

public class Ticket {
    boolean inGame;
    String EAN13;
    String QR;
    String  numberOfTicket;
    String numberOfEdition;
    Date dateOfLottery;
    int [][] field_1 = new int [3][9];
    int [][] field_2 = new int [3][9];
    int [] first_field_1;
    int [] first_field_2;
    int [] second_field_1;
    int [] second_field_2;
    int [] third_field_1;
    int [] third_field_2;
    int [] total_field;
    //конструктор билета
    Ticket(String numberOfEdition, String numberOfTicket, Date dateOfLottery){
        this.numberOfTicket = numberOfTicket;
        this.dateOfLottery = dateOfLottery;
        this.numberOfEdition = numberOfEdition;
    }
    //создание общего массива  из 30 случайных чисел из общего массива всех 90 чисел
    public void total_field_create(Lottery lottery){
this.total_field=lottery.createTicketField();
    }
}
