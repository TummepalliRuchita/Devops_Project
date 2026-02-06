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

        stage('Run Application (Optional)') {
            steps {
                echo "Running the application... (this is optional)"
                sh 'java -jar target/*.jar &'
            }
        }
    }
}
