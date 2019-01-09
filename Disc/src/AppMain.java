import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

public class AppMain {
	public static void main(String[] args) throws SQLException {
		LocalDate localDate = LocalDate.now();
		System.out.println("Year : " + localDate.getYear());
		System.out.println("Month : " + localDate.getMonth().getValue());
		System.out.println("Day of Month : " + localDate.getDayOfMonth());
		System.out.println("Day of Week : " + localDate.getDayOfWeek());
		System.out.println("Day of Year : " + localDate.getDayOfYear());

		try (Connection con = DbConnectDAO.connect()) {
			
		}

	}
}
