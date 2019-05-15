package com.renly;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @author ${任岚杨}
 * @title: My_10Sendmail
 * @projectName workspace_renly
 * @description: TODO
 * @date 2019/4/2611:44
 */
public class My_10Sendmail {

    /**
     * 创建一封只包含文本的邮件
     */
    public static MimeMessage createSimpleMail(Session session)
            throws Exception {
        //步骤1：创建邮件对象
        MimeMessage message = new MimeMessage(session);

        //步骤2：指明邮件的发件人
        message.setFrom(new InternetAddress("rly101112@163.com"));

        //步骤3：指明邮件的收件人
        message.setRecipient(Message.RecipientType.TO, new InternetAddress("rly101112@163.com"));

        //步骤4：指明邮件的标题
        message.setSubject("长征-毛泽东");

        //步骤5：指明邮件的内容
        message.setContent("红军不怕远征难，万水千山只等闲。\n" +
                "五岭逶迤腾细浪，乌蒙磅礴走泥丸。\n" +
                "金沙水拍云崖暖，大渡桥横铁索寒。\n" +
                "更喜岷山千里雪，三军过后尽开颜。", "text/html;charset=UTF-8");
        //返回创建好的邮件对象
        return message;
    }

}
