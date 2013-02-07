package org.springaop.chapter.one;

import org.springaop.target.Hello;
import org.springframework.aop.framework.ProxyFactory;

public class AroundAdvice {

    public static void main(String[] args) {

        // target class
        Hello target = new Hello();

        // create the proxy
        ProxyFactory pf = new ProxyFactory();

        // add advice to proxy
        pf.addAdvice(new MethodDecorator());

        // setTarget for proxy
        pf.setTarget(target);

        // Execute proxy
        Hello proxy = (Hello) pf.getProxy();
        proxy.greeting();
    }
}
