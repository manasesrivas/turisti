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
                        <img src="./img/Lugares turisticos imagenes/<%=traductor.imagen%>" alt="alt" class="imgLugar"/>
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
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d15509.970771665105!2d-87.90954188254442!3d13.627766708319756!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8f65367ff350b4b7%3A0x54d8f5acf542a67e!2sPanaderia%20Lorena!5e0!3m2!1ses-419!2ssv!4v1686578459162!5m2!1ses-419!2ssv" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade">
            </iframe>
        </section>
    </body>
    <script src="./js/play.js"></script>
</html>
