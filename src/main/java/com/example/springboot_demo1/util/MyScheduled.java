package com.example.springboot_demo1.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author: jxy
 * @DATE: 2020/12/21
 * @Description:
 **/
@Component
public class MyScheduled {
    @Autowired
    private SendMessage sendMessage;

    /*定时执行任务方法 每天5点20执行该任务*/
    @Scheduled(cron ="0/10 1/1 * * * ?")
    public void dsrw() throws Exception {
        String message = sendMessage.getOneS();
        sendMessage.sendMessage("来自清茶淡粥的消息！❤",message);
    }
}
