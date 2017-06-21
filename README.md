## Java Gestpay Starter Example

In this example you'll see how to call Gestpay APIs to perform a payment.

### What we are using

- Java7+
- Tomcat, Servlets, JSP
- Log4j

### Prerequisites

- Java Virtual Machine
- Maven
- Apache Tomcat

In case the SOAP endpoint has changed, or you get SOAP errors, you must re-generate the java classes for the model. From the project directory launch:

```console
wsimport -keep -s src/main/java/ -p it.gestpay.wscryptdecrypt.model https://testecomm.sella.it/gestpay/GestPayWS/WsCryptDecrypt.asmx\?wsdl
```

This will create all model classes needed to talk to Gestpay.

### What to do before running

- configure Gestpay to accept your IP address
- configure `success_url` and `failure_url`: if your server is at `http://yourshop.com/APP_NAME/`, use
for both values `http://yourshop.com/APP_NAME/response`.
- for local development, you can use `http://localhost:8080/<APP_NAME>/` in success url and failure url, assuming that your server
answers on port `8080` and the application is deployed in `<APP_NAME>`.
- change in `com.myshop.constants.Constants` the value of `SHOP_LOGIN` with your shop code.

### How to run

1. launch this command:
```
mvn clean install
```

2. copy the WAR `target/gestpay-starter-VERSION.war` in tomcat webapps

3. start tomcat

## What you should know about this project

This is an example e-commerce project in Java, made for you by Gestpay. It's purpose is to explain how Gestpay can be
integrated inside a Java web application.

Since it's just an example, it will allow you to only pay an item and get the response from Gestpay of successful
payment. *It has been deliberately realized with the easiest possible technology (Servlets, JSP)*.

When you start the app, `index.jsp` is loaded. This page contains three items that you can buy.

After choosing one of these, you are redirected to the servlet `EncryptServlet`, that will generate a payment request to
 Gestpay (Note: not the actual payment).

Then the user is redirected to `pay.jsp`, where he can read the details about his payment. Clicking on **PAY** will
transfer the user to Gestpay, to complete the payment.

Once the payment is completed, Gestpay will contact your server to acknowledge of the payment, to one of the URLs
configured before (remember `success_url` and `failure_url`?).

The serlvet that will answer at `/response` is `DecryptServlet`. it will decode the answer and redirect to the page
`response.jsp`.

### Support

This is an official project by Gestpay. For bugs, doubts, support just open an issue.