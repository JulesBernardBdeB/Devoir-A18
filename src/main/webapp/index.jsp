<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculatrice d'intérêts composé</title>
</head>
<body>

<form action="/InterestRateCalculator" method="post">
    <label for="principal">Principal: </label>
    <input id="principal" type="number" min="1">

    <label for="interest">Taux d'intérêt: </label>
    <input id="interest" type="number" min="1">

    <label for="years">Nombre d'année: </label>
    <input id="years" type="number" min="1">

    <label for="compounding">Période de composition: </label>
    <input id="compounding" type="number" min="1">

    <button type="submit">Calculer</button>
</form>


</body>
</html>