<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
<head>
<title>BING ROCKS !!</title>
</head>
<body>
Hi ${name}

<table>
	<caption>Your Todos are</caption>
	<thead>
		<tr>
			<th>Description</th>
			<th>Target Date</th>
			<th>Is Completed?</th>
		</tr>
	</thead>
	<tbody>
		<!-- for(Todo todo:todos) -->
		<c:forEach items="${todos}" var="todo">
			  <br/>
		<tr>
			<td>${todo.desc}</td>
			<td>${todo.targetDate}</td>	
			<td>${todo.done}</td>			
		</tr>
		</c:forEach>
	</tbody>
</table>




<a class="button" href="/add-todo">Add</a>
</body>
</html>