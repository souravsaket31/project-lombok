# project-lombok

Project Lombok is a java library that automatically plugs into your editor and build tools, 
spicing up your java. Never write another getter or equals method again, with one annotation your class has a fully featured builder, 
automate your logging variables, and much more.

 Whenever we use IDEs to generate these boilerplate codes, we just save ourselves from writing all these codes but it is actually present in our source code and increases the LOC (lines of code), and reduces maintainability and readability. On the other hand, Lombok adds all these boilerplate codes at the compile-time in the “.class” file and not in our source code. 


## Steps to follow:

1. Create a Maven Project 
2. Add the following Maven dependency in pom.xml

```java
<dependencies>
        <dependency>
               <groupId>org.projectlombok</groupId>
               <artifactId>lombok</artifactId>
               <version>1.16.16</version>
        </dependency>
</dependencies>
```

3. Create a Simple class Employee with some sample data variables
4. After building the project, you will find lombok.jar downloaded in the .m2 repository.
5. Example (Vanilla code) :

```java
public class Employee {

private String empId;
private String firstName;
private String lastname;

public String getEmpId() {
return empId;
}

public void setEmpId(String empId) {
this.empId = empId;
}

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

public String getLastname() {
return lastname;
}

public void setLastname(String lastname) {
this.lastname = lastname;
}

}
```


6. Code with Lombok annotations:

```java

@Getter
@Setter
@Data
public class Employee {

 private String empId;
 private String firstName;
 private String lastname;
 
 }
```
