# Understanding Code Coverage

## ➡️ Introduction to Code Coverage
Code coverage is a crucial metric in software testing that indicates the degree to which source code is executed when a particular test suite runs. It helps identify untested parts of the codebase, allowing developers to write more effective tests.

## ➡️ Statement Coverage
Definition: Statement coverage measures the percentage of executable statements in the source code that have been executed (or covered) by tests.

Key Points:

✔️ It is the simplest form of code coverage.
✔️ Achieving 100% statement coverage means that every line of code has been executed at least once during testing.
✔️ It does not guarantee that all paths through the code have been tested; it merely confirms that statements have run.

Benefits:

✔️ Helps identify parts of the code that are not being tested.
✔️ Provides a quick overview of testing completeness.

## ➡️ Branch Coverage
Definition: Branch coverage measures whether each possible branch from a decision point (like if statements) has been executed.

Key Points:

✔️ It extends statement coverage by ensuring that every possible path of execution is tested.
✔️ Each decision point must evaluate both to true and false for full branch coverage.

Benefits:

✔️ Offers a deeper understanding of code execution by testing different paths.
✔️ Helps identify logical errors that statement coverage may overlook.



