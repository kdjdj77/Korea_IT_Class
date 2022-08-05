package mysql.db;

public interface QueryMySql {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	//DB 접속 사용자 계정 정보
	public static final String USER = "myuser609";
	public static final String PASSWD = "1234";
	
	public static final String URL =	
			"jdbc:mysql://localhost:3306/mydb609?useSSL=false&serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true";
	
	// PreqaredStatement에서 사용할 SQL문
	public static final String SQL_SELECT_ALL = 
			"SELECT * FROM test_member";
	public static final String SQL_SELECT_BY_NAME = 
			"SELECT * FROM test_member WHERE mb_name = ?";
	public static final String SQL_INSERT = 
			"INSERT INTO test_member VALUES(?, ?, ?)";
	public static final String SQL_UPDATE_NO = 
			"UPDATE test_member SET mb_no = ? WHERE mb_name = ?";
	public static final String SQL_SELECT_ALL2 = 
			"SELECT * FROM test_member2 ORDER BY id DESC";
	public static final String SQL_INSERT2 = 
			"INSERT INTO test_member2 (name) VALUES(?)";
	
	
	
	
}








