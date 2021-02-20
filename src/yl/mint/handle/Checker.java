package yl.mint.handle;

import lombok.*;
import yl.mint.receive.GetFiltratedGroupMessage;

import java.io.IOException;
import java.util.HashMap;

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
    private boolean hasKeyWord;
    private String args;
    private String keyWord;


}
