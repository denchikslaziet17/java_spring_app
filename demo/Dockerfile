# Используем официальный образ JDK
FROM openjdk:17-jdk-slim

# Устанавливаем рабочую директорию внутри контейнера
WORKDIR /app

# Копируем файл JAR вашего приложения в контейнер
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Открываем порт 8080 для доступа к приложению
EXPOSE 8080

# Команда для запуска приложения
ENTRYPOINT ["java", "-jar", "app.jar"]
