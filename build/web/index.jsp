<%-- 
    Document   : index
    Created on : Mar 28, 2017, 9:33:24 AM
    Author     : mbravo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Vehicular Restriction Validator</h1>
        <table border="0">
            <thead>
                <tr>
                    <th>Please enter the required information</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        <form name="formData" method="post" action="process.do">
                            Vehicle Plate <input type="text" name="txtPlate" value="" /> <br>
                            Date and Time <input type="text" name="txtDate" value="" /> (dd-MMM-yyyy HH:mm:ss Example: 10-SEP-2017 16:01:00) <br>
                            <input type="submit" value="Submit" />
                        </form>
                    </td>
                </tr>
                <tr>
                    <td></td>
                </tr>
            </tbody>
        </table>

    </body>
</html>
