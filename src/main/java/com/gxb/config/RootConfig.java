package com.gxb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

import java.util.regex.Pattern;

@Configuration
@Import(DataConfig.class)
@ComponentScan(basePackages={"com.gxb"},
        excludeFilters={
                @ComponentScan.Filter(type= FilterType.CUSTOM, value=RootConfig.WebPackage.class)
        })
/**
 * 其实ContextLoaderListener会根据根配置文件RootConfig会加载相关bean，
 * 而上述配置中将EnableWebMvc类排除了，其实还应该将spittr.web包中的类排除（修改后的代码后面给出），
 * 因为那个包中的类是由DispatcherServlet来加载的，这样两者就不会产生重复的bean了，
 * 如果产生了重复，则优先使用DispatcherServlet返回的bean，
 * 而ContextLoaderListener产生的bean无法被调用，称为内存泄漏。

 作者：yjaal
 链接：https://www.jianshu.com/p/26d1b54ef5fa
 */
public class RootConfig {
    public static class WebPackage extends RegexPatternTypeFilter {
        public WebPackage() {
            super(Pattern.compile("com\\.gxb\\.web"));
        }
    }
}
