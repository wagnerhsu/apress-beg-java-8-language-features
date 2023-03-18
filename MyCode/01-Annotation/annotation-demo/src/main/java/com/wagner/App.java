package com.wagner;

import lombok.var;
import lombok.extern.slf4j.Slf4j;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

@Slf4j
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        log.info("Hello World!");
        Class<VersionTest> app = VersionTest.class;
        printAnnotation(app);
    }
    public static void printAnnotation(AnnotatedElement c) {
        Annotation[] annList = c.getAnnotations();
        for(var item : annList) {
            if (item instanceof Version) {
                Version v = (Version)item;
                log.info("{}:{}",v.major(),v.minor());
            }
        }
    }
}
