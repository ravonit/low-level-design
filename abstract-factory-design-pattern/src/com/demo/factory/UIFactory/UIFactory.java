package com.demo.factory.UIFactory;

import com.demo.factory.Button;
import com.demo.factory.CheckBox;

public interface UIFactory {
    public Button createButton();
    public CheckBox createCheckBox();
}
