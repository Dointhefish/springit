package com.bowers.springit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("springit")
public class SpringitProperties {


    /**
     * This is our welcome message
     */
    private String welcomeMsg = "Lllllllladies!";

    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }


}
