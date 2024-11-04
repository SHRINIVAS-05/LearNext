

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
[E-Learning Application flow diagram](E-Learning Application flow daigram.jpg)

### API Documentation:

| Entities   | API Title                                                                   | Method | URL                                                                             |
|------------|-----------------------------------------------------------------------------|--------|---------------------------------------------------------------------------------|
| Homepage   | WelCome page                                                                | GET    | http://localhost:9038/Index-1                                                   |
| Development| Explore Development course                                                  | GET    | http://localhost:9038/ExploreDev                                                |
| Testing    | Explore Testing course                                                      | GET    | http://localhost:9038/ExploreTesting                                            |
| Login      |  User Login                                                                 | GET    | http://localhost:9038/Login-1                                                   |
| Register   | New user get register                                                       | GET    | http://localhost:9038/Register-1                                                |
|Student Home| Student Dashboard                                                           | GET    | http://localhost:9038/validate                                                  |
| MyCourse   |Student enrolled courses                                                     | GET    | http://localhost:9038/Course-1                                                  |
|view Course | Student can view purchsed course                                            | GET    | http://localhost:9038/getAllCourses?courseID=JAV101                             |
| Demo vedios| Demo classed                                                                | GET    | http://localhost:9038/DemoLesson                                                  |

