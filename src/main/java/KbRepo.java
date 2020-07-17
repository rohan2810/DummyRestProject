import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class KbRepo {
	Connection con = null;
	
	public KbRepo() {
		String url = "jdbc:postgresql://localhost:5432/test1";
		String username = "postgres";
		String password = "postgres";
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url,username,password);
			
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e);
		}
	}
	
	public Knowledge create(Knowledge k1) {
		
		String sql = "INSERT INTO contribution VALUES (?,?,?,?,?,?,?,?);";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, k1.getDomain());
			st.setString(2, k1.getContext());
			st.setString(3, k1.getType());
			st.setString(4, k1.getOperation());
			st.setString(5, k1.getContribution_data());
			st.setString(6, k1.getObject());
			st.setString(7, k1.getSubmittedOn());
			st.setString(8, k1.getNativeAskID());
			
			st.executeUpdate();
		}
		 catch (SQLException e) {
				System.out.println(e);
			}
		
		return k1;
	}
}
