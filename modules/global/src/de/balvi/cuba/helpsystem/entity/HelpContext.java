package de.balvi.cuba.helpsystem.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@NamePattern("%s (%s)|screenId,componentId")
@Table(name = "DBCHS_HELP_CONTEXT")
@Entity(name = "dbchs$HelpContext")
public class HelpContext extends StandardEntity {
    private static final long serialVersionUID = 4440146015397720979L;

    @Column(name = "SCREEN_ID")
    protected String screenId;

    @Column(name = "COMPONENT_ID")
    protected String componentId;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "helpContext")
    protected List<Helptext> helptexts;

    public void setHelptexts(List<Helptext> helptexts) {
        this.helptexts = helptexts;
    }

    public List<Helptext> getHelptexts() {
        return helptexts;
    }


    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public String getComponentId() {
        return componentId;
    }


    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    public String getScreenId() {
        return screenId;
    }


}