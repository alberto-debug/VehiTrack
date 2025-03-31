# 🚗 **VehiTrack**

> **Junior Back-end Challenge**

## 📌 **About the Project**

**VehiTrack** is a RESTful API for vehicle registration and query, using **Spring Boot** and **Spring Data JPA**. The system validates **CPF** and **License Plate** as unique and retrieves vehicle information from an external API before persisting the data.

---

## 🎯 **Objective**

✅ Register a vehicle with **Owner, CPF, and License Plate**.
✅ Query an external API to obtain **Brand, Model, Chassis, and Licensing Status**.
✅ Persist the validated data in the database.
✅ Return the consolidated data.

---

## 🏗 **Technologies Used**

- ☕ **Java 8+**
- 🚀 **Spring Boot**
- 🌐 **Spring Web**
- 💾 **Spring Data JPA**
- 🛢 **Database: MySQL / PostgreSQL / H2**

---

## 📡 **Endpoints**

### 🔹 Create Vehicle
```http
POST /veiculos
```
**Example Payload:**
```json
{
    "proprietario": "José da Silva",
    "cpf": "203.397.390-53",
    "placa": "ABC1234"
}
```

### 🔹 Expected Response
```json
{
    "id": 1,
    "proprietario": "José da Silva",
    "cpf": "203.397.390-53",
    "placa": "ABC1234",
    "marca": "Chevrolet",
    "modelo": "Suburban 1500",
    "chassi": "5TDBKRFH2FS979708",
    "licenciado": true
}
```

---

## 🔧 **Installation and Execution**

```sh
# Clone the repository
git clone https://github.com/your-username/VehiTrack.git

# Navigate to the project folder
cd VehiTrack

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

---

## 💡 **Implemented Features**

✔️ CPF and License Plate validation 📜
✔️ Error handling ❌
✔️ Use of **Design Patterns** 🏗
✔️ Clean and organized code 🧼

---

## ✨ **Demonstration (Animated ASCII Art)**
```ascii
   ____      _      _    _             
  |  _ \ ___| |_ __| | _(_)_ __   __ _ 
  | |_) / _ \ | '__| |/ / | '_ \ / _` |
  |  _ <  __/ | |  |   <| | | | | (_| |
  |_| \_\___|_|_|  |_|\_\_|_| |_|\__, |
                                  |___/
```

---

## 🛠 **Contributing**

Feel free to contribute! Open a PR or submit an issue. 🚀

---

## 📝 **License**

This project is licensed under the MIT License. 📜

