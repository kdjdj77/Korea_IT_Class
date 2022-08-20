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
	private int id;    				// bk_id
	private String title;	  		// bk_title
	private String summary;  		// bk_summary
	private String price;    		// bk_price
	private int viewCnt;  			// bk_viewcnt
	private LocalDateTime regDate;  // bk_regdate

	public String getRegDateTime() {
		if (this.regDate == null) return "";
		return this.regDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	}
}
