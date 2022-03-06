# cart
A microservices-demo service that provides shopping carts for users.

This build is built, tested and released by travis.

# API Spec

Checkout the API Spec [here](http://microservices-demo.github.io/api/index?url=https://raw.githubusercontent.com/microservices-demo/carts/master/api-spec/cart.json)

# Build

## Java

`mvn -DskipTests package`

## Docker

`GROUP=weaveworksdemos COMMIT=test ./scripts/build.sh`

# Test

`./test/test.sh < python testing file >`. For example: `./test/test.sh unit.py`

# Run

Java

`mvn spring-boot:run`

Docker Compose(with carts-db)

`GROUP=weaveworksdemos COMMIT=<carts version> MONGO_VERSION=<mongo db version> docker compose -f ./deploy/docker-compose.yml up -d`

# Check

`curl http://localhost:8081/health`

# Use

`curl http://localhost:8081`

# Push

`GROUP=weaveworksdemos COMMIT=test ./scripts/push.sh`
