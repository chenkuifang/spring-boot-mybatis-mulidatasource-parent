package com.example.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态路由数据源
 *
 * @author QuiFar
 */
@Slf4j
public class DynamicRoutingDataSource extends AbstractRoutingDataSource {

    /**
     * 设置一个查找Key,用于绑定事物上下文
     *
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        log.info("Current DataSource is {}", DynamicDataSourceContextHolder.getDataSourceKey());
        return DynamicDataSourceContextHolder.getDataSourceKey();
    }
}
