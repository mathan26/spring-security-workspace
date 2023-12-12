# Notes:

- URL: http://localhost:8080/spring-security-workspace/login

## Course 1: Setup the spring security
## Course 2:User | UserDetails | UserDetailsManager
* Mandatory information to store for any website to access the resources,
  * Username, password
  * Authorization  - Access  the resource 
  * Authentication 
* Prototype of security user implementation
  * UserDetails class is an interface, used to store user related information.
  * User class already have an implementation.
* GrantedAuthority
  * Used to define role and authority.
  * SimpleGrantedAuthority - implementation class for GrantedAuthority
* UserDetailsManager
  * this is like a service, used to manage all users related operations.
  * InMemoryUserDetailsManager is implementation class of UserDetailsManager
  * There is no PasswordEncoder mapped for the id "null"  -  error will display
  * Currently use no password encoder class from spring security
