package com.stackroute;

import com.stackroute.config.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){

//        ApplicationContext context;
//        context = new AnnotationConfigApplicationContext(Movie.class);
//        Movie movie=context.getBean(Movie.class);
//        movie.setMovieName("Trolls");
//        movie.getMovieName();
//        System.out.println(movie);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

//        Movie movie=ctx.getBean(Movie.class,"actor1");
//        System.out.println(movie.getMovieName()+" has casted "+movie.getActor());

        Movie movie1=ctx.getBean("movie1",Movie.class);
        Movie movie2=ctx.getBean("movie1",Movie.class);
        System.out.println(movie1==movie2);

    }
}
