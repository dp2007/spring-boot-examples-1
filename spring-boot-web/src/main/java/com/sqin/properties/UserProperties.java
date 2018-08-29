package com.sqin.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by qinsheng on 2018/8/30.
 */
@Component
public class UserProperties {

    @Value("${com.sqin.title}")
    private String title;

    @Value("${com.sqin.description}")
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
