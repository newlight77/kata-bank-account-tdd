# Bank-Account-Kata-TDD

[![Build Status](https://travis-ci.org/newlight77/kata-bank-account-tdd.svg?branch=master)](https://travis-ci.org/newlight77/kata-bank-account-tdd)
[![Maintainability](https://api.codeclimate.com/v1/badges/5215148bf0b74c26470a/maintainability)](https://codeclimate.com/github/newlight77/kata-bank-account-tdd/maintainability)
[![codecov](https://codecov.io/gh/newlight77/kata-bank-account-tdd/branch/master/graph/badge.svg)](https://codecov.io/gh/newlight77/kata-bank-account-tdd)
[![BetterCodeHub compliance](https://bettercodehub.com/edge/badge/newlight77/kata-bank-account-tdd?branch=master)](https://bettercodehub.com/)

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

* US2 : Withdrawal (negative not permitted)  

> As a bank client, I want to withdraw money from my account.

* US3 : GetBalance  

> As a bank client, I want to know the balkance in my account.

* US4 : Account statement (date, quantity, balance) 

> As a bank client, I want to see my account statement.

* US5 : Statement printing 

> As a bank client, I want to print my account statement.

## Run it

```bash
./mvnw clean test
```

