package za.co.bank.system.configurations;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public ServletContextTemplate servletContextTemplate(ServletContext servletContext) {
        return new ServletContextTemplate(servletContext);
    }
}
