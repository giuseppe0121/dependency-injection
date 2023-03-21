package co.develhope.dependencyinjection.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent(){
        System.out.println("MyComponent constructor");
        this.myComponentName = "Karl Leeds";
    }

    public String getMyComponentName(){
        System.out.println("MyComponent.getMyComponentName()");
        return myComponentName;
    }

}
