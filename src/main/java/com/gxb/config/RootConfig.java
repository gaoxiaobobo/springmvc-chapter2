package com.gxb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

import java.util.regex.Pattern;

@Configuration
@ComponentScan(basePackages={"com.gxb"},
        excludeFilters={
                @ComponentScan.Filter(type= FilterType.CUSTOM, value=RootConfig.WebPackage.class)
        })
public class RootConfig {
    public static class WebPackage extends RegexPatternTypeFilter {
        public WebPackage() {
            super(Pattern.compile("com\\.gxb\\.chapter2\\.web2"));
        }
//        public WebPackage() {
//            super(Pattern.compile("com\\.gxb\\.chapter2\\.web"));
//        }
    }
}
