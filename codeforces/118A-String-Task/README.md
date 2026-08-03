# 118A - String Task

**Contest:** Codeforces Beginner Problems
**Link:** https://codeforces.com/problemset/problem/118/A
**Verdict:** Accepted
**Language:** Java
**Rating:** 1000

## Problem (short version)

Given a string, produce a new string by:

1. Removing all vowels (`a, o, y, e, u, i` — note `y` counts as a vowel
   here).
2. Converting every remaining letter to lowercase.
3. Inserting a `.` before every remaining consonant.

## Core idea

A single left-to-right scan is enough:

1. Lowercase the whole string up front so case doesn't need to be checked
   per character.
2. For each character, check membership in the vowel set (`"aoyeui"`).
3. If it's **not** a vowel, append `.` followed by the character to the
   result.

```java
if (vowels.indexOf(c) == -1) {
    result.append('.');
    result.append(c);
}
```

Using `String.indexOf` on a short fixed 6-character string is effectively
O(1) per lookup, so this stays linear overall.

## Complexity

- Time: `O(n)` where `n` is the string length.
- Space: `O(n)` for the output buffer.
