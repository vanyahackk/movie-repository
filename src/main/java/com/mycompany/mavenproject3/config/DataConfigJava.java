package com.mycompany.mavenproject3.config;
import com.mycompany.mavenproject3.mappers.descriptionMappers;
import com.mycompany.mavenproject3.mappers.filmsMappers;
import com.mycompany.mavenproject3.mappers.genersHasFilmMappers;
import com.mycompany.mavenproject3.mappers.genersMappers;
import com.mycompany.mavenproject3.mappers.reviewsMappers;
import com.mycompany.mavenproject3.mappers.yearMappers;
import org.apache.commons.dbcp.BasicDataSource; 
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean; 
import org.mybatis.spring.annotation.MapperScan; 
import org.mybatis.spring.mapper.MapperFactoryBean;
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
sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mappers/*.xml")); 
return sessionFactory; 
} 
  @Bean
    public MapperFactoryBean<descriptionMappers> descriptionMappers() throws Exception {
        MapperFactoryBean<descriptionMappers> factoryBean = new MapperFactoryBean<>(descriptionMappers.class);
        factoryBean.setSqlSessionFactory((SqlSessionFactory) sqlSessionFactory());
        return factoryBean;
    }
      @Bean
    public MapperFactoryBean<filmsMappers> filmsMappers() throws Exception {
        MapperFactoryBean<filmsMappers> factoryBean = new MapperFactoryBean<>(filmsMappers.class);
        factoryBean.setSqlSessionFactory((SqlSessionFactory) sqlSessionFactory());
        return factoryBean;
    }
          @Bean
    public MapperFactoryBean<genersHasFilmMappers> genersHasFilmMappers() throws Exception {
        MapperFactoryBean<genersHasFilmMappers> factoryBean = new MapperFactoryBean<>(genersHasFilmMappers.class);
        factoryBean.setSqlSessionFactory((SqlSessionFactory) sqlSessionFactory());
        return factoryBean;
    }
            @Bean
    public MapperFactoryBean<genersMappers> genersMappers() throws Exception {
        MapperFactoryBean<genersMappers> factoryBean = new MapperFactoryBean<>(genersMappers.class);
        factoryBean.setSqlSessionFactory((SqlSessionFactory) sqlSessionFactory());
        return factoryBean;
    }
               @Bean
    public MapperFactoryBean<reviewsMappers> reviewsMappers() throws Exception {
        MapperFactoryBean<reviewsMappers> factoryBean = new MapperFactoryBean<>(reviewsMappers.class);
        factoryBean.setSqlSessionFactory((SqlSessionFactory) sqlSessionFactory());
        return factoryBean;
    }
                   @Bean
    public MapperFactoryBean<yearMappers> yearMappers() throws Exception {
        MapperFactoryBean<yearMappers> factoryBean = new MapperFactoryBean<>(yearMappers.class);
        factoryBean.setSqlSessionFactory((SqlSessionFactory) sqlSessionFactory());
        return factoryBean;
    }
    


}

