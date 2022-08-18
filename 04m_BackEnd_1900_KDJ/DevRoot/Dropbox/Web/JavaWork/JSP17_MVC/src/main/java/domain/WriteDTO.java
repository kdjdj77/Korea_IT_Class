package domain;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WriteDTO {
	private int id;    				// wr_id
	private String subject;  		// wr_subject
	private String content;  		// wr_content
	private String name;    		// wr_name
	private int viewCnt;  			// wr_viewcnt
	private LocalDateTime regDate;  // wr_regdate

}
