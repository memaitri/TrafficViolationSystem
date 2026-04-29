# SmartTraffic

A real-time traffic violation detection and management system built with Spring Boot and PostgreSQL.

## Features

- Detect speed violations by vehicle ID, speed, and zone
- Automatic fine calculation based on severity
- Live violation log with stats dashboard
- REST API backend with static frontend

## Tech Stack

- **Backend** — Java 21, Spring Boot 4.0, Spring Data JPA
- **Database** — PostgreSQL (production), H2 (local dev)
- **Frontend** — HTML, CSS, JavaScript (served by Spring Boot)
- **Deployment** — Docker, Render

## Fine Structure

| Speed Range | Fine |
|-------------|------|
| ≤ 80 km/h   | No violation |
| 81–100 km/h | ₹1,000 |
| 101–120 km/h | ₹2,000 |
| > 120 km/h  | ₹5,000 |

## Running Locally

```bash
./mvnw spring-boot:run -Dspring-boot.run.profiles=dev
```

App runs at `http://localhost:8080`

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/traffic/check` | Check a vehicle for violation |
| GET  | `/api/traffic/violations` | Get all recorded violations |

### POST `/api/traffic/check`
```json
{
  "vehicleId": "MH12AB1234",
  "speed": 110,
  "zone": "highway"
}
```

## Deployment

See [render.yaml](render.yaml) for Render configuration.

Required environment variables:
- `DB_URL` — PostgreSQL JDBC URL
- `DB_USERNAME`
- `DB_PASSWORD`
- `PORT` — defaults to 8080
