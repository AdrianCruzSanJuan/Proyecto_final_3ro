<html>
    <head>
        <title> Los arcos</title>
        <style>
            body{
                font-family: cursive;
                text-align: center;
            }
            input{
                border-radius: 50px;
                font-family: monospace;
            }
            a{
                color: crimson;
                font-family:fantasy;
                text-decoration: none;
                font-size: 20px;
            }
            </style>
 </head>
    <body>
        <?php
        $bd_host="localhost";
        $bd_user="root";
        $bd_pass="";
        $bd_name="miscelanea";
        $conectar=mysqli_connect($bd_host,$bd_user,$bd_pass,$bd_name);
            if (mysqli_connect_errno())
            {
                # mysqli_connect_error - Devuelve una cadena con la descripcion del ultimo error de conexion
                printf("Fallo la contexion: %s/n", mysqli_connect_error());
                exit();
            }
            
            # mysqli_set_chatser - Establece el conjunto de caracteres prederterminado del cliente
            
            
            $consultar = 'SELECT * FROM productos';
            
            # my sqli_query - Realiza una consulta a a base de datos
            mysqli_set_charset($conectar,'utf-8');
            if ($resultado = mysqli_query($conectar, $consultar))
            {
                # mysqli_fetch_row - Obtener una fila de resultados como un array enumerado
                printf("
                <table id='hola' align='center' border='4' bordercolor='pink' cellpadding='10' cellspacing='20'>
                <tr>
                    <td>CODIGO_P</td>
                    <td>NOMBRE_P</td>
                    <td>MARCA</td>
                    <td>CONTENIDO</td>
                    <td>F_INGRESO</td>
                    <td>TIPO_PROD</td>
                    <td>PRECIO_COM</td>
                    <td>PRECIO_VEN</td>
                    <td>CADUCIDAD</td>
                    <td>ID_PROV</td>
                    <td>DESCRIPCION</td>
                </tr>");
                while($fila=mysqli_fetch_row($resultado)){
                    printf("
                <tr>
                    <td>%s</td>
                    <td>%s</td>
                    <td>%s</td>
                    <td>%s</td> 
                    <td>%s</td> 
                    <td>%s</td> 
                    <td>%s</td> 
                    <td>%s</td> 
                    <td>%s</td> 
                    <td>%s</td> 
                    
                </tr>",
                      $fila[0],
                      $fila[1],
                      $fila[2],
                      $fila[3],
                      $fila[4],
                      $fila[5],
                      $fila[6],
                      $fila[7]
                      $fila[8]
                      $fila[9]
                      $fila[10]);
                }
                printf("</table>");
                printf("<center><a href='formulario.html'> Volver </a></center>");
                mysqli_free_result($resultado);
            }
        
            # mysqli_close - Cierra una conexión previamente abierta a una base de datos
            mysqli_close($conectar);
        ?>
    </body>
</html>