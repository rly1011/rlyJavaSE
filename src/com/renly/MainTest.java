package com.renly;

/**
 * @author ${任岚杨}
 * @title: MainTest
 * @projectName workspace_renly
 * @description: TODO
 * @date 2019/5/516:21
 */
public  class MainTest {
    public static void main(String[] args) throws Exception {
        /**
         * 1.线程实例
         */
        My_11Thread t1 = new My_11Thread();

        My_11Runnable my11Runnable = new My_11Runnable();
        Thread t2 = new Thread( my11Runnable );

//        t1.setPriority( 1 );//优先级：1--5（默认），只代表获取CPU几率大，并不是先执行

        t1.start();
        t2.start();


        /**
         * 2.邮件发送
         */
           /* Properties prop = new Properties();
            prop.setProperty("mail.host", "smtp.163.com");
            prop.setProperty("mail.transport.protocol", "smtp");
            prop.setProperty("mail.smtp.auth", "true");

            *//**
             *使用JavaMail发送邮件的5个步骤
             *//*

            //步骤1：创建session
            Session session = Session.getInstance(prop);

            //步骤2：开启Session的debug模式，这样就可以查看到程序发送Email的运行状态
            session.setDebug(true);

            //步骤3：通过session得到transport对象
            Transport ts = session.getTransport();

            //步骤4：使用邮箱的用户名和密码连上邮件服务器，发送邮件时，发件人需要提交邮箱的用户名和密码给smtp服务器，
            // 用户名和密码都通过验证之后才能够正常发送邮件给收件人。
            ts.connect("smtp.163.com", "rly101112@163.com", "tianxia95");

            //步骤5：创建邮件
            Message message = createSimpleMail(session);

            //步骤6：发送邮件
            ts.sendMessage(message, message.getAllRecipients());
            ts.close();*/

    }
}
