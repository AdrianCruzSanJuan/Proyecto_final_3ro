<!DOCTYPE html>
  <html>
<head>
      <title> Eliminar registros - PHP con MySQL</title>
      </head>
<body>
<?php
    $bd_host = "127.0.0.1";
    $db_user = "root";
    $bd_pass = "";
    $bd_name = "pizzeria";
    #variable proveniente del formulario
    $codigo = (int)$_POS["txtcodigo"];
    $ingre = htmlspecialchars($_POS["areaInger2"]);
    # mysqli_connect - Abre una nueva conexión al servidor de MySQL
    $conectar = mysqli_connect($bd_host, $bd_user, $bd_pass, $bd_name, 3307);
    # mysqli_connect_errno - Devuelve el código de error de la última llamada
    if (mysqli_connect_errno())
    {
    # mysqli_connect errno - Devuelve una cadena con la descripción del último error de conexión
        printf("ERROR: %u - %s", 
    mysqli_connect_errno());           mysqli_connect_error());
        exit();
    }
    #mysqli_set_charset - Establece el conjunto de cracteres predeterminado del cliente
    mysqli_set_charset($conectar, "utf8");
    $actualizar = "UPDATE PEDIDO SET INGREDIENTES = '$ingre' WHERE CODIGO = '$codigo'";
    #mysqli_query - Realiza una consulta a la base de datos
    if ($resultado = mysqli_query($conectar, $actualizar))
    #mysqli_affected_rows - Obtiene el número de filas afectadas en la anterior operación de MySQL
    if (mysqli_affected_rows($conectar) ==0)
    {
        printf("El código proporcionado no existe");
    }
    else
    {
        printf("Se ha(n) actualizado %u Regustros(s)", mysqli_affected_rows($conectar));
    }
    else
    {
        printf("ERROR - AL actualizar la BD");
    }
    # mysqli_close - Cierra una conexión previamente abierta a una nueva base de datos
    mysqli_close($conectar);
    
?>
    </body>
</html>