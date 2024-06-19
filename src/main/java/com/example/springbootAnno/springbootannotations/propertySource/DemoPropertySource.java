package com.example.springbootAnno.springbootannotations.propertySource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DemoPropertySource {
    @Value("${db.dbusername}")
    private String DBusername;

    @Value("${db.dbpassword}")
    private String DBpassword;

    @Value("${db.dbport}")
    private String DBport;

    @Value("${mail.username}")
    public String mailUsername;

    public String getMailUsername() {
        return mailUsername;
    }

    public String getDBport() {
        return DBport;
    }

    public String getDBusername() {
        return DBusername;
    }

    public String getDBpassword() {
        return DBpassword;
    }
}