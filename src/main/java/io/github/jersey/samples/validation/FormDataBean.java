package io.github.jersey.samples.validation;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;

public class FormDataBean {

    @NotNull @Size(min=1)
    @FormParam("name")
    private String name;

    @Min(18)
    @FormParam("age")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "FormDataBean{" + "name=" + name + ", age=" + age + '}';
    }

}
