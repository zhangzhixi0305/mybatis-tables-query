package com.zhixi.config;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description 自定义ID生成机制-MyBatisPlus
 * @date 2023-09-16 13:00
 */
@Component
@Slf4j
public class CustomIdGenerator implements IdentifierGenerator {

    /**
     * 全局锁，用于保证线程安全
     */
    private static final Object GLOBAL_LOCK = new Object();

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Number nextId(Object entity) {
        Long newId;
        // 返回表最大id+1
        try {
            TableName tableName = entity.getClass().getAnnotation(TableName.class);
            String sql = "select max(id) from " + tableName.value();
            synchronized (GLOBAL_LOCK) {
                newId = jdbcTemplate.queryForObject(sql, Long.class);
                return newId == null ? 1L : newId + 1;
            }
        } catch (NullPointerException e) {
            throw new RuntimeException("获取表最大id失败，请在实体上添加@TableName注解");
        }
    }
}
