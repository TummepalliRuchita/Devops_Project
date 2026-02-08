pipeline {
    agent any
    stages {

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t springboot-app .'
            }
        }

        
        stage('Run Container') {
            steps {
                sh '''
                    docker rm -f springboot-app || true
                    docker run -d --name springboot-app -p 8081:8080 springboot-app
                '''
            }
        }


      

    }
}
