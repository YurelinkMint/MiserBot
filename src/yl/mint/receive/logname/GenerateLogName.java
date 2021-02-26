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
    private String logName;

    public GenerateLogName() {
        setLogName(getName());
    }

    /**
     * 获取日志名（如果你看源代码的话你会发现这个真的很投机取巧啊喂)
     * @return 日志名字
     * @since CAlpha 1.0 PAlpha 1.0
     */
    protected String getName() {
        LocalDate date = LocalDate.now();
        //获取日期的字符串形式
        return date.toString();
    }
}
