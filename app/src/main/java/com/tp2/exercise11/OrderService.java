package com.tp2.exercise11;

public class OrderService {

    public void updateStatus(OrderStatus status) {
        switch (status) {
            case Pending ignored:
                System.out.println("O pedido está pendente.");
                break;
            case Processing ignored:
                System.out.println("O pedido está sendo processado.");
                break;
            case Sent ignored:
                System.out.println("O pedido foi enviado.");
                break;
            case Delivered ignored:
                System.out.println("O pedido foi entregue.");
                break;
        }
    }
}