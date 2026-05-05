# uso de maven con excel
Estructura de trabajo usando lenguaje de programación JAVA usando listas y arrays, usando MAVEN y EXCEL como fuente de datos, generando algunos casos prácticos.

## 🛠️ Tech Stack
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

- **Language:** Java 17.0.17 2025-10-21 LTS
- **IDE** Intellij IDEA
- **Build Tool:** Maven
- **Data Source:** Excel (data-driven testing)

## 📁 Project Structure

├── src/
│   └── java/
│          ├── modelos
|          ├── org/example -->aqui están las clases para ejecutar
|          ├── parser
|          ├── reader
|   └── resources/data
├── README.md
└── pom.xml

## ▶️ How to Run

### Prerequisites
- Java JDK 17+
- Maven installed

### Steps
```bash
# Clone the repository
git clone https://github.com/mikeai-lab/maven-excel.git

# Navigate to project
cd maven-excel

# go to the folder src/java/org/example and execute the desired method
mvn test
```

## 📋 Data-Driven Testing

Test data is managed through Excel files, allowing easy
test case maintenance without modifying the source code.

## 👤 Author

**Michael Castillo**
QA Automation Engineer
[LinkedIn](https://linkedin.com/in/michael-castillom) |
[Upwork](https://www.upwork.com/freelancers/~01aea3539c440f6607?mp_source=share)
