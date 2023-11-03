package crowdfunding.crowdfunding.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class ItemDTO {
    private int itemNum;
    private String makerId;
    private LocalDateTime createDate;
    @NotEmpty(message = "제목은 입력하셔야합니다.")
    private String itemTitle;
    @NotEmpty(message = "내용을 입력하세요.")
    private String itemContent;
    @NotNull(message = "목표금액을 설정하셔야합니다.")
    private BigInteger targetAmount;
    //@NotNull(message = "목표기간을 설정하셔야합니다.")
    private LocalDate targetPeriod;
}
