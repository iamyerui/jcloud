package cn.jorian.framework.configution;


import cn.jorian.framework.filter.AccessPasswordFilter;
import cn.jorian.framework.filter.AccessTokenFilter;
import cn.jorian.framework.filter.AccessUserNameFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZullConfig {

    @Bean
    public AccessUserNameFilter accessUserNameFilter() {
        return new AccessUserNameFilter();
    }

    @Bean
    public AccessPasswordFilter accessPasswordFilter(){
        return new AccessPasswordFilter();
    }

    @Bean
    public AccessTokenFilter accessTokenFilter(){
        return new AccessTokenFilter();
    }
}
