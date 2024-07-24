package com.coba.bastian.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import java.util.Objects;

@Configuration
@ConfigurationProperties("spring.datasource.generator.hikari")
@EnableJpaRepositories(
        basePackages = {"com.coba.bastian.repository"},
        entityManagerFactoryRef = "generatorManagementEntityManagerFactory",
        transactionManagerRef = "generatorManagementTransactionManager"
)
public class JPAGeneratorConfig extends HikariConfig {

    @Autowired
    private HibernateConfig hibernateConfig;

    @Primary
    @Bean
    public HikariDataSource generatorManagementDataSource() {
        return new HikariDataSource(this);
    }

    @Primary
    @Bean("generatorManagementEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean generatorManagementEntityManagerFactory() {
            HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setGenerateDdl(false);

    LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();

        HikariDataSource hd = generatorManagementDataSource();

        factoryBean.setDataSource(hd);
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        factoryBean.setPackagesToScan("com.coba.bastian.dao");
        factoryBean.setPersistenceUnitName("generatorpersistenceunit");
        factoryBean.setJpaProperties(hibernateConfig.toProperties());
        return factoryBean;
    }

    @Bean
    public PlatformTransactionManager generatorManagementTransactionManager() {
        return new JpaTransactionManager(Objects.requireNonNull(generatorManagementEntityManagerFactory().getObject()));
    }
}
