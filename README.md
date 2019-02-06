# Bank-Account-Kata

[![Build Status](https://travis-ci.org/newlight77/kata-bank-account.svg?branch=master)](https://travis-ci.org/newlight77/kata-bank-account)
[![Maintainability](https://api.codeclimate.com/v1/badges/5215148bf0b74c26470a/maintainability)](https://codeclimate.com/github/newlight77/kata-bank-account/maintainability)
[![BetterCodeHub compliance](https://bettercodehub.com/edge/badge/newlight77/kata-bank-account?branch=master)](https://bettercodehub.com/)

## Kata Statement

Bank Account kata for practice TDD implemented by [Jorge Sánchez (Xurxodev)](https://github.com/xurxodev/Bank-Account-Kata/blob/master/README.md)

Think of your personal bank account experience

When in doubt, go for the simplest solution

### Requirements

These are requirements for kata.

#### Initial requirements

* Deposit (negative not permitted)
* Withdrawal (negative not permitted)  
* GetBalance  
* Account statement (date, quantity, balance) 
* Statement printing 

#### Extra requirements if you feel with force :)

* Deposit and Withdrawal (EUR and USD)

## My Approach

### Technical stack 

I'm using Springboot with Java.

### Story Mapping

Let's translate the features above into user stories :

* US1 : Deposit (negative not permitted)

> As a bank client, I want to make a deposit in my account.

>> - Given a client with an account`
>> -   and the the initial balance in that account is 0$`
>> - When he makes a deposit of 100 $
>> - Then the balance in the account is update to 100 $

>> - Given a client with an account
>> -   and the the initial balance in that account is 0$
>> - When he makes a deposit of 100 $
>> - Then the operation is not allowed

* US2 : Withdrawal (negative not permitted)  

> As a bank client, I want to withdraw money from my account.

>> - Given a client with an account
>> -   and the the initial balance in that account is 100$
>> - When he withdraws 100 $ from the account
>> - Then the balance in the account is update to 0 $

>> - Given a client with an account
>> -   and the the initial balance in that account is 100$
>> - When he withdraws -100 $ from the account
>> - Then the operation is not allowed

* US3 : GetBalance  

> As a bank client, I want to know the balkance in my account.

>> - Given a client with an account
>> -   and the the initial balance in that account is 100$
>> - When he retrieve the balance in the account
>> - Then the balance 100 $ is showed

* US4 : Account statement (date, quantity, balance) 

> As a bank client, I want to see my account statement.

>> - Given a client with an account
>> -   and the the initial balance in that account is 100$
>> -   and there are 3 operations (+100, +200 and +50)    
>> - When he retrieves the statement of the account
>> - Then the 3 operations (+100, +200 and +50) with date, amount and balance are shown

* US5 : Statement printing 

> As a bank client, I want to print my account statement.

>> - Given a client with an account
>> -   and the the initial balance in that account is 100$
>> -   and there are 3 operations (+100, +200 and +50)    
>> - When he prints the statement of the account
>> - Then the 3 operations (+100, +200 and +50) with date, amount and balance are printed

## Run it

```bash
./mvnw clean test
```

