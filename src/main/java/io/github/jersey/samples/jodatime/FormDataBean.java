package io.github.jersey.samples.jodatime;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import org.asciidoctor.Asciidoctor;
import org.asciidoctor.Options;

public class FormDataBean {
    
    private static final String TEMPLATE = "Writing AsciiDoc is easy, {user}!";

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
        Asciidoctor asciidoctor = Asciidoctor.Factory.create();
        Options options = new Options();
        Map<String, Object> values = new HashMap<>();
        values.put("user", name);
        options.setAttributes(values);
        return asciidoctor.convert(TEMPLATE, options);
    }

    @Override
    public String toString() {
        return "FormDataBean{" + "name=" + name + '}';
    }

}
