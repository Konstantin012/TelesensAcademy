package com.academy.patterns.behavioral.abstract_factory.factory;

import com.academy.patterns.behavioral.abstract_factory.buttons.Button;
import com.academy.patterns.behavioral.abstract_factory.buttons.HtmlButton;

/**
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}