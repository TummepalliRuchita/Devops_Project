pipeline {
    agent any

    stages {

        stage('Clone Repository') {
            steps {
                echo "Cloning code from GitHub..."
                git branch: 'main', url: 'https://github.com/TummepalliRuchita/Devops_Project.git'
            }
        }

        stage('Build with Maven') {
            steps {
                echo "Building Spring Boot application..."
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                echo "Building Docker image..."
                sh 'docker build -t Devops_Project:1.0 .'
            }
        }

        stage('Run Docker Container') {
            steps {
                echo "Running Docker container..."
                sh 'docker run -d -p 8080:8080 --name Devops_Project Devops_Project:1.0'
            }
        }
    }
}
