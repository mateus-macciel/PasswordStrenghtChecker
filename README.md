Password Strength Checker (Java)
=====================================================

A simple Java-based password strength checker that evaluates a password against multiple security criteria and classifies it as Weak, Moderate, or Strong.

-----------------------------------------------------
Features
-----------------------------------------------------
- Checks for:
  - Minimum length (8+ characters)
  - Uppercase letters
  - Lowercase letters
  - Digits (0–9)
  - Common password words (from common.txt)
  - Repetitive or simple patterns
- Reads user input directly from the terminal
- Prints feedback on password strength
- Easy to customize and extend

-----------------------------------------------------
How It Works
-----------------------------------------------------
1. The program asks the user to enter a password.
2. It performs several checks (length, uppercase, digits, etc.).
3. It sums up the results and classifies the password as:
   - Weak — fails most checks
   - Moderate — meets some checks
   - Strong — meets all or most checks

-----------------------------------------------------
How to Run
-----------------------------------------------------
1. Compile the program:
   javac Main.java

2. Run the program:
   java Main

Example Output:
   Enter your password: Test1234
   Moderate password

-----------------------------------------------------
