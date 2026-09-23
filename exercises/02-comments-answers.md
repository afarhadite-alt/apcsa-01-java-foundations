# Exercise 5 — Comment Rescue

Below is a working method with no comments. It runs fine. It is also very hard to understand.

```java
public static double calc(double p, int y, double r) {
    double t = p;
    for (int i = 0; i < y; i++) {
        t = t + (t * r);
    }
    return t - p;
}
```

## Part A — Figure out what it does

**1. What do you think `p`, `y`, and `r` represent?**

`p` represents the starting principal (the amount of money invested), `y` represents the number of years, and `r` represents the interest rate per year as a decimal.

**2. What does the method return?**

The method returns the total interest earned after the given number of years, assuming the interest is compounded once per year.

**3. What would you rename each variable and the method itself?**

| Original | Better name |
|---|---|
| `calc` | `calculateInterestEarned` |
| `p` | `principal` |
| `y` | `years` |
| `r` | `annualRate` |
| `t` | `balance` |

## Part B — Rewrite it

Rewrite the method with better names **and** comments. Remember the rule:

> **Bad comments explain *what*. Good comments explain *why*.**

```java
public static double calculateInterestEarned(double principal, int years, double annualRate) {
    double balance = principal;

    // Compound the balance once per year so each year's interest earns interest later.
    for (int year = 0; year < years; year++) {
        balance = balance + (balance * annualRate);
    }

    // Subtract the original investment to return only the growth.
    return balance - principal;
}
```

## Part C — Reflect

**Which helped a future reader more — the better variable names, or the comments? Defend your answer in two or three sentences.**

Better variable names helped more because they make the method's purpose and data easier to understand throughout the code. The comments are still useful because they explain why the loop updates the balance and why the original principal is subtracted at the end, rather than merely repeating what each line does.

> There's no single right answer here. Most professionals would say good names reduce the *need* for comments, and comments should then explain the things names can't — assumptions, edge cases, and why a decision was made.
