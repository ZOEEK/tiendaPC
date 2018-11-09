<%-- 
    Document   : producto-3
    Created on : 27-jun-2018, 14:17:35
    Author     : zoek
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <a href="#" data-target="nav-mobile" class="sidenav-trigger"><i class="material-icons">menu</i></a>
            </div>
        </nav>





        <!--PRODUCTOS-->	
        <div class="container">
            <br>
            <h4 class="center">Productos</h4>
            <hr class="celeste sinbaja">	
            <br>
            <div class="section">
                <div class="row">

                    <form class="col s12" action="<c:url value="ProductoServlet"/>" method="post">
                    <div class="col s12 m12">
                        <div class="card horizontal">
                            <div class="card-image">
                                <img src="img/productos/ventilador.jpg">
                            </div>
                            <div class="card-stacked">
                                <div class="card-content"><br><br>
                                    <h5>Disipador Cpu Cooler Blue Iceberg 2 Ventilador Led Pc Ryzen</h5>
                                    <p>Disipador de calor para CPU de 4 tubos de contacto directo, de la serie ICEBERG de la marca Cooling Tree Systems. Este enfriador para CPU es compatible con la gran mayoría de procesadores actuales y es conocido por proporcionar la mejor relación costo/desempeño/estética en este tipo de productos. Cuenta con un doble ventilador de 120 mm de velocidad regulable por PWM, siendo muy silenciosos y configurables, proporcionando un alto flujo de aire para enfriar los tubos calor. </p>
                                </div>
                                <div class="card-action">
                                    <div class="input-field col s6">
                                        <input placeholder="" hidden id="nombre" type="text" class="validate" name="codigo_producto" value="3">
                                        <label for="nombre"></label>
                                    </div>
                                    Precio Oferta <b>$40.000</b> <button class="btn light-blue right" type="submit" name="btn" value="Comprar">Comprar</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    </form>


                </div>
                


            </div><!--cierre section-->	
        </div><!--cierre container-->

        <!--CIERRRE PRODUCTOS-->


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


    </body>
</html>
