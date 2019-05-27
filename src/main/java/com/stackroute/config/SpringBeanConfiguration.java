package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringBeanConfiguration {
    Actor actor;
    /*@Bean(name = "actor1")
    public Actor getActor(){
        return new Actor("Kim Tae Hyung","Male",22);
    }
     @Bean(name = "movie1")
    public Movie getMovie(){
        return new Movie(2,"Hwarang",getActor());
    }
*/
    @Bean(name = "actor0")
    public Actor getActor(){
        actor =new Actor();
        actor.setActorName("Lee Jong Gi");
        actor.setGender("Male");
        actor.setAge(29);
        return actor;
    }
    @Bean(name = "movie1")
    public Movie getMovie(){
        return new Movie(1,"Reyo",getActor());
    }

}
