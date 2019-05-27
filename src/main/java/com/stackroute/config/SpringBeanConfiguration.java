package com.stackroute.config;

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


}
