# Product Catalog API -

A Spring Boot application with PostgreSQL database designed for a Docker and Kubernetes Masterclass.

## Project Overview

This project demonstrates a RESTful API for a Product Catalog service with the following features:
- Product CRUD operations
- Search and filter products
- Containerization with Docker
- Orchestration with Kubernetes

## Technology Stack

- Java 17
- Spring Boot 3.1.5
- Spring Data JPA
- PostgreSQL Database
- Docker
- Kubernetes
- OpenAPI/Swagger for API documentation

## Project Structure

```
├── src/main/java/com/masterclass/productcatalog/
│   ├── controller/       # REST API controllers
│   ├── model/            # Entity classes
│   ├── repository/       # Data access layer
│   └── service/          # Business logic layer
├── src/main/resources/
│   └── application.properties  # Application configuration
├── docker-compose.yml    # Docker Compose configuration
├── Dockerfile            # Docker image definition
└── k8s/                  # Kubernetes manifests
    ├── deployment.yaml
    ├── service.yaml
    ├── postgres-deployment.yaml
    ├── postgres-service.yaml
    ├── postgres-pvc.yaml
    ├── postgres-secret.yaml
    ├── ingress.yaml
    └── hpa.yaml
```

## Running the Application

### With Docker Compose

1. Build and run the application:
   ```
   docker-compose up --build
   ```

2. Access the API at http://localhost:8080/api/products
3. Access Swagger UI at http://localhost:8080/swagger-ui.html

### With Kubernetes

1. Build the Docker image:
   ```
   docker build -t product-catalog:latest .
   ```

2. Apply Kubernetes manifests:
   ```
   kubectl apply -f k8s/
   ```

3. Access the API:
   ```
   kubectl port-forward svc/product-catalog-service 8080:8080
   ```

## API Endpoints

- GET /api/products - List all products
- GET /api/products/{id} - Get a product by ID
- POST /api/products - Create a new product
- PUT /api/products/{id} - Update a product
- DELETE /api/products/{id} - Delete a product
- GET /api/products/category/{category} - Filter products by category
- GET /api/products/search?keyword={keyword} - Search products by keyword

## Docker and Kubernetes Features

- Multi-stage Docker build for optimized image size
- Environment variable configuration
- Persistent volume for database data
- Service discovery
- Ingress for external access
- Horizontal Pod Autoscaling
- Resource limits and requests
- Health checks and probes
