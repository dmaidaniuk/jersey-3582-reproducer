package io.github.jersey.samples.validation;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("resources")
public class MyApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> set = new HashSet<>();
        set.add(FormController.class);
        return set;
    }
}
