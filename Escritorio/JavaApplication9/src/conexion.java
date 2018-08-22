import java.sql.*;

public class conexion {
    private String db = "miscelanea";
    private String url = "jdbc:mysql://localhost/" + db;
    private String user = "root";
    private String pass = "";
    Connection con = null;
    private Connection conexion;
    private Statement st;
    private ResultSet rs;
    private ResultSetMetaData rsm;
    public conexion(){
        try{
            con = DriverManager.getConnection(url, user, pass);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public Connection getConnection(){
        return con;        
    }
    public void desconectar(){
        con = null;
    }
    
}
