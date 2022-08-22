package domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class WriteDTO {
	private int id;    				// wr_id
	private String subject;  		// wr_subject
	private String content;  		// wr_content
	private String name;    		// wr_name
	private int viewCnt;  			// wr_viewcnt
	private LocalDateTime regDate;  // wr_regdate

	public String getRegDateTime() {
		if (this.regDate == null) return "";
		return this.regDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	}
}
