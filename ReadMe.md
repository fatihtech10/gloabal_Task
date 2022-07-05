**Author:**
Fatih karakoc SDET/AUTOMATION TEST ENGINEER

**Project Title :**
Global Automation

**Installation guide:**
This is a maven project. so It's assumed that the host running this code have Java and maven installed and JAVA_HOME already set.
Here is the guide for maven installation just in case : https://maven.apache.org/install.html

Project get all dependencies from maven repository. So no additional installation needed.

**Below are the dependencies are being used for this project :**
Bonigarcia WebdriverManager,
Selenium-Java,
Cucumber-Junit,
Cucumber-Java


**Build Plugins:**
Build plugins are added inPOM.XML for Cucumber HTML Reports
Once you run your test Cucumber HTML report will generate on the Target folder.

**Credentials :**
Automation practice URL, Username, Password  to externalize the data a configuration reader utility are created to read configuration.properties.
Due to sensitive nature of the keys, user is expected to provide his/her own credentials.

**Build and run your project :**
This is maven project and tests are written in Cucumber BDD with Gherkin language . So we can use maven command line commands (mvn clean test) to run the project as as well as
with Runner class.

Framework can be built with using TestNg but preferred to Cucumber BDD use Junit.
It is created basic Page Object Model design pattern but it can be improved if needed.
