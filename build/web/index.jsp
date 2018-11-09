<%-- 
    Document   : index
    Created on : 27-jun-2018, 14:02:49
    Author     : zoek
--%>

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


        <div class="slider">
            <ul class="slides">
                <li>
                    <img src="img/slider-1.jpg"> <!-- random image -->
                    <div class="caption right-align">
                        <h3 style="font-weight: 600;">¡Grandes Marcas!</h3>
                        <h5 class="light grey-text text-lighten-3">A pequeños precios.</h5>
                    </div>
                </li>
                <li>
                    <img src="img/slider2.jpg"> <!-- random image -->
                    <div class="caption left-align">
                        <h3 style="color:#455a64;font-weight: 600;">Menos es más</h3>
                        <h5 class="light blue-grey-text text-darken-3">Ver más sobre este producto</h5>
                    </div>
                </li>
                <li>
                    <img src="img/slider3.jpg"> <!-- random image -->
                    <div class="caption right-align">
                        <h3 style="color: #004d40; font-weight: 600;">Nvidia Geforce GTX</h3>
                        <h5 class="light teal-text text-darken-4">Conoce más.</h5>
                    </div>
                </li>
            </ul>
        </div>


        <!--PRODUCTOS-->	
        <div class="container">
            <br>
            <h4 class="center">Nuestros Productos</h4>
            <hr class="celeste">	
            <br>
            <div class="section">
                <div class="row">
                    <div class="col s12 m4 l4 xl4">
                        <div class="card">
                            <div class="card-image">
                                <img src="img/productos/notebook.jpg">
                            </div>
                            <div class="card-content">
                                <p>Notebook Acer Intel Core I5 4GB RAM-500GB DD 15,6"</p>
                            </div>
                            <div class="card-action center-align">
                                <a href="producto-1.jsp">$400.000</a>
                            </div>
                        </div>
                    </div>


                    <div class="col s12 m4 l4 xl4">
                        <div class="card">
                            <div class="card-image">
                                <img src="img/productos/mouse.jpg">
                            </div>
                            <div class="card-content">
                                <p>Mouse Gamer T1 Indra Rgb Pro Optical</p>
                            </div>
                            <div class="card-action center-align">
                                <a href="producto-2.jsp">$20.000</a>
                            </div>
                        </div>
                    </div> 

                    <div class="col s12 m4 l4 xl4">
                        <div class="card">
                            <div class="card-image">
                                <img src="img/productos/ventilador.jpg">
                            </div>
                            <div class="card-content">
                                <p>Disipador Cpu Cooler Blue Iceberg 2 Ventilador Led Pc Ryzen</p>
                            </div>
                            <div class="card-action center-align">
                                <a href="producto-3.jsp">$40.000</a>
                            </div>
                        </div>
                    </div> 

                </div>

                <div class="row">
                    <div class="col s12 m4 l4 xl4">
                        <div class="card">
                            <div class="card-image">
                                <img src="img/productos/notebook-tablet.jpg">
                            </div>
                            <div class="card-content">
                                <p>Notebook Acer 11.6 Intel Pentium 2GB/32GB/ touch</p>
                            </div>
                            <div class="card-action center-align">
                                <a href="producto-4.jsp">$200.000</a>
                            </div>
                        </div>
                    </div>


                    <div class="col s12 m4 l4 xl4">
                        <div class="card">
                            <div class="card-image">
                                <img src="img/productos/ram.jpg">
                            </div>
                            <div class="card-content">
                                <p>G.SKILL TRIDENT Z RGB 3200MHZ 32GB DDR4 LED RAM F4-3200C16Q-32GTZR</p>
                            </div>
                            <div class="card-action center-align">
                                <a href="producto-5.jsp">$250.000</a>
                            </div>
                        </div>
                    </div> 

                    <div class="col s12 m4 l4 xl4">
                        <div class="card">
                            <div class="card-image">
                                <img src="img/productos/notebook-gamer.jpg">
                            </div>
                            <div class="card-content">
                                <p>Notebook Gamer Acer 15.6" Core I7 Ram 16GB AN515-51-70E1</p>
                            </div>
                            <div class="card-action center-align">
                                <a href="producto-6.jsp">$600.000</a>
                            </div>
                        </div>
                    </div> 

                </div>	


            </div><!--cierre section-->	
        </div><!--cierre container-->

        <!--CIERRRE PRODUCTOS-->
        <hr>

        <!--nosotros-->
        <div class="container">
            <div class="section">

                <!--   Icon Section   -->
                <div class="row">
                    <div class="col s12 m4">
                        <div class="icon-block">
                            <h2 class="center light-blue-text"><i class="material-icons">flash_on</i></h2>
                            <h5 class="center">Rapidez en<br> los envíos</h5>

                            <p class="light center">Contamos con los mejores para el transporte seguro, rápido y eficiente para nuestras entregas.</p>
                        </div>
                    </div>

                    <div class="col s12 m4">
                        <div class="icon-block">
                            <h2 class="center light-blue-text"><i class="material-icons">group</i></h2>
                            <h5 class="center">Profesionales<br> Capacitado</h5>

                            <p class="light center">Contamos con profesionales capacitados para asesorarlos en su compra y así cumplir con todos sus requisitos.</p>
                        </div>
                    </div>

                    <div class="col s12 m4">
                        <div class="icon-block">
                            <h2 class="center light-blue-text"><i class="material-icons">settings</i></h2>
                            <h5 class="center">Servicio <br>Técnico</h5>

                            <p class="light center">Manejamos a técnicos expertos para birndar el mejor soporte en caso de uso o reparaciones de algun producto.</p>
                        </div>
                    </div>
                </div>

            </div>
            <br><br>
        </div>			


        <footer class="page-footer light-blue darken-4">
            <div class="footer-copyright">
                <div class="container-footer">
                    <p class="white-text center">Encuentrános en San diego #123, Santiago Centro.<br>
                        En los horarios Lunes a Viernes de 09:00 a 19:00 horas.</p>  

                    <div class="col s12 center">		
                        <span class="col s6"><a class="colman" href="mantenedor-cliente.jsp">Mantenedor Cliente</a></span>
                        <span class="col s6"><a class="colman" href="mantenedor-producto.jsp">Mantenedor Producto</a></span>
                    </div>  
                </div>

            </div>
        </footer>



        <!--  Scripts-->
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <!--JavaScript at end of body for optimized loading-->
        <script type="text/javascript" src="js/materialize.min.js"></script>
        <script>
                  $(document).ready(function(){
                  $('.slider').slider();
                  });
        </script>	

    </body>
</html>
