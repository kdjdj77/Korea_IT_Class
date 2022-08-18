package domain;

import java.sql.SQLException;
import java.util.List;

/*
	DAO : Data Access Object
	Data source와의 접근 및 작업 전담
	
	데이터 동작과 관련된 모든 것들을 작성
 */
public interface WriteDAO {
	// 새 글 작성	<-- DTO
	public abstract int insert(WriteDTO dto) throws SQLException;
	
	//특정 id 글 읽어오기 (SELECT)
	public abstract List<WriteDTO> selectById(int id) throws SQLException;
	
	//특정 id 글 조회수 증가 (UPDATE)
	public abstract int incViewCnt(int id) throws SQLException;
	




}
