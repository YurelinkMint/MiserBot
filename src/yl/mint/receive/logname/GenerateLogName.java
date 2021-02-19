package yl.mint.receive.logname;

import lombok.*;

import java.time.LocalDate;

/**
 * 生成日志文件名
 * @author YL_Mint
 * @version CAlpha 1.0
 * @since PAlpha 1.0
 */

@Getter
@Setter(value = AccessLevel.PROTECTED)
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class GenerateLogName {
    String logName;

    public GenerateLogName() {
        logName = getName();
    }

    protected String getName() {
        LocalDate date = LocalDate.now();
        return date.toString();
    }
}
