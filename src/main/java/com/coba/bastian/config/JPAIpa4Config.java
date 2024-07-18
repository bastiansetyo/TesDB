package com.coba.bastian.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.jpa.boot.spi.EntityManagerFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.util.Objects;

@Configuration
@ConfigurationProperties("spring.datasource.primary")
@EnableJpaRepositories(
        basePackages = {"com.coba.bastian.repository"},
        entityManagerFactoryRef = "primaryEntityManagerFactory",
        transactionManagerRef = "primaryTransactionManager"
)



public class JPAIpa4Config extends HikariConfig {

//    @Autowired
    private HibernateConfig hibernateConfig;

    @Primary
    @Bean
    public DataSource primaryDataSource() {
        return new HikariDataSource(this);
    }

    @Primary
    @Bean(name = "primaryEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean primaryEntityManagerFactory() {
            HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setGenerateDdl(false);

    LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();

        DataSource hd = primaryDataSource();

        factoryBean.setDataSource(hd);
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        factoryBean.setPackagesToScan("com.coba.bastian.domain");
        factoryBean.setPersistenceUnitName("primarypersistenceunit");
        factoryBean.setJpaProperties(hibernateConfig.toProperties());
        return factoryBean;
    }

    @Bean
    public PlatformTransactionManager primaryTransactionManager() {
        return new JpaTransactionManager(Objects.requireNonNull(primaryEntityManagerFactory().getObject()));
    }
}
