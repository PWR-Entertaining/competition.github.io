<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${contextPath}/resources/css/main.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/header.css">
    <title>Competition</title>
</head>
<header>
    <nav>
        <div class="logo">
            <button class="go_main" onclick='location.href="main.html"'></button>
        </div>
        <div class="menu">
            <h3>Быстрее, выше, сильнее!</h3>
        </div>
        <div class="go_out">
            <button class="go_out_button" onclick='location.href="/logout"'></button>
        </div>
    </nav>
</header>

<body onclick="">
    <div class="view">
        <div class="categories">
            <h2>Просмотр</h2>
            <select>
                <option>участников</option>
                <option>тренеров</option>
                <option>соревнований</option>
                <option>видов спорта</option>
            </select>
            <button class="add" onclick='location.href="create.html"'></button>
        </div>
        <table class="table_view">
            <tr>
                <td>Иван</td>
                <td>Дидюля</td>
                <td>мужской</td>
                <td>20-09-2000</td>
                <td class="button_td"><button class="edit_button" onclick='location.href="edit.html"'></button><button
                        class="delete_button"></button></td>
            </tr>
            <tr>
                <td>Мария</td>
                <td>Клинова</td>
                <td>женский</td>
                <td>20-09-2000</td>
                <td class="button_td"><button class="edit_button"></button><button class="delete_button"></button></td>
            </tr>
            <tr>
                <td>Максим</td>
                <td>Гангрена</td>
                <td>мужской</td>
                <td>29-09-2000</td>
                <td class="button_td"><button class="edit_button"></button><button class="delete_button"></button></td>
            </tr>
        </table>
    </div>
    
    
    
    
    
    
    
    
    <form class="delete_check" action="">
        <div class="delete_check_block">
            <label>Вы уверены что хотите удалить?</label>
            <div class="button_block">
                <button>да</button>
                <button>нет</button>
            </div>
        </div>
    </form>
    
    
    
    
    
    
    
</body>

</html>