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
Project Structure
-----------------------------------------------------
PasswordChecker/
│
├── Main.java          # Main program (handles input and scoring)
├── Checker.java       # Contains all password validation methods
├── common.txt         # List of common or weak passwords
└── README.txt         # Project documentation

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
common.txt
-----------------------------------------------------
This file contains a list of common or weak passwords that should be flagged as insecure (e.g. 123456, password, qwerty, etc.).
Each password should be on its own line, like this:

password
123456
qwerty
iloveyou
admin

You can expand this list with your own words or from real breach data.

-----------------------------------------------------
Future Improvements
-----------------------------------------------------
- Add color-coded terminal output (green/yellow/red)
- Show detailed feedback (e.g. “Missing uppercase letter”)
- Add checks for:
  - Special characters
  - Password length > 12 (bonus points)
  - Common keyboard patterns (qwerty, asdf, etc.)
- Use entropy estimation for advanced scoring

-----------------------------------------------------
Author
-----------------------------------------------------
Mateus Maciel
Beginner cybersecurity and programming enthusiast

-----------------------------------------------------
Disclaimer
-----------------------------------------------------
This project is for educational purposes only.
It does not guarantee password security and should not be used in production systems.
Always follow official password security guidelines (e.g., NIST SP 800-63B).