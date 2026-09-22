# 🚀 Selenium Java Test Automation Framework (POM)

A robust and scalable Test Automation Framework built using **Java**, **Selenium WebDriver**, **TestNG**, and **Maven**, following the **Page Object Model (POM)** design pattern. This project automates core e-commerce functionalities on the SauceDemo web application.

---

## 🛠️ Tech Stack & Tools
* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Test Framework:** TestNG
* **Build Management:** Maven
* **Design Pattern:** Page Object Model (POM)
* **Version Control:** Git & GitHub

---

## 📂 Project Structure
```text
SeleniumFrameworkDemo
│
├── src
│   ├── test
│       ├── java
│           ├── base          # Browser initialization, setup, and teardown (BaseClass)
│           ├── pages         # Page Object classes containing WebElements and Actions (LoginPage, ProductsPage)
│           └── tests         # Test case execution classes (LoginTest)
│
├── pom.xml                   # Maven configuration and dependencies
└── README.md
```
## 🧪 Test Scenarios Covered 

* **Successful Login & Navigation:**

Opens the SauceDemo application.

Logs in using valid credentials (standard_user / secret_sauce).

Verifies successful navigation to the inventory dashboard via URL assertion.


* **Add to Cart Functionality:**

Selects a product and adds it to the cart.

Clicks the cart icon and verifies that the item is successfully loaded in the cart page.




## ⚙️ How to Run the Tests

Clone the repository:

Bash
git clone [https://github.com/prameesha-98/SeleniumFrameworkDemo.git](https://github.com/prameesha-98/SeleniumFrameworkDemo.git)

*Open the Project:

*Import the project into any Java IDE (Eclipse / IntelliJ IDEA) as an Existing Maven Project.

*Execute Tests:

*You can run the tests directly from LoginTest.java using TestNG, or via the terminal using Maven: **Bash mvn clean test**
