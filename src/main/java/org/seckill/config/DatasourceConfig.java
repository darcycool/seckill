package org.seckill.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.beans.PropertyVetoException;

/**
 * Created by darcy on 16/5/27.
 */
@Configuration
@PropertySource(value = "classpath:datasource.properties")
public class DatasourceConfig {

    @Value("${c3p0.url}")
    private String url;

    @Value("${c3p0.username}")
    private String userName;

    @Value("${c3p0.password}")
    private String password;

    @Value("${c3p0.driver-class-name}")
    private String driver;

    @Value("${c3p0.max-pool-size}")
    private int maxPoolSize;

    @Value("${c3p0.min-pool-size}")
    private int minPoolSize;

    @Value("${c3p0.checkout-timeout}")
    private int checkoutTimeout;

    /**
     *
     * @return
     * @throws PropertyVetoException
     */
    @Bean
    public ComboPooledDataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setJdbcUrl(url);
        dataSource.setUser(userName);
        dataSource.setPassword(password);
        dataSource.setDriverClass(driver);
        dataSource.setMaxPoolSize(maxPoolSize);
        dataSource.setMinPoolSize(minPoolSize);
        dataSource.setAutoCommitOnClose(false);
        dataSource.setCheckoutTimeout(checkoutTimeout);
        dataSource.setAcquireRetryAttempts(2);

        return dataSource;
    }
}
