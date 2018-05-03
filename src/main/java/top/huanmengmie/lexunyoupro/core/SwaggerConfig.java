package top.huanmengmie.lexunyoupro.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @description   (Swagger配置类)
 * @author huanmengmie@163.com
 * @time 2018/4/26 16:25
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("lexunyoupro")
                .genericModelSubstitutes(DeferredResult.class)
                .select()
                .apis(RequestHandlerSelectors.basePackage("top.huanmengmie.lexunyoupro.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("幻梦灭SpringBoot学习")
                .description("Swagger2集成测试")
                .termsOfServiceUrl("http://huanmengmie.top")
                .version("1.0")
                .build();
    }
}
