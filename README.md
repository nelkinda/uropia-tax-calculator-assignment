# Nelkinda Uropia Tax Kata

The Uropia Tax Kata is a kata by Nelkinda Software Craft for calculating bills and receipts in the fictional country Uropia.

## Requirements
On each purchase, the government of Uropia imposes a variety of taxes and deposits that depend on several criteria.
The taxes are cumulative.

### Price shown to customer
The price shown to the customer must always be the gross price, including all taxes and deposits.
Taxes are rounded mathematically.
Taxes apply per item.

### Sales Tax
The sales tax depends on the category of the article.
The following sales taxes apply:
* educational material (books etc), food (all organic food; processed foods with a sugar content <10g/kg), medical, electronics: 0%
* luxury items (cars; processed foods with sugar content >=10g/kg) : 50%
* everything else 10%

### Environment Deposit
The environment deposit is a deposit buyers make at the time of the purchase that will be refunded when they return the product to the shop for recycling.
The environment deposit is not taxed.
* electronics: 40% of the net price
* recycling containers (bottles, cans, tins, etc): €0.50

## Examples

### Purchase 1
Basket
```
1 e-book "XP 2.0" @ €12.49
1 bar of chocolate @ €2.25 (package weight 2g)
```

Receipt
```
1 e-book "XP 2.0" 12.50
1 bar of choc  2.25

Total:            14.75

Sales Tax 50%:     0.75

```

### Purchase 2
Basket
```
5 cans of coke @ €0.99
1 bar of chocolate @ €2.25 (package weight 2g)
```

Receipt
```
5 coke (can)      1.49
                   7.45
1 bar of choc     2.25
                   
Total:            9.70

Deposit:           2.50
Sales Tax 50%:     2.40
```

## Expected Outcome
* The above examples (specifications) should be converted into executable tests using Cucumber and Gherkin.
* The solution should be developed using TDD, BDD, 4 rules of simple design. Jacoco is provided in the above template to measure the code coverage.
* Static code analysis tools are enabled by default to ensure good code quality.
* Makefile is provided as a wrapper for Gradle with all essential commands to build, test and run the code. Feel free to modify it as per your requirement.

## Tools / Tech Stack

### Backend
* Programming Language: Java (Java 15)
* Build Tool: Gradle
* Verification Tools: Checkstyle, PMD, SonarLint, JUnit, Cucumber, Jacoco, PiTest, SonarQube


© 2021 Nelkinda Software Craft. All Rights Reserved.
