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

    public GetFiltratedGroupMessage() {
        try {
            setGroupMsg(getMessage());
        } catch (IOException e) {
            System.out.println("读写时发生异常");
        }
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
                                                "D:\\YL_Mint\\Mint's Projects\\Programmes\\MiserBot 米姬\\Onebot\\logs\\" + new GenerateLogName().getLogName() + ".log")))
                        .getLogs())
                .getFiltratedLog();
    }
}
