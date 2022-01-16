package com.academy.patterns.behavioral.abstract_factory.factory;

import com.academy.patterns.behavioral.abstract_factory.buttons.Button;
import com.academy.patterns.behavioral.abstract_factory.buttons.WindowsButton;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
