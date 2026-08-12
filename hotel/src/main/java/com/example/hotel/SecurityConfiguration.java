package com.example.hotel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.authorization.AuthenticatedAuthorizationManager.rememberMe;



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
                        .requestMatchers("/admin/*","/admin/**").fullyAuthenticated()
//                        .requestMatchers("/admin/*","/admin/**").hasAuthority("ADMIN")
//                        .requestMatchers("/forget/*","/forget/**").fullyAuthenticated()
                        .anyRequest().permitAll())


                .formLogin(Customizer.withDefaults())
                .logout(Customizer.withDefaults())
                .logout(Customizer.withDefaults())
                .rememberMe(rm -> rm
                        .tokenValiditySeconds(100)
                        .rememberMeCookieName("remember-cookie"));









        //Custom login page setup
//                .formLogin(form -> form
//                        .loginPage("/log")
//                        .usernameParameter("username")
//                        .passwordParameter("password")
//                        .defaultSuccessUrl("/home", true)   // True if routing to home, false mean smart routing to intended page.
//                        .failureUrl("/login?error=true"))

//                // Logout customization
//                .logout(logout -> logout
//                        .logoutUrl("/logout")
//                        .logoutSuccessUrl("/")
//                        .deleteCookies("JSESSIONID", "remember")
//                        .invalidateHttpSession(true)
//                        .logoutSuccessUrl("/login?logout=true")
//                        .clearAuthentication(true))
                // Remember me customization
        return http.build();
    }












    //    @Bean
//    public UserDetailsService userDetailsService() {
//        return username -> User.withUsername(username).password(" ").build();
//    }

//    @Bean
//    public static PasswordEncoder passwordEncoder() {
//       return new BCryptPasswordEncoder();
//    }


}
