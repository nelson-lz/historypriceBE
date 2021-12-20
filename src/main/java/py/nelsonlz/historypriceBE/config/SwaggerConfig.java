package py.nelsonlz.historypriceBE.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static springfox.documentation.builders.PathSelectors.any;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.basePackage("py.nelsonlz.historypriceBE.controller"))
                .paths(PathSelectors.regex("/api.*")).build()
                .apiInfo(apiInfo());
    }
    //http://localhost:8080/wsagger-ui.html
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("Historial de precios")
                .description("Backend de practica")
                .contact(new Contact("Nelson-lz","https://nelson-lz.github.io","nelsonlz@outlook.com")).build();
    }
}
