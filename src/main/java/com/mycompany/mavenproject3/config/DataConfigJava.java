package com.mycompany.mavenproject3.config;
import org.apache.commons.dbcp.BasicDataSource; 
import org.mybatis.spring.SqlSessionFactoryBean; 
import org.mybatis.spring.annotation.MapperScan; 
import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration; 
import org.springframework.core.io.support.PathMatchingResourcePatternResolver; 
import org.springframework.jdbc.datasource.DataSourceTransactionManager; 
@Configuration 
@MapperScan("patch in you mapper directory") 
public class DataConfigJava 
{ 
@Bean 
public BasicDataSource dataSource() 
{ 
BasicDataSource dataSource = new BasicDataSource(); 
dataSource.setDriverClassName("com.mysql.jdbs>driver"); 
dataSource.setUrl("jdbs:mysql://localhost/test?useUnicode=true&characterEncoding=utf8"); 
dataSource.setUsername("root"); 
dataSource.setPassword("root"); 
return dataSource; 
} 
@Bean 
public DataSourceTransactionManager transactionManager() 
{ 
return new DataSourceTransactionManager(dataSource()); 
} 
@Bean 
public SqlSessionFactoryBean sqlSessionFactory() throws Exception 
{ 
SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean(); 
sessionFactory.setDataSource(dataSource()); 
sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:**/persistence/*.xml")); 
return sessionFactory; 
} 

}

