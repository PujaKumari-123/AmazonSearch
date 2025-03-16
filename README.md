Selenium Assignment - Amazon Search Test

Overview

This project is a Selenium-based automation test for searching a product on Amazon and validating the search result using TestNG and ExtentReports.

Technologies Used

Java (Programming Language)

Selenium WebDriver (Automation Framework)

TestNG (Testing Framework)

ExtentReports (Reporting Library)

Microsoft Edge WebDriver (Browser Driver)

Project Structure

seleniumassigment
│-- ExtentReport.java  (Test script with Selenium WebDriver and ExtentReports)
│-- pom.xml            (Maven dependencies - if applicable)
│-- report1.html       (Test execution report generated by ExtentReports)

Prerequisites

Java Development Kit (JDK) 8 or above - Install and configure JAVA_HOME.

Eclipse or IntelliJ IDEA - IDE for running the project.

Selenium WebDriver - Download and configure Selenium dependencies.

Microsoft Edge WebDriver - Ensure the Edge browser and its driver are installed.

TestNG - Install the TestNG plugin in your IDE.

ExtentReports - Add the required dependencies.

Setup Instructions

Clone this repository or copy the project files to your local system.

Open the project in Eclipse or IntelliJ IDEA.

Ensure the following Maven dependencies (if using Maven) are added in pom.xml:

<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.x.x</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.x.x</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>com.relevantcodes</groupId>
        <artifactId>extentreports</artifactId>
        <version>2.x.x</version>
    </dependency>
</dependencies>

Download and set up Microsoft Edge WebDriver and add it to the system PATH.

Ensure the ExtentReports file path is correctly set in ExtentReport.java:

report = new ExtentReports("C:\\Users\\manis\\eclipse-workspace\\Sel_1\\report1.html");

Test Execution

Run the ExtentReport.java file as a TestNG test.

The test performs the following steps:

Opens the Amazon website.

Searches for "Laptop".

Validates if a specific product appears in search results.

Logs the test status (PASS/FAIL) in ExtentReports.

After execution, check the generated report1.html for detailed test logs.

Expected Output

If the expected product is found, the test passes.

If the product is not found, the test fails and logs the exception.

The results are saved in report1.html.

Troubleshooting

If the test fails, ensure:

The correct product name is being searched.

The Edge WebDriver version matches the browser version.

The XPath used to locate elements is still valid.

Author

Your Name
