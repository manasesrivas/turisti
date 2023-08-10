<%-- 
    Document   : play
    Created on : 05-19-2022, 07:45:50 PM
    Author     : MINEDUCYT
--%>

<%@page import="clases.traductor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>





<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="miestilo2.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        
                <% 
                    String animal = request.getParameter("animal");
                    traductor.palabra=animal;
                    String traduccion= traductor.Traducir();
                %>
        <!-- <h1 class="titulo2"><%= animal %> / <%= traduccion %></h1>
        <img src="img/<%= animal %>.png" class="imganimal"> -->
        

        <section class="containerResult">
            <div class="contendorImgNombre">
                <div class="containerImg">
                    <div class="fondo">
                        <img src="<%=traductor.imagen%>" alt="alt" class="imgLugar"/>
                    </div>
                </div>
                <div class="containerText">
                    <h1><%=traductor.title %></h1>
                    <p><%=traductor.descripcion%></p>
                    <div class="Link">
                        <button class="buttonMostrarMapa mostrarOsalir">
                            ubicación<img src="./img/iconos/map.svg" alt="">
                        </button>
                        <a href="index.jsp" class="link">volver a inicio</a>
                    </div>
                </div>
            
            </div>
        </section>

        <section class="containerMap">
            <button class="buttonExit mostrarOsalir"><img src="./img/iconos/exit.svg" alt=""></button>
            </iframe>
            <iframe src="<%=traductor.ubicacion%>" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade">
            </iframe>
            
           
           
        </section>
    </body>
    <script src="./js/play.js"></script>
</html>
