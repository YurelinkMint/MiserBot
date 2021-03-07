package yl.mint.handle;

import lombok.*;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.logging.Handler;

/**
 * 处理信息
 * @author YL_Mint
 * @version CAlpha 1.0
 * @since PAlpha 1.0
 */

@Getter
@Setter(value =  AccessLevel.PROTECTED)
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class HandleMessage {
    private ArrayList<String> replyMessage;

    public HandleMessage() throws IOException {
        setReplyMessage(summonReplyMessage());
    }

    protected ArrayList<String> summonReplyMessage() throws IOException {
        Checker checker = new Checker();
        LocalTime time = LocalTime.now();
        ArrayList<String> msgList = new ArrayList<>();

        if ("早".equals(checker.getKeyWord())) {
            if (time.getHour() < 8) {
                msgList.add("早啊早啊");
                msgList.add(String.format("现在是%s点%s分", time.getHour(), time.getMinute()));
                msgList.add("起得真早呐~");
            } else if (time.getHour() < 10) {
                msgList.add("早...早上好呐");
                msgList.add(String.format("现在是%s点%s分了耶", time.getHour(), time.getMinute()));
                msgList.add("其实现在已经不算早上了叭......");
                msgList.add("不管怎样，还是本小姐还是要祝你早上好呐");
            } else {
                msgList.add("嗯......现在才起床嘛？");
                msgList.add(String.format("现在都%s点%s分了耶", time.getHour(), time.getMinute()));
                msgList.add("......");
            }

            return msgList;
        } else if ("晚".equals(checker.getKeyWord())) {
            if (time.getHour() < 20 && time.getHour() > 8) {
                msgList.add("确定要现在睡觉嘛？");
                msgList.add(String.format("现在才%s点%s分耶...", time.getHour(), time.getMinute()));
                msgList.add("好吧好吧");
                msgList.add("就算你是昨夜熬夜太晚睡了叭");
                msgList.add("那么本小姐祝你晚安吖");
            } else if (time.getHour() < 22) {
                msgList.add("晚安晚安");
                msgList.add(String.format("现在是%s点%s分", time.getHour(), time.getMinute()));
                msgList.add("睡个好觉做个好梦吖");
            } else if (time.getHour() < 2) {
                msgList.add("叫醒本小姐干嘛呐");
                msgList.add(String.format("现在都%s点%s分了", time.getHour(), time.getMinute()));
                msgList.add("什么？");
                msgList.add("你现在才睡觉mia？");
                msgList.add("好吧好吧");
                msgList.add("那先祝你晚安叭");
                msgList.add("本小姐要去睡觉啦");
            } else {
                msgList.add("晚...晚安？");
                msgList.add(String.format("现在是%s点%s分，太阳都快出来了qwq", time.getHour(), time.getMinute()));
                msgList.add("你现在真的还需要睡觉mia？");
                msgList.add("那......那就祝你做个好的白日梦叭");
            }

            return msgList;
        }
        return null;
    }
}
