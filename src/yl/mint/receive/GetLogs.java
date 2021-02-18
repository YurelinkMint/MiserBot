package yl.mint.receive;

import lombok.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 获取日志信息
 * @author YL_mint
 * @version CAlpha 1.0
 * @since PAlpha 1.0
 */

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class GetLogs {
    ArrayList<String> logs;

    /**
     * 类构造器，调用readLog(BufferedReader)方法，为变量ArrayList<String> logs赋值，随后用户可调用Getter方法获取logs.
     * @param reader 用于方法readLog(BufferedReader)方法的参数
     * @throws IOException 当I/O出错时抛出
     */
    public GetLogs(BufferedReader reader) throws IOException {
        logs = readLog(reader);
    }

    private ArrayList<String> readLog(BufferedReader reader) throws IOException {
        String log;
        ArrayList<String> logs = new ArrayList<>();

        //将日志中的所有数据读入变量ArrayList<String> logs中
        while ((log = reader.readLine()) != null) {
            logs.add(log);
        }

        return logs;
    }
}
