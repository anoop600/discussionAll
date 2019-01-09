
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectDAO implements DbConstant {
	public static Connection connect() {

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, user, password);
			// System.out.println("Connection Successful");
		} catch (SQLException e) {

		}

		return connection;
	}

}
