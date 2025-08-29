# Movie Ticket Sales Application

> **Note:** This project was created during my early stage of learning Java.  
> It focuses on practicing basic Java concepts and Swing (`JOptionPane`) dialogs.  

---

## Overview

A simple Java Swing application for calculating movie ticket sales, gross amount, donations, and net sales.  
This program uses `JOptionPane` dialogs for input/output instead of console input.

---

## Features

- Input movie name, ticket prices, number of tickets sold, and donation percentage.
- Calculates:
  - Gross amount
  - Total tickets sold
  - Amount donated to charity
  - Net sale amount
- Displays the results in a user-friendly dialog box.

---

## How It Works

1. User enters:
   - Movie name
   - Adult ticket price
   - Child ticket price
   - Number of adult tickets sold
   - Number of child tickets sold
   - Percentage of gross amount to donate

2. The application:
   - Converts input strings to `double` or `int` as needed.
   - Computes:
     - **Gross Amount** = (Adult Price × Adult Tickets Sold) + (Child Price × Child Tickets Sold)
     - **Amount Donated** = (Gross Amount × Donation %) ÷ 100
     - **Net Sale Amount** = Gross Amount − Amount Donated
     - **Total Tickets Sold** = Adult Tickets + Child Tickets

3. The result is displayed using a `JOptionPane` information dialog.

---

## Code Snippet

```java
double grossAmount = adultTicketPrice * no0fAdultTicketsSold 
                   + childTicketPrice * noOfChildTicketsSold;

double amountDonated = grossAmount * percentDonation / 100;
double netSaleAmount = grossAmount - amountDonated;
int totalTicketSold = no0fAdultTicketsSold + noOfChildTicketsSold;
```

---

## Requirements

- Java Development Kit (JDK) 8 or higher

---

## How to Run

1. Save the file as `movie_ticket_sales.java` inside `movieticketsales` package folder.
2. Compile:
   ```bash
   javac movieticketsales/movie_ticket_sales.java
   ```
3. Run:
   ```bash
   java movieticketsales.movie_ticket_sales
   ```

---

## Sample Output

```
Movie Name: Avengers: Endgame
Number of Tickets Sold: 150
Gross Amount: $2000.00
Percentage of Gross Amount Donated: 10
Amount Donated: $200.00
Net Sale: $1800.00
```

---

## Notes

- This is a basic application meant for learning purposes.  
- Ensure that valid numeric inputs are entered where required, or the program will throw an exception.  
- You can extend it to store sales in files or databases.

---
