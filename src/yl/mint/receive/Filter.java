package yl.mint.receive;

import lombok.*;

import java.util.ArrayList;

/**
 * 筛选日志信息
 * @author YL_Mint
 * @version CAlpha 1.0
 * @since PAlpha 1.0
 */

@Data
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
public class Filter {
    ArrayList<String> filtratedLog;

    public Filter(ArrayList<String> list) {
        filtratedLog = filtrate(list);
    }

    protected ArrayList<String> filtrate(ArrayList<String> list) {
        ArrayList<String> filtratedLog = new ArrayList<>();

        for (String s : list) {
            if (s.contains("[INFO]: 收到群")) {
                filtratedLog.add(s);
            }
        }

        return filtratedLog;
    }
}
