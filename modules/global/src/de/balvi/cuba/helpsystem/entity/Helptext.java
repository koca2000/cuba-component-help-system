package de.balvi.cuba.helpsystem.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;

@Table(name = "DBCHS_HELPTEXT")
@Entity(name = "dbchs$Helptext")
public class Helptext extends StandardEntity {
    private static final long serialVersionUID = -1553663583023668644L;

    @Lob
    @Column(name = "TEXT", nullable = false)
    protected String text;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HELP_CONTEXT_ID")
    protected HelpContext helpContext;

    @Lookup(type = LookupType.DROPDOWN, actions = {})
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CATEGORY_ID")
    protected HelptextCategory category;

    public void setCategory(HelptextCategory category) {
        this.category = category;
    }

    public HelptextCategory getCategory() {
        return category;
    }


    public void setHelpContext(HelpContext helpContext) {
        this.helpContext = helpContext;
    }

    public HelpContext getHelpContext() {
        return helpContext;
    }


    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }


}