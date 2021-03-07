package yl.mint.receive.marker;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 筛选日志信息
 * @author YL_Mint
 * @version CAlpha 1.0
 * @since PAlpha 1.0
 **/
public class Marker {
    static HashSet<String> marks = new HashSet<>();

    public static void addMarks(String mk) {
        marks.add(mk);
    }

    public static HashSet<String> getMarks() {
        return marks;
    }
}
