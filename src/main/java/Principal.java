import java.sql.Connection;
import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) {
		
		try {
			Connection conexion = ConexionDB.getConexion();
			System.out.println("Conectado");
		} catch (SQLException e) {
			
		}

	}

}
