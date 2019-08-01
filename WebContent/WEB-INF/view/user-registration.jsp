<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.error {
	color: red;
}
</style>
<meta charset="ISO-8859-1">
<title>User Registration Form</title>
</head>
<body>
	<h1>${msg}</h1>
	<form:form action="process-user-registration" method="post"
		modelAttribute="user">
		<table border="1px">
			<tr>
				<td>Name</td>
				<td><form:input path="name" /> <form:errors path="name"
						class="error" /></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><form:input path="age" /><form:errors path="age"
						class="error" /></td>
			</tr>
			<tr>
				<td>Batch Code</td>
				<td><form:input path="batchCode" /><form:errors path="batchCode"
						class="error" /></td>
			</tr>
			<tr>
				<td>Date of Birth</td>
				<td><form:input path="dob" /><form:errors path="dob"
						class="error" /></td>
			</tr>
			<tr>
				<td>Last class Date</td>
				<td><form:input path="lastBatchDate" /><form:errors path="lastBatchDate"
						class="error" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><form:radiobutton value="Male" path="gender" /> Male &nbsp;
					<form:radiobutton value="Female" path="gender" /> Female</td>
			</tr>
			<tr>
				<td>Country</td>
				<td><form:select path="country">
						<form:option value="IND" label="India" />
						<form:option value="AUS" label="Australia" />
						<form:option value="US" label="Unitate States" />
					</form:select></td>
			</tr>
			<tr>
				<td>Courses</td>
				<td><form:checkbox path="courses" value="M1" /> Core Java
					&nbsp; <form:checkbox path="courses" value="M2" /> Advance Java
					&nbsp; <form:checkbox path="courses" value="M3" /> Java Frameworks
					&nbsp;</td>
			</tr>
			<tr>
				<td>Are you graduate?</td>
				<td><form:checkbox path="graduated" /></td>
			</tr>
			<tr>
				<td>Feedback</td>
				<td><form:textarea path="feedback" cols="20" rows="3" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset" /></td>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>

	</form:form>
</body>
</html>