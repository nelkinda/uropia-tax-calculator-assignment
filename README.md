# Uropia Tax Kata

The Uropia Tax Kata is a code kata for calculating bills and receipts in the fictional country Uropia.

## Requirements
On each purchase, the government of Uropia imposes a variety of taxes and deposits that depend on several criteria.
The taxes are cumulative.

### Price shown to customer
The price shown to the customer must always be the gross price, including all taxes and deposits.
Taxes are rounded mathematically.

### Sales Tax
The sales tax depends on the category of the article.
The following sales taxes apply:
* book and other educational material, food (all organic food; processed food with a sugar content <10g/kg), medical, electronics: 0%
* luxury items (cars; processed food with sugar content >=10g/kg) : 50%
* everything else 10%

### Import Tax
The import tax depends on the category of the article.
* food (all organic; processed food with a sugar content <10g/kg), medicine, electronis: 0% (exempt)
* everything else: 10%

### Environment Deposit
The environment deposit is a deposit buyers make at the time of the purchase that will be refunded when they return the product to the shop for recycling.
* electronics: 40% of the net price
* food containers (bottles, cans, tins, etc): €0.50

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
Sales Tax 10%:     0.22
Sales Tax 50%:     1.65
```
