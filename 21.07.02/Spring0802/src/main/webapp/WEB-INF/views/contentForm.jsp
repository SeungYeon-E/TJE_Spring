<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table cellpadding="0" cellspacing="0" border="1">
		<form action="modify" method="post">
			<tr>
				<td > 번호 </td>
				<td> <input type="text" name="seqno" size = "20" value="${list.seqno}" readonly > </td>
			</tr>
			<tr>
				<td > 이름 </td>
				<td> <input type="text" name="name" size = "20" value="${list.name}"> </td>
			</tr>
			<tr>
				<td> 전화번호 </td>
				<td> <input type="text" name="telno" size = "70" value="${list.telno}"> </td>
			</tr>
			<tr>
				<td> 주소 </td>
				<td> <input type="text" name="address" size = "70" value="${list.address}"> </td>
			</tr>
			<tr>
				<td> 전자우편 </td>
				<td> <input type="text" name="email" size = "70" value="${list.email}"> </td>
			</tr>
			<tr>
				<td> 관계 </td>
				<td> <input type="text" name="relation" size = "70" value="${list.relation}"> </td>
			</tr>
			<tr >
				<td colspan="2"><input type="submit" value="수정">&nbsp;&nbsp;&nbsp;<a href="list">목록보기</a>
				&nbsp;&nbsp;&nbsp;<a href="delete?seqno=${list.seqno}">삭제</a></td>
			</tr>
		</form>
</table>
</body>
</html>