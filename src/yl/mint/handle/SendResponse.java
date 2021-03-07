package yl.mint.handle;

import lombok.*;

import java.io.IOException;
import java.util.ArrayList;

/**
 * 发送响应消息
 * @author YL_Mint
 * @version CAlpha 1.0
 * @since PAlpha 1.0
 */

@Getter
@Setter(value =  AccessLevel.PROTECTED)
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class SendResponse {
    ArrayList<String> response;

    public SendResponse() {
        try {
            setResponse(new HandleMessage().getReplyMessage());
        } catch (IOException e) {
            System.out.println("读写时发生异常");
        }
    }
}
