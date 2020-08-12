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
* educational material (books etc), food (all organic food; processed food with a sugar content <10g/kg), medical, electronics: 0%
* luxury items (cars; processed food with sugar content >=10g/kg) : 50%
* everything else 10%

### Import Tax
The import tax depends on the category of the article.
* food (all organic; processed food with a sugar content <10g/kg), medicine, electronics: 0% (exempt)
* everything else: 10%

### Environment Deposit
The environment deposit is a deposit buyers make at the time of the purchase that will be refunded when they return the product to the shop for recycling.
The environment deposit is not taxed.
* electronics: 40% of the net price
* recycling containers (bottles, cans, tins, etc): €0.50
(The country Uropia also has a tax for packaging, but that tax applies at import or manufacturing level, not sales level.)

## Examples

### Purchase 1
Basket
```
1 e-book "XP 2.0" @ €12.49
1 bar of imported chocolate @ €2.29 (package weight 2g)
```

Receipt
```
1 e-book "XP 2.0" 12.49
1 bar of imp choc  2.29

Total:            14.78

Sales Tax 50%:     0.72
Import Tax 10%:    0.14
```

### Purchase 2
Basket
```
5 cans of coke @ €0.99
5 cans of soda @ €0.49
```

Receipt
```
5 coke (can)      1.49
                   7.45
5 soda (can)      0.99
                   4.95

Total:            12.40

Deposit:           5.00
Sales Tax 50%:     1.65
```

## Expected Outcome
* The above examples (specifications) should be converted into executable tests using Cucumber and Gherkin.
* The solution follows 4 Rules of Simple Design
* The solution is TDDd, and should have good test coverage. The template already contains Jacoco which can be used to check the code coverage.
* Static code analysis tools are enabled by default to ensure good code quality.
* Makefile is provided as a wrapper for Gradle with all essential commands to build, test and run the code. Feel free to modify it as per your requirement.

## Tools / Tech Stack

### Backend
* Programming Language: Java (Java 15)
* DI Framework: Spring Boot
* Build Tool: Gradle
* Verification Tools: Checkstyle, PMD, SonarLint, JUnit, Cucumber, Jacoco, PiTest, SonarQube

### Miscellaneous
* Docker (Alpine Linux, Nginx)
* CI/CD Pipeline (Options: Jenkins on Nelkinda Server, GitHub Actions)

## Practices
* Planning Game, User Stories, Kanban Board (GitHub Project or Jira)
* Small Releases (almost every commit is pushed, every "green" push is deployed)
* Behavior Driven Development, Acceptance Test-Driven Development (Gherkin/Cucumber, Selenium)
* Test-Driven Development (JUnit, Mocha, Cucumber, Selenium)
* Coverage and Mutation Testing (Jacoco, PiTest, Istanbul, Stryker)
* Common Coding Standard (Checkstyle, PMD, TSLint, SonarLint)
* Automation and Continuous Integration/Release/Deployment/Delivery (NPM, Gradle, GitHub Actions, Docker)
* Pair Programming, with a bit of Mob Programming to engage more with the audience
* Continuous Design Improvement (Refactoring)
* Trunk-Based Development

© 2021 Nelkinda Software Craft. All Rights Reserved.
