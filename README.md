# SPRING BOOT BACKEND APPLICATION FOR UNIVERSIT SETTING
This is the backend application for a University Management System built using Spring Boot. It provides CRUD functionalities for managing student data.

<br>

### Table of Contents:
#### Installation
#### Usage
#### API Endpoints
#### Data Structure
#### Technologies Used
#### Contributing
#### License

<br>

### Installation:
This project includes all of the datasets, graphs, and notebooks that are used in the entire project.

1. **Clone the Repository:** Begin by cloning the project repostory using Git.
2. **Navigate to the Project Directory:** Go to the project directory using your command prompt or terminal or your file manager.
3. **Open Project:** Open the project in a text editor so that it is easier to build, just run the Application.java file.    

<br>

### Usage:
 
Once the application is up and running, it exposes the following RESTful API endpoints to manage student data.

<br>

### API Endpoints

GET     {{base_url}}/       : Get all students.
GET     {{base_url}}/{id}   : Get a specific student by ID.
POST    {{base_url}}/       : Create a new student.
PUT     {{base_url}}/{id}   : Update an existing student.
DELETE  {{base_url}}/{id}   : Delete a student.

<br>

### Data Structure
The student data structure is as follows:

public class Student {
    private String studentId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private Gender gender;
    private LocalDate birthday;
    private String contact;
    private String barangay;
    private String city;
    private Section section;
}

<br>

### Technologies Used:

- Java
- Spring Boot
- Maven
- Hibernate
- RESTful API
- Git
- PostgreSQL
- Postman

<br>

### Contributing:

#### Reporting Issues

If you encounter a bug or have an idea for improvement:

1. **Submit an Issue:** Visit the [issue tracker](https://github.com/dexdevtech/univ-org-backend-design/issues) and create a new issue.
2. **Provide Details:** Clearly describe the problem or feature request.
3. **Stay Engaged:** Check for updates on your issue.

#### Code Contributions

Interested in contributing code? Follow these steps:

1. **Fork & Clone:** Fork the repository and clone it to your machine.
2. **Create a Branch:** Make a new branch for your changes.
3. **Code:** Write your code, adhering to any guidelines if available.
4. **Test:** Ensure your changes work and add tests if relevant.
5. **Pull Request:** Open a pull request from your branch.

#### Contribution Guidelines

- Maintain a polite and collaborative tone in discussions.
- Align contributions with project goals and your vision.

Feel free to reach out with questions or concerns dexdevtech@gmail.com

<br>

### License:

This project is licensed under the MIT License.

MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

