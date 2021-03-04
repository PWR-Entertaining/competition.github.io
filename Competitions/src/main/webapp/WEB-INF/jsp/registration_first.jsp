<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
          <p class="auth_reg_block_head_text">Регистрация</p>
          <form:form class="auth_reg_style" action="/registration_second" method="post" modelAttribute="userForm">
            <form:input type="email" name="reg_email" placeholder="Введите адрес электронной почты"  path="username" required="required"/>
            <form:input type="password" name="reg_pass" placeholder="Введите пароль"  path="password" required="required"/>
            <form:input type="password" name="reg_pass" placeholder="Повторите пароль" required="required" path="passwordConfirm"/>
            <p class="auth_reg_block_head_text">${error}</p>
            <div class="auth_reg_button">
                <form:button class="back_button" type="button" onclick="history.back()" name="auth_submit">Вернуться</form:button>
                <form:button class="reg_button_next" type="submit" name="reg_submit">Далее</form:button>
            </div>
            

     		</form>
          </form:form>
        </div>
      </div>

</body>
</html>