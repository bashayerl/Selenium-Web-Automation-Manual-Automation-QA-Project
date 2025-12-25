# Selenium Web Automation – Manual & Automation QA Project

This is a training and practice project designed to demonstrate end-to-end
Selenium WebDriver automation, integrated with a GitHub Actions CI pipeline.

The project simulates real-world QA workflows by combining:
- Manual test design
- Bug reporting
- Automated UI testing
- Continuous Integration (CI)

---

## 📌 Project Overview
The automated tests cover multiple UI scenarios including:
- Login functionality
- Inputs and dropdowns
- File upload
- Checkboxes and radio buttons
- Color picker and date picker

Manual test cases and bug reports were created first, then selected scenarios
were converted into automated tests using Selenium and TestNG.

---

## 🧪 Manual Testing
- Test cases were designed using positive and negative testing techniques.
- Scenarios were documented and maintained in Notion.

🔗 Test Cases (Notion):  
[(https://www.notion.so/Test-Cases-2d4f2a66eec08056af30f3a5ebab8722?source=copy_link)](https://www.notion.so/Test-Cases-2d4f2a66eec08056af30f3a5ebab8722?source=copy_link)

---

## 🐞 Bug Reporting
- Bugs were identified during manual testing and logged with severity and priority.
- Known issues are reflected in automation results (skipped tests).

🔗 Bug Reports (Notion):  
[(https://www.notion.so/Bug-report-2d4f2a66eec080298094c9a5783e9022?source=copy_link)](https://www.notion.so/Bug-report-2d4f2a66eec080298094c9a5783e9022?source=copy_link)

---

## ⚠️ Known Issues
The following bugs are currently open and cause some tests to be skipped:
- BR-002: Error message display issue
- BR-004: Login button allows multiple clicks

---

## 🤖 Automation Testing
- Selenium WebDriver
- TestNG
- Page Object Model (POM)
- Headless browser execution

### Automated Scenarios
- Successful login
- Invalid login (known issue – skipped)
- Multiple login button clicks (known issue – skipped)

---

## 🛠️ Tech Stack
- Java 17  
- Selenium WebDriver  
- TestNG  
- Maven  
- GitHub Actions (CI)
