<%@include file="SecurityGuard.jsp" %>
<!DOCTYPE html>
<html>
    <style>
    .col{
    height: 50px;
    font-family :"times new roman";
    color:black;
    font-size: 23px;
box-shadow:black 1px 1px 1px;     

       }
        .col:hover{
            background-color:black;
            text-color:white; 
        }
        a{
            text-decoration: none;
            color:black;
        }    
        a:hover{
            color:white;
        }
/*       
       .submit:hover{
            background-color:black;
            text-color:white; 
           color: yellow;
  
       }*/
    </style>
    
    <body background = "hostel.jpeg" >

    <div width=300px height=500px style="background-color:rgba(255,255,255,0.5);height:100px;border:solid " >
        <table width ="100%" style="padding-top:30px;">
            <tr align="center">
                <td class="col" style="width:15px"> <a href ="HomePage.jsp" > HOME </a> </td>
                 <td class="col" style="width:15px"> <a href ="about.jsp" > ABOUT</a> </td>
                 <td class="col" style="width:15px"> <a href ="contact.jsp" > CONTACT</a> </td>
            </tr>
            </table>
       </div>
            <hr>
            
            <div width=300px  style="background-color:rgba(255,255,255,0.7);height:600px " >
                     <form action="OwnerPage.jsp" >
    <table align="center"  cellspacing='10' width="30%"   style="border:inset;border-color: white;height: 600px">
        <tr align="center">
            <td class="signin"  rowspan='2' colspan="2"><h1 style="font-family:arial;color:black;text-transform: uppercase;background-color:cornsilk; border-radius: 10px;">CREATE ACCOUNT</h1></td>
        </tr>
        <tr>
            </tr>
             <tr align="center">
            <td ><h2>Id</h2></td>
            <td class="tabletheme"><input type="text"  name="lid" placeholder="enter id"
                style="width:200px; height:40px; border-radius: 20px; border-width: 5px"</td>
        </tr>
        <tr align="center">
            <td ><h2>Password</h2></td>
            <td class="tabletheme"><input type="password"  name="pass" placeholder="enter password"
            style="width:200px; height:40px; border-radius: 20px; border-width: 5px" </td>
        </tr>
              <tr align="center">
                  <td ><h2>Owner Name</h2></td>
            <td class="tabletheme"><input type="text"  name="username" placeholder="enter owner Name"
                style="width:200px; height:40px; border-radius: 20px; border-width: 5px"</td>
        </tr>

         <tr align="center">
                  <td ><h2>Contact</h2></td>
            <td class="tabletheme"><input type="text"  name="contact" placeholder="enter Contact"
                style="width:200px; height:40px; border-radius: 20px; border-width: 5px"</td>
        </tr>
         <tr align="center">
                  <td ><h2>Address</h2></td>
            <td class="tabletheme"><input type="text"  name="address" placeholder="enter Address"
                style="width:200px; height:40px; border-radius: 20px; border-width: 5px"</td>
        </tr>
          <tr align="center">
                  <td ><h2>City</h2></td>
            <td class="tabletheme"><input type="text"  name="city" placeholder="enter City"
                style="width:200px; height:40px; border-radius: 20px; border-width: 5px"</td>
        </tr>

        <tr align="center">
            <td   colspan="2"><input type="submit" value="REGISTER" 
                 style="  border-radius: 20px;"                  
            </td>
            
        </tr>
    </table>
</form>
                            
                        </td>
    </tr>                        
</table>
                </div>
            
                   </body>
</html>