    package dio.spring_security;

    import org.springframework.context.annotation.Bean;
    import org.springframework.context.annotation.Configuration;
    import org.springframework.http.HttpMethod;
    import org.springframework.security.config.annotation.web.builders.HttpSecurity;
    import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
    import org.springframework.security.core.userdetails.User;
    import org.springframework.security.core.userdetails.UserDetails;
    import org.springframework.security.core.userdetails.UserDetailsService;
    import org.springframework.security.provisioning.InMemoryUserDetailsManager;
    import org.springframework.security.web.SecurityFilterChain;
    import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

    @Configuration
    @EnableWebSecurity
    public class WebSecurityConfig {

        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
            http.authorizeHttpRequests(authorize -> authorize
                            .requestMatchers("/").permitAll()
                            .requestMatchers(HttpMethod.POST,"/login").permitAll()
                            .requestMatchers("/managers").hasAnyRole("MANAGERS")
                            .requestMatchers("/users").hasAnyRole("USERS", "MANAGERS")
                            .anyRequest().authenticated()
                    ).formLogin(form ->form
                            .loginPage("/login")
                            .defaultSuccessUrl("/", true)
                            .permitAll()
                    )
                    .logout(logout -> logout
                            .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                            .logoutSuccessUrl("/")
                            .permitAll()

                    );
            return http.build();
        }

        @Bean
        public UserDetailsService userDetailsService() {
            UserDetails user = User.withDefaultPasswordEncoder()
                    .username("user")
                    .password("password")
                    .roles("USERS")
                    .build();
            UserDetails admin = User.withDefaultPasswordEncoder()
                    .username("admin")
                    .password("password")
                    .roles("MANAGERS")
                    .build();
            return new InMemoryUserDetailsManager(user, admin);
        }
    }