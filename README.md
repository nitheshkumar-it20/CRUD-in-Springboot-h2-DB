🧩 Spring Boot CRUD API with H2 Database

A simple CRUD (Create, Read, Update, Delete) REST API built using Spring Boot and **H2 in-memory database.  
This project demonstrates how to develop, test, and interact with a RESTful backend application using Spring Data JPA.

---

🚀 Features
- ✅ Create a new record  
- ✅ Read all records or by ID  
- ✅ Update existing records  
- ✅ Delete records  
- ✅ In-memory H2 Database for quick testing  
- ✅ JPA + Hibernate integration  
- ✅ Simple and clean REST architecture  

---

### 🏗️ Tech Stack
| Layer | Technology |
|-------|-------------|
| Language | Java |
| Framework | Spring Boot |
| Database | H2 (In-memory) |
| ORM | Hibernate (Spring Data JPA) |
| Build Tool | Maven |

---

### 📂 Project Structure
```
src/
 └── main/
     ├── java/dev/codeio/helloworld/
     │    ├── controller/    # REST Controllers
     │    ├── service/       # Business logic
     │    ├── repository/    # Data access layer (JPA)
     │    ├── model/         # Entity classes
     │    └── HelloworldApplication.java
     └── resources/
          ├── application.properties
          └── data.sql / schema.sql (optional)
```

---

 ⚙️ Configuration (application.properties)
```properties
spring.application.name=helloworld

spring.datasource.url=jdbc:h2:mem:tododb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=admin
spring.datasource.password=1234

spring.h2.console.enabled=true
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
```

---

🧠 How to Run the Project

🖥️ 1. Clone the Repository
```bash
git clone https://github.com/nitheshkumar-it20/CRUD-in-Springboot-h2-DB.git
cd CRUD-in-Springboot-h2-DB
```

#### ⚙️ 2. Build and Run
```bash
mvn spring-boot:run
```

#### 🌐 3. Access the API
- Base URL: `http://localhost:8080`
- H2 Console: `http://localhost:8080/h2-console`  
  - JDBC URL: `jdbc:h2:mem:tododb`  
  - Username: `admin`  
  - Password: `1234`

---

### 📮 Example Endpoints

| Method | Endpoint | Description |
|--------|-----------|-------------|
| `POST` | `/api/todos` | Create a new record |
| `GET`  | `/api/todos` | Get all records |
| `GET`  | `/api/todos/{id}` | Get record by ID |
| `PUT`  | `/api/todos/{id}` | Update record |
| `DELETE` | `/api/todos/{id}` | Delete record |



### 🧑‍💻 Author
**Nithesh Kumar**  
🎓 B.Tech (Information Technology), BIT Sathy  
💡 Passionate about backend development, DBMS, and OOPs   with 1.5 years of experience
🔗 [GitHub Profile](https://github.com/nitheshkumar-it20)

--- 
