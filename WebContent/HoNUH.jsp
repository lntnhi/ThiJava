<%@page import="bean.HoNUHBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="container mt-3">
<table class="table">
    <thead class="thead-dark">
      <tr>
        <th scope="col">Ma ho dan</th>
        <th scope="col">Ho ten chu ho</th>
        <th scope="col">To</th>
        <th scope="col">Khoi hoac thon</th>
        <th scope="col">La ho ngheo</th>
        <th scope="col">So tien</th>
      </tr>
    </thead>
    <tbody>
       <% ArrayList<HoNUHBean> dsDot = (ArrayList<HoNUHBean>) request.getAttribute("dsDot");
		for (int i =0; i<dsDot.size(); i++) {
			HoNUHBean loai = dsDot.get(i); %>
			<tr>
				<td><%=loai.getMaHoDan() %></td>
				<td><%=loai.getHoTen() %></td>
				<td><%=loai.getTo() %></td>
				<td><%=loai.getKhoiThon() %></td>
				<td><%=loai.isLaHoNgheo() %></td>
				<td><%=loai.getSoTien() %></td>
		     </tr>	
		<%} %>   
    </tbody>
</table>
</div>	
</body>
</html>