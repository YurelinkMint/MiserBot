package yl.mint.main;

import lombok.*;
import yl.mint.send.SendMessage;

import java.io.IOException;

/**
 * 主类
 * @author YL_Mint
 * @version CAlpha 1.0
 * @since PAlpha 1.0
 */

@Getter
@Setter(value =  AccessLevel.PROTECTED)
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class MainClass {
    public static void main(String[] args) throws IOException {
        SendMessage sm = new SendMessage();

        while (true) {
            sm.checkAndSendMsg();
        }
    }
}
