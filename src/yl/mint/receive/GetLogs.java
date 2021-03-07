package yl.mint.receive;

import lombok.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 获取日志信息
 * @author YL_mint
 * @version CAlpha 1.1
 * @since PAlpha 1.0
 */

@Getter
@Setter(value = AccessLevel.PROTECTED)
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class GetLogs {
    private ArrayList<String> logs;

    /**
     * 类构造器，调用readLog(BufferedReader)方法，为变量ArrayList<String> logs赋值，随后用户可调用Getter方法获取logs.
     * @param reader 用于方法readLog(BufferedReader)方法的参数
     * @throws IOException 当I/O出错时抛出
     * @since CAlpha 1.0 PAlpha 1.0
     */
    public GetLogs(BufferedReader reader) throws IOException {
        setLogs(readLog(reader));
    }

    /**
     * 读取日志
     * @param reader 关联到日志文件的输入流
     * @return 群信息
     * @throws IOException 当读写发生错误时抛出
     * @since CAlpha 1.0 PAlpha 1.0
     */
    protected ArrayList<String> readLog(BufferedReader reader) throws IOException {
        String log;
        ArrayList<String> logs = new ArrayList<>();

        //将日志中的所有数据读入变量ArrayList<String> logs中
        while ((log = reader.readLine()) != null) {
            logs.add(log);
        }

        reader.close();

        return logs;
    }
}
