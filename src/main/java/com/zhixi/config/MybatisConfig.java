package com.zhixi.config;

import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.apache.ibatis.mapping.VendorDatabaseIdProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description Mybatis配置类
 * @date 2023-09-07 20:02
 */
@Configuration
public class MybatisConfig {

    /**
     * DatabaseIdProvider元素主要是为了支持不同的数据库
     *
     * @return 数据库标识
     */
    @Bean
    public DatabaseIdProvider getDatabaseIdProvider() {
        DatabaseIdProvider databaseIdProvider = new VendorDatabaseIdProvider();
        Properties properties = new Properties();
        properties.setProperty("Oracle", "oracle");
        properties.setProperty("MySQL", "mysql");
        databaseIdProvider.setProperties(properties);
        return databaseIdProvider;
    }
}
