<%@ page import="com.myshop.constants.Constants" %>
<%@ page import="it.gestpay.wscryptdecrypt.EncryptResponse" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.3.2/css/bulma.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>The BEST ecommerce EVER</title>
</head>
<body>
<section class="hero is-medium is-primary is-bold">
    <div class="hero-body">
        <div class="container">
            <h1 class="title">
                The BEST ecommerce... EVER!
            </h1>
            <h2 class="subtitle">
                We sell good stuff
            </h2>
        </div>
    </div>
</section>
<section class="section container">
    <p>You have requested to buy <b><%= request.getParameter("item") %></b>.</p>
    <p>The price is <b><%= request.getParameter("price") %>&euro;</b>.</p>
    <br>
    <p>
    <form action="https://testecomm.sella.it/pagam/pagam.aspx" method="GET">
        <input type="hidden" name="a" value="<%=Constants.SHOP_LOGIN%>">
        <input type="hidden" name="b" value="<%=((EncryptResponse)request.getAttribute("encryptResponse")).getCryptDecryptString()%>">
        <input type="submit" value="Pay Now!" class="button">
    </form>
    </p>
</section>
</body>
</html>
