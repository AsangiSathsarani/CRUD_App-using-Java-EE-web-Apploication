<%-- 
    Document   : EditPost
    Created on : Apr 29, 2019, 5:57:05 PM
    Author     : Asangi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit News</title>
    </head>
    <body>
        <div style ="width: 900px; margin-left: auto ;margin-right: auto ">
            <c:forEach items="${getNewByI}" var = "p">
                
                <form action="JSP/ManagerEditPost.jsp" method="post">
                    <input type="hidden" value="${p.id}">
                    Title:<br>
                    <input type="text" value ="${p.title}" name="title" style="width:200px"><br>
                    Description:<br>
                    <input type="text" value="${p.description}" name="description" style="width: 200px"><br>
                    Detail:<br>
                    <textarea name="detail" style="width: 400px ; height: 200px">${p.detail}</textarea><br>
                    Category:
                    <select name="category">
                        <option value="${p.category}">${p.category}</option>
                        <option value="world">World</option>
                        <option value="Tech">Tech</option>
                        <option value="Sport">Sport</option>
                    </select><br>
                    Image:<br>
                    <input type="text" value ="${p.image}" name="image" style="width: 200px"><br>

                </form> 
                
            </c:forEach>
            
<!--            Complete Interface-->
        </div>
    </body>
</html>
