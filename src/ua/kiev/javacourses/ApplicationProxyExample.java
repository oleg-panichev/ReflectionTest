package ua.kiev.javacourses;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.Callable;

/**
 * Created by Oleg on 29.03.14.
 */
public class ApplicationProxyExample {
    public static void main(String[] args) throws Exception {
        final Callable target=new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("Target method execution");
                return null;
            }
        };
        Callable proxy=(Callable) Proxy.newProxyInstance(ApplicationProxyExample.class.getClassLoader(),
                new Class[]{Callable.class},new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("Proxy: before method.");
                Object result=method.invoke(target, args);
                System.out.println("Proxy: after method.");
                return result;
            }
        });
        proxy.call();
    }
}
