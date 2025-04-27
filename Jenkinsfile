pipeline {
    agent any

    tools {
        jdk 'jdk-21'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/KatherineP3101/simple-docker-app.git'
            }
        }

        stage('Build') {
            steps {
                dir('simple-docker-app') {
                    bat 'call mvnw.cmd clean package -DskipTests'
                }
            }
        }

        stage('Docker Build') {
            steps {
                dir('simple-docker-app') {
                    bat 'docker -f docker-app build --build-arg JAR_FILE=simple-docker-app/target/simple-docker-app-0.0.1-SNAPSHOT.jar'
                }
            }
        }

        stage('Deploy') {
            steps {
                dir('simple-docker-app') {
                    bat 'docker -f docker-app up -d'
                }
            }
        }
    }
}