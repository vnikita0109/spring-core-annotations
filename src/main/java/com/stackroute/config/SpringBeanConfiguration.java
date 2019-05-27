package com.stackroute.config;

import com.stackroute.awareInterface.ApplicationContextAwareDemo;
import com.stackroute.awareInterface.BeanFactoryAwareDemo;
import com.stackroute.awareInterface.BeanNameAwareDemo;
import com.stackroute.awareInterface.ResourceLoaderAwareDemo;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringBeanConfiguration {
   // private Actor actor;


//    @Bean(name = "actor1")
//    public Actor getActor(){
//        return new Actor("Kim Tae Hyung","Male",23);
//
//    }
//    @Bean(name = "movie1")
//    public Movie getMovie(){
//        return new Movie(2,"Hwarang",getActor());
//    }

    @Bean(name = "actor2")

    public Actor getActor(){
        return new Actor("Park Seo Joon","Male",30);
    }
    @Bean(name = "actor")

    public Actor getActor1(){
        return new Actor("Park Min young","Female",30);
    }
    @Bean(name = "movie1",autowire = Autowire.BY_NAME)
    public Movie getMovie1(){
        return new Movie(12,"What's Wrong with secretory Kim?");
    }
    @Bean(name = "applicationContextAwareDemo")
    public ApplicationContextAwareDemo applicationContextAwareDemo(){
        return new ApplicationContextAwareDemo();
    }
    @Bean(name = "beanFactoryAwareDemo")
    public BeanFactoryAwareDemo beanFactoryAwareDemo(){
        return new BeanFactoryAwareDemo();
    }
    @Bean(name = "beanNameAwareDemo")
    public BeanNameAwareDemo beanNameAwareDemo(){
        return new BeanNameAwareDemo();
    }
    @Bean(name = "resourceLoaderAwareDemo")
    public ResourceLoaderAwareDemo resourceLoaderAwareDemo(){
        return new ResourceLoaderAwareDemo();
    }
}
