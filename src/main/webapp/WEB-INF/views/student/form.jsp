<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lab 3</title>
</head>
<body>
	<form action="student.htm" method="post">
    <div>Họ và tên</div>
    <input name="name">

    <div>Điểm trung bình</div>
    <input name="mark">

    <div>Chuyên ngành</div>
    <label>
        <input type="radio" name="major" value="APP" ${student.major == 'APP' ? 'checked':''}>
        Ứng dụng phần mềm
    </label>
    <label>
        <input type="radio" name="major" value="WEB" ${student.major == 'WEB' ? 'checked':''}>
        Thiết kế giao diện web
    </label>
    <hr>
    <button>Lưu</button>
</form>
</body>
</html>