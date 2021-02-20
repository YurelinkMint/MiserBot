package yl.mint.handle;

import lombok.*;

import yl.mint.receive.GetFiltratedGroupMessage;

import java.io.IOException;
import java.util.ArrayList;

/**
 * 检查消息中是否有关键字并提取关键子（在有的情况下）
 * @author YL_Mint
 * @version CAlpha 1.0
 * @since PAlpha 1.0
 */

@Getter
@Setter(value =  AccessLevel.PROTECTED)
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Checker {
    private String keyWord;
    private String arg;

    public Checker() throws IOException {
        setKeyWord(interceptKeywords());
        setArg(interceptArgs());
    }

    /**
     * 获取关键词
     * @return 关键词（若无则返回null）
     * @throws IOException 读写时发生错误抛出
     * @since CAlpha 1.0 PAlpha 1.0
     */
    protected String interceptKeywords() throws IOException {
        ArrayList<String> msgList = new GetFiltratedGroupMessage().getGroupMsg();
        ArrayList<String> wordList = new GetWords().getWordList();

        for (String s : msgList) {
            if (wordList.contains(s)) {
                return s;
            }
        }

        return null;
    }

    /**
     * 获取关键词参数
     * @return 关键词参数（若无则返回null）
     * @since CAlpha 1.0 PAlpha 1.0
     */
    protected String interceptArgs() {
        final String GOOD_MORNING = "早";
        final String GOOD_NIGHT = "晚";
        final String SIGH_IN = "签到";

        if (getKeyWord().equals(GOOD_MORNING) || getKeyWord().equals(GOOD_NIGHT) || getKeyWord().equals(SIGH_IN)) {
            return null;
        }

        return null;
    }
}
