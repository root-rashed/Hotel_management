//package com.example.hotel;
//
//import org.jspecify.annotations.Nullable;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//import java.util.HashMap;
//import java.util.List;
//
//




//
//// Now we will do authentication part, not automatically
//@Component
//public class CustomAuthenticationProvider  implements AuthenticationProvider {
//
//    public final static HashMap<String,String> userMap = new HashMap<>();
//
//    private final PasswordEncoder passwordEncoder;
//
//    public CustomAuthenticationProvider(PasswordEncoder passwordEncoder) {
//        this.passwordEncoder = passwordEncoder;
//        userMap.put("username", passwordEncoder.encode("password"));
//    }
//
//
//
//
//
//
//    @Override
//    public @Nullable Authentication authenticate(Authentication authentication) throws AuthenticationException {
//       String username = authentication.getName();
//       String email = authentication.getCredentials().toString();
//       String rawPassword = authentication.getCredentials().toString();
//
//
//
//       // If Bad credentials
//       if(username.equals(rawPassword)){
//           throw new BadCredentialsException("Bad Credentials");
//       }
//
//
//
//       // checking email
//        if(userMap.get(email) == null){
//            throw new BadCredentialsException("Invalid Credentials");
//        }
//
//
//
//        // Matches
//        if(passwordEncoder.matches(rawPassword,userMap.get(email))){
//            throw  new BadCredentialsException("Bad Credentials");
//        }
//
//
//
//        return new UsernamePasswordAuthenticationToken(username, null, List.of(
//                new SimpleGrantedAuthority("ROLE_USER"),
//                new SimpleGrantedAuthority("READ_INVOICE"),
//                new SimpleGrantedAuthority("WRITE_INVOICE")
//        ));
//    }
//
//
//
//
//
//
//
//
//
//    // In which way you want to authenticate
//    @Override
//    public boolean supports(Class<?> authentication) {
//
////      return DaoAuthenticationProvider.class.isAssignableFrom(authentication);
//        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
//    }
//}
