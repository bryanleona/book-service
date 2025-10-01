# 📚 Book Service

A simple **Spring Boot microservice** built with **Java 21** for managing books.

---

## 🚀 Features

* Add, get, delete, and borrow books
* Uses Spring Boot, JPA, Lombok, and H2 database

---

## ⚡ Run Locally

1. Clone the repo:

   ```bash
   git clone https://github.com/bryanleona/book-service.git
   cd book-service
   ```

2. Build and run:

   ```bash
   mvn spring-boot:run
   ```

3. API available at:
   `http://localhost:8080`

---

## 📖 Example Endpoint

```http
POST /books
{
  "title": "Clean Code",
  "author": "Robert C. Martin"
}
```

---
