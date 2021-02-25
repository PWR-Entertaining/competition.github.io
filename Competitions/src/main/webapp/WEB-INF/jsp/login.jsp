<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<jsp:useBean id="now" class="java.util.Date"/>
<!DOCTYPE html>
<html lang="ru">
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${contextPath}/resources/css/auth.css">
    <title>Competition</title>
</head>
<body>
    <div class="auth_reg_block">
        <div class="auth_reg_block_content">
          <p class="auth_reg_block_head_text">Авторизация</p>
          <form class="auth_reg_style" action="/login" method="post">
            <input type="email" name="auth_email" placeholder="Введите адрес электронной почты" id="email" required >
            <input type="password" name="auth_pass" placeholder="Введите пароль" id="password" required >
            <div class="auth_reg_button">
                <button class="auth_button" type="submit" name="auth_submit">Вход</button>
                <button class="reg_button" type="button" onclick='location.href="/registration_first"' name="reg_submit">Регистрация</button>
            </div>
          </form>
        </div>
      </div>
</body>
</html>