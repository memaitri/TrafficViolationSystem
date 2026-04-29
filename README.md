🚦 Smart Traffic Violation System

A full-stack Spring Boot + PostgreSQL application designed to manage and track traffic violations efficiently.
Built with a focus on real-world deployment, scalability, and clean backend architecture.
<img width="1918" height="870" alt="image" src="https://github.com/user-attachments/assets/ce167049-83f2-43af-8762-cfdfb3b6f6d3" />


📌 Live Demo

🌐 Deployed App:
👉 https://smarttraffic-app.onrender.com

🧠 Problem Statement

Manual traffic violation tracking is:

Inefficient ❌
Error-prone ❌
Hard to scale ❌

This system digitizes the process by:
Recording violations
Storing structured data
Enabling fast retrieval and monitoring

⚙️ Tech Stack

Backend
Java 21
Spring Boot 4
Spring Data JPA
Hibernate
Database
PostgreSQL (Hosted on Render)
DevOps & Deployment
Docker
Render (Web Service + Managed DB)

Git & GitHub

🚀 Features
✅ Add traffic violations
✅ Store violations in PostgreSQL
✅ REST API architecture
✅ Live cloud deployment
✅ Clean layered structure (Controller → Service → Repository)

📡 API Endpoints (Sample)

Method	Endpoint	Description
GET	/api/violations	Fetch all violations
POST	/api/violations	Add a new violation

🛠️ Setup & Run Locally
1. Clone Repository
git clone https://github.com/memaitri/TrafficViolationSystem.git
cd TrafficViolationSystem
2. Configure Database

Update application.properties:

spring.datasource.url=YOUR_DB_URL

spring.datasource.username=YOUR_USERNAME

spring.datasource.password=YOUR_PASSWORD

3. Run Application
mvn clean install
mvn spring-boot:run

🐳 Docker Support
Build Image
docker build -t smart-traffic .
Run Container
docker run -p 8080:8080 smart-traffic

🌍 Deployment Details
Hosted on Render
PostgreSQL cloud database
Environment variables used for security

💡 Future Scope
🚓 Integration with traffic cameras (AI/ML)
📊 Analytics dashboard for violations
📱 Mobile app for real-time reporting
🔐 Role-based access control (Admin / Officer)
