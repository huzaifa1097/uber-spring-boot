# 🚕 Uber Clone - Backend API (Java Spring Boot)

This is a backend REST API application built with **Spring Boot**, simulating the core backend functionalities of a ride-hailing app like Uber. It supports user roles (RIDER, DRIVER, ADMIN), ride booking, JWT authentication, and admin operations.

---

## 🌐 Live Demo

- 🔗 **Base URL**: [`http://uber-spring-boot-env.eba-retfie2d.eu-north-1.elasticbeanstalk.com`](http://uber-spring-boot-env.eba-retfie2d.eu-north-1.elasticbeanstalk.com)
- 📬 **Postman Collection**: [Uber_Backend_Postman_Collection_All.json](./Uber_Backend_Postman_Collection_All.json)

---

## 📦 Features

- 🔐 JWT-based Authentication & Role-based Access (RIDER / DRIVER / ADMIN)
- 🧾 RESTful APIs for:
  - User Registration & Login
  - Ride Booking and History
  - Driver Assignment
  - Ride Status Update (STARTED / COMPLETED / CANCELLED)
  - Admin Panel (View all rides, users)
- 🧪 Swagger for API documentation
- 📮 Postman collection included
- ☁️ Deployed on AWS Elastic Beanstalk

---

## ⚙️ Tech Stack

- **Backend:** Java 17, Spring Boot 3, Spring Security
- **Database:** MySQL (via JPA/Hibernate)
- **Documentation:** Swagger (springdoc-openapi)
- **Testing:** Postman (Public Collection Available)
- **Deployment:** AWS Elastic Beanstalk

---

## 🛠 API Endpoints

### 🔐 Authentication

| Method | Endpoint            | Description          |
|--------|---------------------|----------------------|
| POST   | `/api/auth/register` | Register a new user |
| POST   | `/api/auth/login`    | Login and get token |
| POST   | `/api/auth/logout`   | (Optional) Logout placeholder |

### 👤 User

| Method | Endpoint           | Description           |
|--------|--------------------|-----------------------|
| GET    | `/api/users/me`     | Get current user info|
| PUT    | `/api/users/me`     | Update profile        |
| GET    | `/api/users`        | Admin: get all users  |

### 🚗 Ride

| Method | Endpoint                    | Description                        |
|--------|-----------------------------|------------------------------------|
| POST   | `/api/ride/book`            | Rider books a ride                 |
| PUT    | `/api/ride/{rideId}/cancel`| Rider cancels a ride              |
| GET    | `/api/ride/history`         | Rider views past rides             |
| GET    | `/api/ride/assigned`        | Driver: Get assigned rides         |
| PUT    | `/api/ride/status`          | Driver: Update ride status         |
| PUT    | `/api/ride/assign`          | Admin: Assign driver to a ride     |
| GET    | `/api/ride/all`             | Admin: View all rides              |

---

## 🧪 Postman Usage

1. Import the `Uber_Backend_Postman_Collection_All.json` file into Postman
2. Use `POST /api/auth/login` to get JWT token
3. Copy the token and set it in `Authorization` → Bearer Token
4. Test all secured endpoints easily

---

## 🧰 How to Run Locally

```bash
# 1. Clone the repo
$ git clone https://github.com/huzaifa1097/uber-spring-boot.git
$ cd uber-spring-boot

# 2. Setup DB
- Configure your MySQL DB in `application.properties`

# 3. Run with Maven
$ ./mvnw spring-boot:run

# 4. Visit Swagger UI
http://localhost:8080/swagger-ui/index.html
```

---

## 🔐 JWT Token Format

```json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6..."
}
```
Use this token in the `Authorization` header:
```
Authorization: Bearer <JWT_TOKEN>
```

---

## 📁 Folder Structure

```bash
src/
├── controller/         # API Controllers
├── service/            # Business logic
├── model/              # Entities & DTOs
├── repository/         # JPA Repositories
├── config/             # Security & Swagger config
└── UberApplication.java
```

---

## 👤 Author

- **Name:** Abu Huzaifa Ahmad
- **GitHub:** [@huzaifa1097](https://github.com/huzaifa1097)
- **Email:** ahmadhuzaifa1097@gmail.com
- **Portfolio:** [Huzaifa](https://huzaifa-portfolio-seven.vercel.app/)
- **LinkedIN:** [Abu Huzaifa Ahmad](https://www.linkedin.com/in/abu-huzaifa-ahmad-68175222a/)

---

## 📄 License

This project is open-source and available under the [MIT License](LICENSE).

---


