<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Add Employee</title>
</head>
<body>
	<form action="/AddBooking.html" method="post" >
		${message}
		
        <fieldset >
            <table>
                <tr>
                    <td>
                            Customer Id:
                    </td>
                    <td>
                           <input type="text" name="customerId" >
                    </td>
                </tr>
                <tr>
                    <td>
                            Hotel Id:
                    </td>
                    <td>
                            <input type="text" name="hotelId">
                    </td>
                </tr>
                <tr>
                    <td>
                            Room Type:
                    </td>
                    <td>
                            <input type="text" name="roomType">                        
                    </td>
                </tr>
                <tr>
                    <td>
                            checkIn:
                    </td>
                    <td>
                            <input type="text" name="checkIn">
                    </td>
                </tr>
                <tr>
                    <td>
                            Check Out:
                    </td>
                    <td>
                            <input type="text" name="checkOut">
                    </td>
                </tr>
               
                <tr>
                        <td>
                                
                        </td>
                        <td>
                                <input type="submit" value="Confirm & Checkout">
                        </td>
                </tr>           
            </table>
        </fieldset>
	</form>
</body>
</html>