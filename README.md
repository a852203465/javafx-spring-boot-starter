# Spring Boot3整合JavaFx
    Spring Boot3整合JavaFx

## 版本说明
    - JDK17
    - Spring Boot 3.2.0

## 使用说明
### 引入依赖
```xml
<dependency>
    <groupId>cn.darkjrong</groupId>
    <artifactId>javafx-spring-boot-starter</artifactId>
    <version>1.0</version>
</dependency>
```

### 创建Spring Boot项目并启动
 - 在main方法中调用'AbstractJavaFxApplicationSupport.launch(TestApplication.class, MainView.class, DemoSceneView.class, args)'
 - MainView: 继承'AbstractJavaFxApplicationSupport'的
 - DemoSceneView: 启动完成后需要渲染的页面 
```java
package cn.darkjrong.javafx;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

public class TestApplication {
    public static void main(String[] args) {
        AbstractJavaFxApplicationSupport.launch(TestApplication.class, MainView.class, DemoSceneView.class, args);
    }
}
```

### 消息通知
    - 可使用'MessageUtils'工具类
```java
MessageUtils.error(indexController.getDisplayAreaPane(), "请选择日志类型！", null, null, null);
```

### 新建的View
    - 在新建的View增加'@FXMLView'
```java
package cn.darkjrong.javafx;

@FXMLView("/fxml/DemoSceneView.fxml")
public class DemoSceneView extends AbstractFxmlView {
}
```

### 新建的Controller
    - 在新建的View增加'@FXMLController'
```java
package cn.darkjrong.javafx;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

@FXMLController
public class DemoSceneController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
```
















