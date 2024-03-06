package alisson.firstSpringBoot;


import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public float sum(float n1, float n2){
        return n1+n2;
    }

}
