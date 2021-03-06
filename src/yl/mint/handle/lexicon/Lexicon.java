package yl.mint.handle.lexicon;

import lombok.*;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 词库
 * @author YL_Mint
 * @version CAlpha 1.0
 * @since PAlpha 1.0
 */

@Getter
@Setter(value = AccessLevel.PROTECTED)
@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class Lexicon {
    private ArrayList<String> lexicon;

    public Lexicon() {
        lexicon = summonLexicon();
    }

    /**
     * 生成词库
     * @return 词库
     * @since CAlpha 1.0 PAlpha 1.0
     */
    protected ArrayList<String> summonLexicon() {
        String[] keyWords = new String[] {
                "早",
            "晚" ,
                "签到"
        };

        return new ArrayList<>(Arrays.asList(keyWords));
    }
}
