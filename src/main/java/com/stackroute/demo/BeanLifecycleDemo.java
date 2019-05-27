package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemo implements InitializingBean, DisposableBean {


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing set bean here");
    }


    public void custominit(){
        System.out.println("Customized initializing");
    }

    public void customdestroy(){
        System.out.println("Customized destroying");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying created bean here");
    }
}
