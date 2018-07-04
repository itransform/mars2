package com.lt.config;

import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author tanghaoyu
 * @date 2018/6/23
 */
@Component
public class WechatConfig {
    @Autowired
    private WechatAccountConfig wechatAccountConfig;

    @Bean
    public WxMpService wxMpService(){
      WxMpService wxMpService =  new WxMpServiceImpl();
      wxMpService.setWxMpConfigStorage( wxMpConfigStorage());
      return wxMpService;
    }

    @Bean
    public WxMpConfigStorage wxMpConfigStorage(){
     WxMpInMemoryConfigStorage wxmpconfigStorage = new WxMpInMemoryConfigStorage();
     wxmpconfigStorage.setAppId(wechatAccountConfig.getMpAppId());
     wxmpconfigStorage.setSecret(wechatAccountConfig.getMpAppSecret());
     return wxmpconfigStorage;
    }
}
