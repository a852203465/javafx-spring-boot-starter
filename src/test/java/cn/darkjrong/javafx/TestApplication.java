package cn.darkjrong.javafx;

import cn.darkjrong.javafx.support.AbstractJavaFxApplicationSupport;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan("cn.darkjrong.javafx")
public class TestApplication {

    public static void main(String[] args) {
        AbstractJavaFxApplicationSupport.launch(TestApplication.class, MainView.class, DemoSceneView.class, args);
    }

}
