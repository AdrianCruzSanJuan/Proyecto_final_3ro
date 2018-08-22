<DOCTYPE html>
<html>
<head>
<title> Conexi&oacute;n de PHP con MySQL</title>
    <style>
        lable, {margin : auto ;
            width : 9000px; 
            border-collapse : collapse}
        table, tr, td {border : 1px solid black; background-color : #663399 }
    </style>
    </head>
    <body>
       <?php
    $bd_host = "127.0.0.1";
    $db_user = "root";
    $bd_pass = "";
    $bd_name = "Miscelanea";
    # mysqli_connect - Abre una nueva conexión al servidor de MySQL
    $conectar = mysqli_connect($bd_host, $bd_user, $bd_pass, $bd_name, 3307);
    
    # mysqli_connect_errno - Devuelve el código de error de la última llamada
    if (mysqli_connect_errno())
    {
        # mysqli_connect errno - Devuelve una cadena con la descripción del último error de conección
        printf("Falló la conección: %s\n", mysqli_connect_error());
        exit();
    }
    # mysqli_set_charset - Establece el conjunto de caracteres predeterminando del cliente
    mysqli_set_charset($conectar, 'utf8');
    
    $consultar 'SELECT * FROM productos';
    # mysqli_query - Realiza una consulta a la base de datos
    if ($resultado = mysqli_query($conectar, $consultar))
    {
      
       <?php
    $bd_host = "127.0.0.1";
    $db_user = "root";
    $bd_pass = "";
    $bd_name = "miscelanea";
    # mysqli_connect - Abre una nueva conexión al servidor de MySQL
    $conectar = mysqli_connect($bd_host, $bd_user, $bd_pass, $bd_name, 3307);
    
    # mysqli_connect_errno - Devuelve el código de error de la última llamada
    if (mysqli_connect_errno())
    {
        # mysqli_connect errno - Devuelve una cadena con la descripción del último error de conección
        printf("Falló la conección: %s\n", mysqli_connect_error());
        exit();
    }
    # mysqli_set_charset - Establece el conjunto de caracteres predeterminando del cliente
    mysqli_set_charset($conectar, 'utf8');
    
    $consultar 'SELECT * FROM Productos';
    # mysqli_query - Realiza una consulta a la base de datos
    if ($resultado = mysqli_query($conectar, $consultar))
    {
        
        printf("<table>
              <tr>
                    <td>codigo</td>
                    <td>nombre</td>
                    <td>marca</td>
                    <td>precio</td>
                    <td>fecha cad</td>
                    <td>tipo</td>
                </tr>");
        # mysqli_fetch-row - Obtener una fila de resultados como un array enumerodo
        while ($fila = mysqli_fetch_row($resultado))
        {
            printf("<tr><td>%d</td><td>%s</td> <td>%s</td> <td>%s</td> <td>%s</td> <td>%s</td> <td>$%d</td></tr>", $fila[0], $fila[1], $fila[2], $fila[3], $fila[4], $fila[5], $fila[6]); 
        }
        printf("</table>");
        #