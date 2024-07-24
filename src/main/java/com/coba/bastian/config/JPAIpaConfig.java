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
@ConfigurationProperties("spring.datasource.ipa.hikari")
@EnableJpaRepositories(
        basePackages = {"com.coba.bastian.data"},
        entityManagerFactoryRef = "ipaManagementEntityManagerFactory",
        transactionManagerRef = "ipaManagementTransactionManager"
)
public class JPAIpaConfig extends HikariConfig{

    @Autowired
    private HibernateConfig hibernateConfig;

    @Bean
    public HikariDataSource ipaManagementDataSource() {return new HikariDataSource(this);}

    @Bean
    public LocalContainerEntityManagerFactoryBean ipaManagementEntityManagerFactory() {

        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setGenerateDdl(false);

        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();

        factoryBean.setDataSource(ipaManagementDataSource());
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        factoryBean.setPackagesToScan("com.coba.bastian.dao");
        factoryBean.setPersistenceUnitName("ipapersistenceunit");
        factoryBean.setJpaProperties(hibernateConfig.toProperties());
        return factoryBean;
    }

    @Bean
    public PlatformTransactionManager ipaManagementTransactionManager() {
        return new JpaTransactionManager(Objects.requireNonNull(ipaManagementEntityManagerFactory().getObject()));
    }
}
