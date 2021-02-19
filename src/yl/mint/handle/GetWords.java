package yl.mint.handle;

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

    public GetWords() throws IOException {
        wordList = getWords();
    }

    protected ArrayList<String> getWords() throws IOException {
        Reader in = new FileReader(".\\src\\yl\\mint\\handle\\lexicon\\Lexicon.lxn");
        BufferedReader reader = new BufferedReader(in);
        String word;
        ArrayList<String> words = new ArrayList<>();

        while ((word = reader.readLine()) != null) {
            words.add(word);
        }

        return words;
    }
}
