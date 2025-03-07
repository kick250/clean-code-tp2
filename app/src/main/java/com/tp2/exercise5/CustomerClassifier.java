package com.tp2.exercise5;

public class CustomerClassifier {
    public String classifyCustomer(Customer customer) {
        if (customer.isPremiumSenior()) return "Cliente Premium Sênior";

        if (customer.isRegularSenior()) return "Cliente Regular Sênior";

        if (customer.isSeniorLowIncome()) return "Cliente Sênior Baixa Renda";

        if (customer.isPremiumYoung()) return "Cliente Premium Jovem";

        if (customer.isRegularYoung()) return "Cliente Regular Jovem";

        if (customer.isYoungLowIncome()) return "Cliente Jovem Baixa Renda";

        throw new RuntimeException("Ocorreu um erro ao verificar o tipo de cliente.");
    }
}