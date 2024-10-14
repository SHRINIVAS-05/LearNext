

# LearnNext | Online Learning Full Stack Web Application

**LearnNext** is an innovative online learning platform designed for both teachers and students. It enables seamless interaction between educators and learners through course creation, video lessons, flexible pricing options, and real-time feedback mechanisms. Built with a focus on user experience and scalability, this platform delivers a comprehensive learning environment.

## Features

- **Teacher Dashboard**: Teachers can create and manage courses, upload lesson notes, videos, and other resources.
- **Student Interaction**: Students can purchase courses, view lessons, and engage by asking questions in the comments section below each video.
- **Flexible Pricing**: Courses can be created with customized pricing models.
- **Responsive Design**: Optimized for various devices using HTML, CSS, and Bootstrap for a smooth user experience.
- **Backend**: Powered by Java, Spring Boot, and Thymeleaf for server-side rendering and dynamic content.
- **Database Integration**: Uses MySQL for storing user, course, and transaction data.


- **The Programming Languages Used For Implementation are**          :Java, J2ee, Spring Boot, MySQL, HTML, CSS,JavaScript and Bootstrap.
- **Tools Used**                                                     :Eclipse IDE, MySQL, and Postman. Plugin Used: Thymeleaf..
- **Plugin Used**                                                    :Thymeleaf



### HR Schema Tables Relationship UML Diagram
![img.png]()

### API Documentation:

| Entities   | API Title                                                                   | Method | URL                                                                             |
|------------|-----------------------------------------------------------------------------|--------|---------------------------------------------------------------------------------|
| Employee   | Get All Employees Details                                                   | GET    | http://localhost:8080/employees                                                 |
| Employee   | Get Employees By Dept ID                                                    | GET    | http://localhost:8080/employees/departments/20                                              |
| Employee   | Get Employees salary between 4800 and 6000                                  | GET    | http://localhost:8080/employees?minSalary=4800&maxSalary=6000                   |
| Employee   | Get Employees whose salary in range 4800 to 6000 from particular department | GET    | http://localhost:8080/employees?departmentName=IT&minSalary=4800&maxSalary=6000 |
| Employee   | Get Employees whose salary in range 4800 to 6000 from all departments       | GET    | http://localhost:8080/employees?minSalary=4800&maxSalary=6000                   |
| Department | Get All Departments Details                                                 | GET    | http://localhost:8080/departments                                               |
| Department | Get Department By Dept ID                                                   | GET    | http://localhost:8080/departments/20                                            |

