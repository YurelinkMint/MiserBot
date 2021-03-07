package yl.mint.send;

import lombok.*;
import yl.mint.handle.SendResponse;

import java.io.IOException;
import java.util.ArrayList;

/**
 * 发送消息
 * @author YL_Mint
 * @version CAlpha 1.0
 * @since PAlpha 1.0
 */

@Getter
@Setter(value =  AccessLevel.PROTECTED)
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class SendMessage {
    public void checkAndSendMsg() throws IOException {
        ArrayList<String> responseMsg = new SendResponse().getResponse();

        if (responseMsg != null) {
            for (String s : responseMsg) {
                Runtime.getRuntime().exec("curl " +
                        "\"http://127.0.0.1:3916/send_group_msg?group_id=1132182555&message=\"" +
                        s
                        + "\"");
            }
        }

    }
}
