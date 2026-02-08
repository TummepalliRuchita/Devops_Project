pipeline {
    agent any
    stages {

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn -q test'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t springboot-app .'
            }
        }

        
        stage('Run Container and deploy') {
    steps {
        sh '''
            docker rm -f springboot-app || true
            docker run -d --name springboot-app -p 8081:8080 springboot-app
        '''
    }
}


      

    }
}
post {
    success {
        echo 'Deployment successful! Access at http://<EC2_IP>:8081'
    }
    failure {
        echo 'Pipeline failed!'
    }
}
