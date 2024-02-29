<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8" %>
    		
<%@ page 	import="mvc.domain.dto.ResponseUserDTO" %>
<%@ page 	import="java.util.List" %>
<%@ page 	import="java.util.ArrayList" %>

<%@ page 	errorPage="../error/error.jsp" %>

<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>

<body>
	<table class="table" > 
		<thead>
			<tr>
				<th scope="col">아이디</th><th scope="col">패스워드</th><th scope="col">이름</th>
			</tr>
		</thead>
		<% 
		ArrayList<ResponseUserDTO> list = (ArrayList<ResponseUserDTO>)request.getAttribute("list");
		for(int i = 0 ; i < list.size() ; i++) {
		%>
		<tr>
			<td><%= list.get(i).getId()   %></td>
			<td><%= list.get(i).getPwd()  %></td>
			<td><%= list.get(i).getName() %></td>
		</tr>
		<% 
		}
		%>
	</table>
</body>
</html>







