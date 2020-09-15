package de.balvi.cuba.helpsystem.web.action;

import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.ScreenOptions;
import de.balvi.cuba.declarativecontrollers.web.annotationexecutor.screen.ScreenAnnotationExecutor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.lang.annotation.Annotation;

@Component
@Scope("prototype")
class HelpAnnotationScreenExecutor implements ScreenAnnotationExecutor<HasHelp> {

    @Inject
    HelpSidePanelRenderer helpSidePanelRenderer

    @Override
    void init(HasHelp annotation, Screen screen, ScreenOptions options) {

    }

    @Override
    void beforeShow(HasHelp annotation, Screen screen, ScreenOptions options) {
        helpSidePanelRenderer.initComponent(screen.getWindow())
    }

    @Override
    boolean supports(Annotation annotation) {
        annotation instanceof HasHelp
    }
}
