package yl.mint.receive;

import lombok.*;
import yl.mint.receive.logname.GenerateLogName;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 * 获取过滤过的群信息
 * @author YL_Mint
 * @version CAlpha 1.0
 * @since PAlpha 1.0
 */

@Getter
@Setter(value = AccessLevel.PROTECTED)
@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class GetFiltratedGroupMessage {
    private ArrayList<String> groupMsg;

    public GetFiltratedGroupMessage() throws IOException {
        setGroupMsg(getMessage());
    }

    /**
     * 输出被过滤过的群信息
     * @return 群信息
     * @throws IOException 当读写发生错误时抛出
     * @since CAlpha 1.0 PAlpha 1.0
     */
    protected ArrayList<String> getMessage() throws IOException {
        //获取经过滤的消息
        return new Filter(
                new GetLogs(
                        new BufferedReader(
                                new FileReader(
                                        Path.of(
                                                new GenerateLogName()
                                                .getLogName())
                                                .toFile())))
                        .getLogs())
                .getFiltratedLog();
    }
}
