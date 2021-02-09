package com.pattern.creational.prototype;

/**
 * * @author lihaocheng
 * * @createtime 2021/2/7
 */
public class TestMailSend {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail=new Mail();
        mail.setContent("初始化");
        //原始的迭代方法
//        for(int i=0;i<10;i++){
//            mail.setName("name-"+i);
//            mail.setEmailAddress("name-"+i+"@lihaocheng.cn");
//            mail.setContent("恭喜你中了保时捷5元代金券");
//            MailUtil.sendMail(mail);
//        }

        for(int i=0;i<10;i++){
            //使用Object中的浅拷贝
            Mail mailTemp=(Mail) mail.clone();
            mailTemp.setName("name-"+i);
            mailTemp.setEmailAddress("name-"+i+"@lihaocheng.cn");
            mailTemp.setContent("恭喜你中了保时捷5元代金券");
            MailUtil.sendMail(mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
