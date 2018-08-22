<html>
    <head>
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
        <title> Licha </title>
 </head>
    <body>
        <?php
        $bd_host="localhost";
        $bd_user="root";
        $bd_pass="";
        $bd_name="licha";
        $nombre = ($_POST['nombre']);
        $apellido_paterno = ($_POST['apellido_paterno']);
        $apellido_materno = ($_POST['apellido_materno']);
        $municipio = ($_POST['municipio']);
        $localidad = ($_POST['localidad']);
        $mysqli=mysqli_connect($bd_host,$bd_user,$bd_pass,$bd_name);
            if (mysqli_connect_errno())
            {
                # mysqli_connect_error - Devuelve una cadena con la descripcion del ultimo error de conexion
                printf("Fallo la contexion: %s/n", mysqli_connect_error());
                exit();
            }
            
        # mysqli_set_chatser - Establece el conjunto de caracteres prederterminado del cliente

        $sql = "INSERT INTO clientes (nombre,apellido_paterno,apellido_materno,municipio,localidad) VALUES ('$nombre', '$apellido_paterno', '$apellido_materno',
        '$municipio',
        '$localidad')";
        $resultado = mysqli_query($mysqli, $sql);
        echo "¡Gracias! Hemos recibido sus datos.\n";
        printf("<center><a href='formulario.html'> Volver </a></center>");
        mysqli_close($mysqli);
        ?>
    </body>
</html>