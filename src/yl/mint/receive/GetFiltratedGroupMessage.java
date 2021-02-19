package yl.mint.receive;

import lombok.*;
import yl.mint.receive.logname.GenerateLogName;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

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
    ArrayList<String> groupMsg;

    public GetFiltratedGroupMessage() throws IOException {
        groupMsg = getMessage();
    }

    protected ArrayList<String> getMessage() throws IOException {
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
