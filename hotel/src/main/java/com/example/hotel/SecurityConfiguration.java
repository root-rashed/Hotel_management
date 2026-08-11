package com.example.hotel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration {


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {


        // Authorized request
        http.authorizeHttpRequests(request ->
                request.requestMatchers("/booking/*","/booking/**").authenticated()
                        .requestMatchers("/guest/*","/guest/**").authenticated()
                        .requestMatchers("/registration","/registration/**").permitAll()
                        .requestMatchers("/login","/login/**").permitAll()
                        .requestMatchers("/admin/*","/admin/**").authenticated()
//                        .requestMatchers("/admin/*","/admin/**").hasAuthority("ADMIN")
//                        .requestMatchers("/forget/*","/forget/**").fullyAuthenticated()
                        .anyRequest().permitAll())

                .formLogin(Customizer.withDefaults())
                .logout(Customizer.withDefaults());


        return http.build();
    }

}
