<%-- 
    Document   : BookingPageBasketball
    Created on : Feb 5, 2022, 7:04:37 PM
    Author     : pc
--%>

<%@page import="java.util.List"%>
<%@page import="Model.Hall"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "head.jsp"%>
        <title>Basketball Booking Page</title>
    </head>
    <body>
        <%@include file = "navigation.jsp"%>


        <div class="container BookingContainer d-flex justify-content-between pd-12">
<!--            style="width: 50em; text-align: center;align-content: center;"-->
            <table id="Game"class="table table-primary table-striped table-hover" >
                <thead>

                <td>Hall No</td>
                <td>Time</td>
                <td>Game</td>
                <td>Vacancy</td>
                <td>Action</td>
                </thead>
                <%                    List<Hall> t1 = (List<Hall>) request.getAttribute("t1");
                    String activity = request.getParameter("activity");

                    for (int i = 0; i < t1.size(); i++) {
                        if (activity.equals("basketball")) {
                            if (t1.get(i).getGame().equals("basketball") && t1.get(i).isVacancy()) {

                %>


                <tr>

                    <td><%=t1.get(i).getHallNo()%></td>
                    <td><%=t1.get(i).getTime()%></td>
                    <td><%=t1.get(i).getGame()%></td>
                    <td>Available</td>
                <form action="<%= request.getContextPath()%>/BookingConfirmation" class="Booking_confirmation" id="Booking_confirmation" method="post"hidden="TRUE">
                    <td><button class="basketballBtn btn btn-success">Booking</button></td>
                    <input type="text" value="<%=t1.get(i).getGame()%>"name="game" hidden>
                    <input type="text" value="<%=t1.get(i).getTime()%>"name="time" hidden>
                    <input type="text" value="<%=t1.get(i).getHallNo()%>"name="hall" hidden>
                    
               
                    
                </form>
                </tr>
                <%}//endif t1
                    }//endif basketball%>
                <%  if(activity.equals("ping-pong")) {
                    if (t1.get(i).getGame().equals("ping-pong") && t1.get(i).isVacancy()) {
                %>

                <tr>
                    <td><%=t1.get(i).getHallNo()%></td>
                    <td><%=t1.get(i).getTime()%></td>
                    <td><%=t1.get(i).getGame()%></td>
                    <td>Available</td>
                    <form action="<%= request.getContextPath()%>/BookingConfirmation" class="Booking_confirmation" id="Booking_confirmation" method="post"hidden="TRUE">
                    
                    <input type="text" value="<%=t1.get(i).getGame()%>"name="game" hidden>
                    <input type="text" value="<%=t1.get(i).getTime()%>"name="time" hidden>
                    <input type="text" value="<%=t1.get(i).getHallNo()%>"name="hall" hidden>
                    <td><button type="submit" class="ping-pongBtn">Booking</button></td>
                    
                    </form>
                </tr>
                <%} //endif t1 pingpong%>
                <%} // endif pingpong%>
                
               
                <%  if(activity.equals("gymnasium")) {
                    if (t1.get(i).getGame().equals("gymnasium") && t1.get(i).isVacancy()) {
                %>

                <tr>

                    <td><%=t1.get(i).getHallNo()%></td>
                    <td><%=t1.get(i).getTime()%></td>
                    <td><%=t1.get(i).getGame()%></td>
                    <td>Available</td>
                    <form action="<%= request.getContextPath()%>/BookingConfirmation" class="Booking_confirmation" id="Booking_confirmation" method="post"hidden="TRUE">
                    <td><button class="gymnasiumBtn">Booking</button></td>
                    <input type="text" value="<%=t1.get(i).getGame()%>"name="game" hidden>
                    <input type="text" value="<%=t1.get(i).getTime()%>"name="time" hidden>
                    <input type="text" value="<%=t1.get(i).getHallNo()%>"name="hall" hidden>
                    
                    </form>
                </tr>
                <%} //endif t1 gymnasium%>
                <%} // endif gymnasium%>
                <%}%>



            </table>
            </form>
        </div>
       <%@include file = "footer.html"%>         
    </body>
    <script>
        $(document).ready(function(){

    // code to read selected table row cell data (values).
    $("#Game").on('click','.gymnasiumBtn',function(){
         // get the current row
         var currentRow=$(this).closest("tr"); 
         
         var col1=currentRow.find("td:eq(0)").text(); // get current row 1st TD value
         var col2=currentRow.find("td:eq(1)").text(); // get current row 2nd TD
         var col3=currentRow.find("td:eq(2)").text(); // get current row 3rd TD
         var data=col1+"\n"+col2+"\n"+col3;
         data.submit();
         alert(data);
    });
    $("#Game").on('click','.ping-pongBtn',function(){
         // get the current row
         var currentRow=$(this).closest("tr"); 
         
         var col1=currentRow.find("td:eq(0)").text(); // get current row 1st TD value
         var col2=currentRow.find("td:eq(1)").text(); // get current row 2nd TD
         var col3=currentRow.find("td:eq(2)").text(); // get current row 3rd TD
         var data=col1+"\n"+col2+"\n"+col3;
         data.submit();
         alert(data);
         
    });
    $("#Game").on('click','.basketballBtn',function(){
         // get the current row
         var currentRow=$(this).closest("tr"); 
         
         var col1=currentRow.find("td:eq(0)").text(); // get current row 1st TD value
         var col2=currentRow.find("td:eq(1)").text(); // get current row 2nd TD
         var col3=currentRow.find("td:eq(2)").text(); // get current row 3rd TD
         var data=col1+"\n"+col2+"\n"+col3;
         data.submit();
         
         
    });
});
    </script>
</html>


