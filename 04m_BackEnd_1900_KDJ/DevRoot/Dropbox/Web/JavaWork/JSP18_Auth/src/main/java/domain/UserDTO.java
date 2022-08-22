package domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private int id;
    private String username;
    private String password;
    private String name;
    private String authorities;
    private LocalDateTime regDate;
   
    // String 으로 리턴하는 getter
    public String getRegDateTime() {
        if(this.regDate == null) return "";
        return this.regDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));    
    }  

} // end DTO


