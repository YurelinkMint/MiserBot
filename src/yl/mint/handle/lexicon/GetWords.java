package yl.mint.handle.lexicon;

import lombok.*;

import java.io.*;
import java.util.ArrayList;

/**
 * 获取Lexicon.lxn中的所有词
 * @author YL_Mint
 * @version CAlpha 1.0
 * @since PAlpha 1.0
 */

@Getter
@Setter(value = AccessLevel.PROTECTED)
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class GetWords {
    private ArrayList<String> wordList;

    public GetWords() {
        setWordList(getWords());
    }

    /**
     * 获取Lexicon.lxn中的所有关键词
     * @return 词库中的所有关键词
     * @since CAlpha 1.0 PAlpha 1.0
     */
    protected ArrayList<String> getWords() {
        return new Lexicon().getLexicon();
    }
}
