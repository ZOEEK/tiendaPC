<%-- 
    Document   : resumen
    Created on : 27-jun-2018, 14:31:43
    Author     : zoek
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0"/>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

        <link href="css/main.css" type="text/css" rel="stylesheet"/>

        <title>Compra & Venta de artículos computacionales</title>

    </head>

    <body>
        <nav class="light-blue lighten-1" role="navigation">
            <div class="nav-wrapper container"><a id="logo-container" href="index.jsp" class="brand-logo"><img src="img/comprayventa-logoblanco.png"/></a>
                <ul class="right hide-on-med-and-down">
                    <li>${msgok}</li>
                    <li><a href="registro.jsp">Registro</a></li>
                    <li><a href="login.jsp">Ingreso</a></li>
                </ul>

                <ul id="nav-mobile" class="sidenav">
                    <li><a href="registro.html">Registro</a></li>
                    <li><a href="login.html">Ingreso</a></li>
                </ul>
                <a href="#" data-target="nav-mobile" class="sidenav-trigger"><i class="material-icons">menu</i></a>
            </div>
        </nav>


        <!--<div class="slider">
            <ul class="slides">
              <li>
                <img src="img/slider-1.jpg"> 
                         <div class="caption right-align">
                  <h3 style="font-weight: 600;">¡Grandes Marcas!</h3>
                  <h5 class="light grey-text text-lighten-3">A pequeños precios.</h5>
                </div>
              </li>
              <li>
                <img src="img/slider2.jpg"> 
                <div class="caption left-align">
                  <h3 style="color:#455a64;font-weight: 600;">Menos es más</h3>
                  <h5 class="light blue-grey-text text-darken-3">Ver más sobre este producto</h5>
                </div>
              </li>
              <li>
                <img src="img/slider3.jpg"> 
              <div class="caption right-align">
                  <h3 style="color: #004d40; font-weight: 600;">Nvidia Geforce GTX</h3>
                  <h5 class="light teal-text text-darken-4">Conoce más.</h5>
                </div>
              </li>
            </ul>
          </div>-->


        <!--PRODUCTOS-->	
        <div class="container">
            <br>
            <h4 class="center">Resumen</h4>
            <hr class="celeste">	
            <br>
            <div class="section">

                <form class="col s12" action="<c:url value="/ProductoServlet"/>" method="post">
                    <div class="row">
                        <div class="input-field col s2">
                            <label for="id">ID Producto</label>	 
                            <input disabled id="id" type="text" class="validate" name="codigo_producto" value="${codigo_producto}">
                        </div>
                        <div class="input-field col s4">
                            <input disabled type="text" class="validate" name="nombre" value="${nombre}">
                            <label for="hola">Nombre</label>
                        </div>
                        <div class="input-field col s2">
                            <input disabled type="text" class="validate" name="precio" value="${precio}">
                            <label for="hola">Precio</label>
                        </div>
                        <div class="input-field col s2">
                            <label for="id">Precio Oferta Efectivo</label>	 
                            <input disabled id="id" type="text" class="validate" name="precioEfectivo" value="${precioEfectivo}">
                        </div>
                        <div class="input-field col s2">
                            <label for="id">Pago con tarjeta</label>	 
                            <input disabled id="id" type="text" class="validate" name="precioTarjeta" value="${precioTarjeta}">
                        </div>
                        <!--<div class="col s2" style="margin-top: 15px;"><button class="btn light-blue" type="submit" name="btn" value="Comprar">Comprar</button></div>-->
                        
                    </div>
                        
                </form>
                        <div class="row">
                            <p class="center-align">Para completar la compra, comuníquese con nuestros ejecutivos a <a href="mailto:contacto@cyvec.cl">contacto@cyvec.cl</a> o diríjase directamente a nuestra sucursal</p>
                        </div>
            </div>

        </div><!--cierre container-->
        <br>
        <br>
        <br>
        <br>


        <footer class="page-footer light-blue darken-4">
            <div class="footer-copyright">
                <div class="container-footer">
                    <p class="white-text center">Encuentrános en San diego #123, Santiago Centro.<br>
                        En los horarios Lunes a Viernes de 09:00 a 19:00 horas.</p>
                </div>
            </div>
        </footer>




        <!--  Scripts-->
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <!--JavaScript at end of body for optimized loading-->
        <script type="text/javascript" src="js/materialize.min.js"></script>

        <script src="js/init.js"></script>
        <script>
            document.addEventListener('DOMContentLoaded', function () {
                var elems = document.querySelectorAll('.slider');
                var instances = M.Slider.init(elems, options);
            });

            // Or with jQuery

            $(document).ready(function () {
                $('.slider').slider();
            });
        </script>	

    </body>
</html>