## Java Gestpay Starter Example

In this example you'll see how to call Gestpay APIs to perform a payment.

### What we are using

- Java7+
- Apache CXF for SOAP calls
- Tomcat, Servlets, JSP

### Prerequisites

- Java Virtual Machine
- Maven
- Apache Tomcat

In case the SOAP endpoint has changed, or you get SOAP errors, you must re-generate the java classes for the model. From the project directory launch:

```console
wsimport -keep -s src/main/java/it/gestpay/wscryptdecrypt/model https://testecomm.sella.it/gestpay/GestPayWS/WsCryptDecrypt.asmx\?wsdl
```

This will create all model classes needed to talk to Gestpay.
# java-gestpay-starter
