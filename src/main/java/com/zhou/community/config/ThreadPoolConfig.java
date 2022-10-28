package com.zhou.community.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author zyh
 * @create 2022-10-24 11:10
 */
@Configuration
@EnableScheduling
@EnableAsync
public class ThreadPoolConfig {
}
