#include <stdio.h>

int main(void)
{
    float amount_of_loan, interest_rate, monthly_payment;

    printf("Enter the initial amount of loan: ");
    scanf("%f", &amount_of_loan);
    printf("Enter the anual interest rate: ");
    scanf("%f", &interest_rate);
    interest_rate   =   (interest_rate / 100) / 12;
    printf("Enter monthly payment: ");
    scanf("%f", &monthly_payment);

    amount_of_loan  =   (amount_of_loan - monthly_payment + amount_of_loan * interest_rate);
    printf("Balance remaining after first payment: $%.2f\n", amount_of_loan);

    amount_of_loan  =   (amount_of_loan - monthly_payment + amount_of_loan * interest_rate);
    printf("Balance remaining after second payment: $%.2f\n", amount_of_loan);

    amount_of_loan  =   (amount_of_loan - monthly_payment + amount_of_loan * interest_rate);
    printf("Balance remaining after third payment: $%.2f\n", amount_of_loan);
}
