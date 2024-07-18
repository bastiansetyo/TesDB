//package com.coba.bastian.config;
//
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//import jakarta.persistence.EntityManagerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import javax.sql.DataSource;
//import java.util.Objects;
//
//@Configuration
//@ConfigurationProperties("spring.datasource.secondary")
//@EnableJpaRepositories(
//        basePackages = {"com.coba.bastian.data"},
//        entityManagerFactoryRef = "secondaryEntityManagerFactory",
//        transactionManagerRef = "secondaryTransactionManager"
//)
//public class JPAGeneratorConfig extends HikariConfig{
//
////    @Autowired
//    private HibernateConfig hibernateConfig;
//
//    @Bean(name = "SecondaryDataSource")
//    public HikariDataSource generatorManagementDataSource() {
//
//     return new HikariDataSource(this);
//    }
//
//    @Bean(name = "secondaryEntityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean secondaryEntityManagerFactory() {
//        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
//        jpaVendorAdapter.setGenerateDdl(false);
//
//        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
//
//        factoryBean.setDataSource(generatorManagementDataSource());
//        factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
//        factoryBean.setPackagesToScan("com.coba.bastian.domain");
//        factoryBean.setPersistenceUnitName("secondarypersistenceunit");
//        factoryBean.setJpaProperties(hibernateConfig.toProperties());
//        return factoryBean;
//    }
//
//    @Bean
//    public PlatformTransactionManager secondaryTransactionManager() {
//        return new JpaTransactionManager(Objects.requireNonNull(secondaryEntityManagerFactory().getObject()));
//    }
//
//
//}
