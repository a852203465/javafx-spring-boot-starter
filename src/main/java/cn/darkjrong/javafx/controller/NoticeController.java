package cn.darkjrong.javafx.controller;

import cn.darkjrong.javafx.FXMLController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import lombok.extern.slf4j.Slf4j;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * 通知控制器
 *
 * @author Rong.Jia
 * @date 2023/12/15
 */
@Slf4j
@FXMLController
public class NoticeController implements Initializable  {

    @FXML
    private Text messageInfo;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
