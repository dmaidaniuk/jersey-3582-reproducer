package io.github.jersey.samples.jodatime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class FormDataBean {
    
    private static final String TEMPLATE = "Hello %s! Server time is %s";

    @NotNull @Size(min=1)
    @FormParam("name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String convert() {
        DateTimeFormatter fmt = DateTimeFormat.forPattern("dd MMMM, yyyy HH:mm:ss");
        return String.format(TEMPLATE, name, DateTime.now().toString(fmt));
    }

    @Override
    public String toString() {
        return "FormDataBean{" + "name=" + name + '}';
    }

}
