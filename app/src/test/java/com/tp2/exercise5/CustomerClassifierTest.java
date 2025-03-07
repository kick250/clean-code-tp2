package com.tp2.exercise5;

import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerClassifierTest {

    @Test
    public void whenClientIsPremiumSenior_returnsCorrectValue() {
        Customer customer = new Customer(70, 6000.0, 20);
        CustomerClassifier classifier = new CustomerClassifier();

        assertEquals("Cliente Premium Sênior", classifier.classifyCustomer(customer));
    }

    @Test
    public void whenClientIsRegularSenior_returnsCorrectValue() {
        Customer customer = new Customer(70, 6000.0, 9);
        CustomerClassifier classifier = new CustomerClassifier();

        assertEquals("Cliente Regular Sênior", classifier.classifyCustomer(customer));
    }

    @Test
    public void whenClientIsSeniorLowIncome_returnsCorrectValue() {
        Customer customer = new Customer(70, 4000.0, 5);
        CustomerClassifier classifier = new CustomerClassifier();

        assertEquals("Cliente Sênior Baixa Renda", classifier.classifyCustomer(customer));
    }

    @Test
    public void whenClientIsPremiumYoung_returnsCorrectValue() {
        Customer customer = new Customer(20, 8000.0, 21);
        CustomerClassifier classifier = new CustomerClassifier();

        assertEquals("Cliente Premium Jovem", classifier.classifyCustomer(customer));
    }

    @Test
    public void whenClientIsRegularYoung_returnsCorrectValue() {
        Customer customer = new Customer(20, 8000.0, 19);
        CustomerClassifier classifier = new CustomerClassifier();

        assertEquals("Cliente Regular Jovem", classifier.classifyCustomer(customer));
    }

    @Test
    public void whenClientIsYoungLowIncome_returnsCorrectValue() {
        Customer customer = new Customer(20, 6000.0, 5);
        CustomerClassifier classifier = new CustomerClassifier();

        assertEquals("Cliente Jovem Baixa Renda", classifier.classifyCustomer(customer));
    }
}