package yl.mint.receive;

import lombok.*;
import yl.mint.receive.marker.Marker;

import java.util.ArrayList;

/**
 * 筛选日志信息
 * @author YL_Mint
 * @version CAlpha 1.0
 * @since PAlpha 1.0
 */

@Getter
@Setter(value = AccessLevel.PROTECTED)
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
public class Filter {
    private ArrayList<String> filtratedLog;

    public Filter(ArrayList<String> list) {
        setFiltratedLog(filtrate(list));
    }

    /**
     * 输出被过滤的群信息
     * @param list 未经过滤的信息
     * @return 过滤过的信息
     * @since CAlpha 1.0 PAlpha 1.0
     */
    protected ArrayList<String> filtrate(ArrayList<String> list) {
        ArrayList<String> filtratedLog = new ArrayList<>();

        if (list != null) {
            String s2;
            boolean isAbleToAdd = false;
            Marker.addMarks("");
            int i = 0;

            //过滤掉非群消息的日志
            for (String s : list) {
                if (s.contains("收到群")) {
                    for (String markedStr : Marker.getMarks()) {
                        if (!markedStr.equals(s)) {
                            isAbleToAdd = true;
                            Marker.addMarks(s);
                        }
                    }

                    if (isAbleToAdd) {
                        filtratedLog.add(s);
                    }
                }
            }
        }


        return filtratedLog;
    }
}
