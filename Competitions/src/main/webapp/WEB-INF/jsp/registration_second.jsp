<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="now" class="java.util.Date"/>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${contextPath}/resources/css/auth.css">
    <script type="text/javascript" src="https://cdn.jsdelivr.net/jquery/latest/jquery.min.js"></script>
    <script type="text/javascript" src="https://cdn.jsdelivr.net/momentjs/latest/moment.min.js"></script>
    <script type="text/javascript" src="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.min.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.css" />
      <script>
      $(function() {
        $('input[name="birthday"]').daterangepicker({
          singleDatePicker: true,
          showDropdowns: true,
          minYear: 1900,
          opens: 'right',
          drops: 'up',
          changeMonth: true,
          dateFormat: 'yy-mm-dd',
          maxYear: parseInt(moment().format('YYYY'),10)
        });
      });
      </script>
    <title>Competition</title>
</head>

<body>
    <div class="auth_reg_block">
        <div class="auth_reg_block_content">
          <p class="auth_reg_block_head_text">Регистрация</p>
          <form:form class="auth_reg_style" action="/reg_second" method="post" modelAttribute="userForm" >
            <form:input type="first_name" name="first_name" placeholder="Введите имя" required="required"  path="firstname" />
            <form:input type="second_name" name="second_name" placeholder="Введите фамилию" required="required"  path="lastname" />
            <form:input type="post" name="post" placeholder="Введите должность" required="required"  path="post" />
            <div class="change_sex">
              <label>Выберите cвой пол:</label>
              <form:select path="sex" >
                <form:option value="Мужской" >Мужской</form:option>
                <form:option value="Женский">Женский</form:option>
              </form:select>
            </div>  
            <div class="date_of_birth">
              <label>Выберите свою дату рождения:</label>
              <form:input type="text" name="birthday" value="01/01/2000"  path="dateBirth"  />
            </div>  
            <div class="auth_reg_button">
                <form:button class="back_button" type="submit" onclick="history.back()" name="auth_submit">Вернуться</form:button>
                <form:button class="reg_button" type="submit" name="reg_submit">Готово</form:button>
            </div>
          </form:form>
        </div>
      </div>

</body>
</html>